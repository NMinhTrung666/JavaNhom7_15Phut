package com.minhthanh.minhthanh;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class VeMayBayService {
	@Autowired
	VeMayBayDAO dao;
	
	// a. get all
	@Cacheable(value = "thuexe")
	public List<VeMayBayDTO> getAlltime(VeMayBay veMayBay){
		List<VeMayBayDTO> ThueXeDTOs = new ArrayList<VeMayBayDTO>();
		List<VeMayBay> vemb = dao.findAll();
		
		for (VeMayBay Ve: vemb) {
			VeMayBayDTO dto = new VeMayBayDTO();
			dto.setMaVe(Ve.getMaVe());
			dto.setGiaTien(Ve.getGiaTien());
			dto.setGioDen(Ve.getGioDen());
			dto.setGioDi(Ve.getGioDi());
			dto.setNgayDi(Ve.getNgayDi());
			dto.setNoiDen(Ve.getNoiDen());
			dto.setNoiDi(Ve.getNoiDi());
			dto.setTgDi(Ve.getGioDen() - Ve.getGioDi());
			ThueXeDTOs.add(dto);
		}
		return ThueXeDTOs;
	}
	
	// b. insert one 
	public void insertOne(VeMayBay veMayBay) {
		dao.save(veMayBay);
	}
	
	// c. delete one 
	public void deleteOneSinhVien(Integer id) {
		dao.deleteById(id);
	}
	
	// d. update one
	public void updateOneSinhVien(VeMayBay veMayBay) {
		dao.save(veMayBay);
	}
	
	// e. search
	public List<VeMayBay> getAllBynoiDinoiDenngayDi(String noiDi, String noiDen, String ngayDi){
		VeMayBay thuexe = new VeMayBay();
		thuexe.setNoiDi(noiDi);
        thuexe.setNoiDen(noiDen);
        thuexe.setNgayDi(ngayDi);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("maXe")
				.withIgnorePaths("gioDi")
				.withIgnorePaths("gioDen")
				.withIgnorePaths("giaTien")
				.withIgnorePaths("soGhe")
				.withIgnorePaths("noiDen")
				.withIgnorePaths("ngayDi");
		
		return dao.findAll(Example.of(thuexe,exampleMatcher));
	}
	
	
	
}
