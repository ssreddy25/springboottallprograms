package com.ojas.otrial.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/otrial/api/")
public class SivaSankarReddyUppaluru_Controller {
	
	
	@GetMapping("/displayname_{name}")
	public Map greetingMethod(@PathVariable String name) {
		
	Map<String ,String > data=new HashMap<>();
	
	data.put("Result", "Hello "+name);
	
	return data;
	
		
	}
	
	
	

}
