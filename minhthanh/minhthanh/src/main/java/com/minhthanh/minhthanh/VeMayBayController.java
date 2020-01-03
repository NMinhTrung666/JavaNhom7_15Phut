package com.minhthanh.minhthanh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class VeMayBayController {
	@Autowired
	VeMayBayService service;
	
	// a. get all
	@CrossOrigin(value = "*")   
	@RequestMapping(value = "/getall")
	public List<VeMayBayDTO> getAlltime(VeMayBay veMayBay){
		return service.getAlltime(veMayBay);
	}
	
	// b. insert one 
	@RequestMapping(value = "/insertOne")
	public boolean insertOneThueSach(@RequestBody VeMayBay veMayBay) {
		service.insertOne(veMayBay);
		return true;
	}
	
	// c. delete one 
	@RequestMapping(value= "/deleteOneSinhVien")
	public boolean deleteOneSinhVien(@RequestBody VeMayBay veMayBay) {
		service.deleteOneSinhVien(veMayBay.getId());
		return true;
	}
	
	// d. update one 
	@RequestMapping(value= "/updateOneSinhVien")
	public boolean updateOneSinhVien(@RequestBody VeMayBay veMayBay) {
		service.updateOneSinhVien(veMayBay);
		return true;
	}
	
	// e.search
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/search")
	public List<VeMayBay> getAllBynoiDinoiDenngayDi(	@RequestParam(name = "noiDi") String noiDi, 
													@RequestParam(name = "noiDen") String noiDen,
													@RequestParam(name = "ngayDi") String ngayDi){
		return service.getAllBynoiDinoiDenngayDi(noiDi, noiDen, ngayDi);
	}
	
}
