package oto.example.oto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller //cau 2
//@RestController // cau 1
public class OtoController {
	@Autowired
	OtoService service;
	@RequestMapping(value="/getalloto")
	public List<Oto> getalloto(){
		return service.getAllDataOto();
	}
	@RequestMapping(value="/insert")
	public boolean Insert(@RequestBody Oto oto) {
		service.Insert(oto);
		return true;
	}
	@RequestMapping(value="/deleteOne")
	public boolean deleteOne(@RequestBody Oto oto) {
		service.deleteOneOto(oto.getMaoto());
		return true;
	}
	@RequestMapping(value="/update")
	public boolean update(@RequestBody Oto oto) {
		service.update(oto);
		return true;
	}
	@RequestMapping(value = "/getAllDateTime")
	public List<Oto> getAll(@RequestParam(name = "hangoto") String hangoto,@RequestParam(name = "gia") Integer gia){
		System.out.println(hangoto);
		System.out.println(gia);
		return service.getAllHangOtoGia(hangoto, gia);
	}
	@RequestMapping("/")
	public String get() {
		return "form";
	}
	@RequestMapping("/search")
	public String search(@RequestParam(name = "hangoto") String hangoto,@RequestParam(name = "gia") Integer gia, Model model){
		
		if (StringUtils.isEmpty(hangoto) & StringUtils.isEmpty(gia)) {
            return "redirect:/form";
        }
		
		model.addAttribute("search", service.getAllHangOtoGia(hangoto, gia));
		return "form";	
	}
}
