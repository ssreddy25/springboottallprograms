package com.ojas.springmvc.hibernate.springmvchibernateexample.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ojas.springmvc.hibernate.springmvchibernateexample.model.Student;
import com.ojas.springmvc.hibernate.springmvchibernateexample.services.StudentServices;

@Controller
public class HomeController {
	
	@Autowired
	private StudentServices studentServices;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/register" , method=RequestMethod.POST)
	public ModelAndView createStudent(@ModelAttribute Student student,ModelAndView modelandView) {
		
		studentServices.createStudent(student);
		
		modelandView.setViewName("createStudent");
		
		
		return modelandView;
		
		
		
	}
	
	
	
}
