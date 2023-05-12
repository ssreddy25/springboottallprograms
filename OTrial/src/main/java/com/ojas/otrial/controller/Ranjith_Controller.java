package com.ojas.otrial.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/otrial")
public class Ranjith_Controller {
	
	@GetMapping("/display_name_{name}")
	public Map display_name(@PathVariable String name) {
		Map<String, String> map=new HashMap<>();
		map.put("result","Hello "+name);
		return map;
	}
	
}
