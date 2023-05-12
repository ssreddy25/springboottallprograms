package com.ojas.spring.springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ojas.spring.springmvc.model.Student;
import com.ojas.spring.springmvc.services.StudentService;

@Controller
@RequestMapping("/student")
public class HomeController {

	@Autowired
	private StudentService studentServices;
	
	@RequestMapping("/hhh")
	@ResponseBody
	public ModelAndView rigister(ModelAndView model){
		System.out.println("student create table");
		model.setViewName("createStudent");
		return model;
	}
    
	@RequestMapping("/createstudents/")
	public ModelAndView createStudent(@ModelAttribute Student student ,ModelAndView modal) {
		
		String msg=studentServices.createStudent(student);
		modal.addObject("status", msg);
		modal.setViewName("createStudent");
		return modal;

	}
    
	@RequestMapping("/studentlogin/")
	public ModelAndView studentLogin(HttpServletRequest request) {
		return null;

	}
	@RequestMapping(value = "/deleteContact", method = RequestMethod.GET)
	public ModelAndView listOFStudent(ModelAndView modelAndView) {
		return modelAndView;

	}
    
	@RequestMapping("/updatestudent")
	public ModelAndView updateStudent(@ModelAttribute Student student) {
		return null;

	}
    
	@RequestMapping(value = "/deletestudent", method = RequestMethod.DELETE)
	public ModelAndView deleteStudent(HttpServletRequest request) {
		return null;

	}
    
	@RequestMapping(value = "/getstudent", method = RequestMethod.GET)
	public ModelAndView getStudentbyId(HttpServletRequest request ) {
		return null;

	}
}
