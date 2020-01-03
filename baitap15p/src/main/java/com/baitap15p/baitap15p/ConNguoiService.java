package com.baitap15p.baitap15p;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;



@Service
public class ConNguoiService {
	@Autowired
	ConNguoiDao service;
	
	public List<ConNguoi> getAllDataconnguoi() {
		return service.findAll();
	}
	public void Insert (ConNguoi connguoi) {
		service.save(connguoi);
	}
	public void deleteOneconnguoi(int cmnd) {
		service.deleteById(cmnd);
	}
	public void update(ConNguoi connguoi) {
		service.save(connguoi);
	}
	public List<ConNguoi> getAllConNguoi(String ten, String diachi){
		ConNguoi connguoi = new ConNguoi();
		connguoi.setTen(ten);
		connguoi.setDiachi(diachi);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("cmnd")
				.withIgnorePaths("ngaysinh")
				.withIgnorePaths("gioitinh")
				.withIgnorePaths("sdt")
				.withIgnorePaths("congviec");
		return service.findAll(Example.of(connguoi,exampleMatcher));
	}
}
