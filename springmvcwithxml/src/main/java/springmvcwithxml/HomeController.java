package springmvcwithxml;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HomeController {
	@ResponseBody
	@RequestMapping("/ge")
	public String hello(){
		
		return "welcome to spring mve session";
	}

}
