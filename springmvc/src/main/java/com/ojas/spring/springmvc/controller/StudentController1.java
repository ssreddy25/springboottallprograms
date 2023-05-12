package com.ojas.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController1 {
	
	@RequestMapping("student")
	public ModelAndView home(ModelAndView view) {
		
		return new ModelAndView("/home");
	}

}
