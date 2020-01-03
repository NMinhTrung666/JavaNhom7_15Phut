package com.giangthanh15p.giangthanh15p;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller //Cau 2
//@RestController //Cau 1
public class ThuCungConTroller {
	@Autowired
	ThuCungService service;
	@RequestMapping(value="/getallthucung")
	public List<ThuCung> getallconnguoi(){
		return service.getAllDataThuCung();
	}
	@RequestMapping(value="/insert")
	public boolean Insert(@RequestBody ThuCung thucung) {
		service.Insert(thucung);
		return true;
	}
	@RequestMapping(value="/deleteOne")
	public boolean deleteOne(@RequestBody ThuCung thucung) {
		service.deleteOneThuCung(thucung.getMathucung());
		return true;
	}
	@RequestMapping(value="/update")
	public boolean update(@RequestBody ThuCung connguoi) {
		service.update(connguoi);
		return true;
	}
	@RequestMapping(value = "/getAllDateSearch")
	public List<ThuCung> getAll(@RequestParam(name = "chungloai") String chungloai,@RequestParam(name = "gioitinh") String gioitinh){
		System.out.println(chungloai);
		System.out.println(gioitinh);
		return service.getAllThuCung(chungloai, gioitinh);
	}
	@RequestMapping("/")
	public String get() {
		return "form";
	}
	@RequestMapping("/search")
	public String search(@RequestParam(name = "chungloai") String chungloai,@RequestParam(name = "gioitinh") String gioitinh, Model model){
		
		if (StringUtils.isEmpty(chungloai) & StringUtils.isEmpty(gioitinh)) {
            return "redirect:/form";
        }
		
		model.addAttribute("search", service.getAllThuCung(chungloai, gioitinh));
		return "form";	
	}
}
