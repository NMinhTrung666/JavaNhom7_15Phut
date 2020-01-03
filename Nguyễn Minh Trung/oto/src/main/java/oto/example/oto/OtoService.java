package oto.example.oto; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

@Service
public class OtoService {
	@Autowired
	OtoDAO service;
	public List<Oto> getAllDataOto() {
		return service.findAll();
	}
	public void Insert (Oto oto) {
		service.save(oto);
	}
	public void deleteOneOto(Integer maoto) {
		service.deleteById(maoto);
	}
	public void update(Oto oto) {
		service.save(oto);
	}
	public List<Oto> getAllHangOtoGia(String hangoto, Integer gia){
		Oto oto = new Oto();
		oto.setHangoto(hangoto);
		oto.setGia(gia);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("maoto")
				.withIgnorePaths("ngaysanxuat")
				.withIgnorePaths("mauoto")
				.withIgnorePaths("kichthuoc")
				.withIgnorePaths("dongco");
		return service.findAll(Example.of(oto,exampleMatcher));
	}

}
