package com.ojas.otrial.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/otrial/api/")
public class ChandraPrakash_Controller {
	@GetMapping("/display/{name}")
	public Map display(@PathVariable("name")String name) {
		HashMap<String ,String> demo=new HashMap<>();
		demo.put("Result", name);
		return demo;
	}

}
