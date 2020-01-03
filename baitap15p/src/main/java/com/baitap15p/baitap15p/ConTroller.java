package com.baitap15p.baitap15p;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
//@RestController
public class ConTroller {
	@Autowired
	ConNguoiService service;
	@RequestMapping(value="/getallconnguoi")
	public List<ConNguoi> getallconnguoi(){
		return service.getAllDataconnguoi();
	}
	@RequestMapping(value="/insert")
	public boolean Insert(@RequestBody ConNguoi connguoi) {
		service.Insert(connguoi);
		return true;
	}
	@RequestMapping(value="/deleteOne")
	public boolean deleteOne(@RequestBody ConNguoi connguoi) {
		service.deleteOneconnguoi(connguoi.getCmnd());
		return true;
	}
	@RequestMapping(value="/update")
	public boolean update(@RequestBody ConNguoi connguoi) {
		service.update(connguoi);
		return true;
	}
	@RequestMapping(value = "/getAllDateTime")
	public List<ConNguoi> getAll(@RequestParam(name = "ten") String ten,@RequestParam(name = "diachi") String diachi){
		System.out.println(ten);
		System.out.println(diachi);
		return service.getAllConNguoi(ten, diachi);
	}
	@RequestMapping("/")
	public String get() {
		return "form";
	}
	@RequestMapping("/search")
	public String search(@RequestParam(name = "ten") String ten,@RequestParam(name = "diachi") String diachi, Model model){
		
		if (StringUtils.isEmpty(ten) & StringUtils.isEmpty(diachi)) {
            return "redirect:/form";
        }
		
		model.addAttribute("search", service.getAllConNguoi(ten, diachi));
		return "form";	
	}
}
