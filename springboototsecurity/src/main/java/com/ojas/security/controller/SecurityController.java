package com.ojas.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	
	
	
	@GetMapping("/contact")
	public String greet1() {
		
		return "wlecome to the ojas family"+9152455;
	}
	
	@GetMapping("/home")
	public String greet112() {
		
		return "wlecome to the ojas family";
	}
	
	@GetMapping("/balance")
	public String greet122() {
		
		return "wlecome to the ojas family"+4365493;
	}
	@GetMapping("/statement")
	public String greet11() {
		
		return "wlecome to the ojas family"+"statement";
	}
	@GetMapping("/loan")
	public String greet12() {
		
		return "wlecome to the ojas family"+"loan";
	}

}
