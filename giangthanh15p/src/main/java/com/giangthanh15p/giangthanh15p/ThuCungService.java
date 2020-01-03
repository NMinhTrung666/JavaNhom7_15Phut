package com.giangthanh15p.giangthanh15p;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;



@Service
public class ThuCungService {
	@Autowired
	ThuCungDao service;
	
	public List<ThuCung> getAllDataThuCung() {
		return service.findAll();
	}
	public void Insert (ThuCung thucung) {
		service.save(thucung);
	}
	public void deleteOneThuCung(int mathucung) {
		service.deleteById(mathucung);
	}
	public void update(ThuCung thucung) {
		service.save(thucung);
	}
	public List<ThuCung> getAllThuCung(String chungloai, String gioitinh){
		ThuCung thucung = new ThuCung();
		thucung.setChungloai(chungloai);
		thucung.setGioitinh(gioitinh);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("mathucung")
				.withIgnorePaths("chieucao")
				.withIgnorePaths("cannang")
				.withIgnorePaths("mausac")
				.withIgnorePaths("tuoi");
		return service.findAll(Example.of(thucung,exampleMatcher));
	}
}
