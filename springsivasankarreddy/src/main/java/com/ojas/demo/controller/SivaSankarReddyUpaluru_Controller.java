package com.ojas.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SivaSankarReddyUpaluru_Controller {
	
	
	@GetMapping("/displayname_{name}")

	public Map display_name(@PathVariable String name) {

	Map<String, String> map=new HashMap<>();

	map.put("result","heloo "+name);

	return map;

	}

}
