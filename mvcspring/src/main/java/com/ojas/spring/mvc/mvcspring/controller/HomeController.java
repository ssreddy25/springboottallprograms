package com.ojas.spring.mvc.mvcspring.controller;

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

import com.ojas.spring.mvc.mvcspring.model.Student;
import com.ojas.spring.mvc.mvcspring.services.StudentService;



@Controller
public class HomeController {
	
	@Autowired
	private StudentService studentServices;
	

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	
	
	@RequestMapping("/createcontroller")
	
	public ModelAndView rigister(ModelAndView model){
		
		model.setViewName("createStudent");
		return model;
	}
    
	@RequestMapping(value= "/createstudents")
	public ModelAndView createStudent(@ModelAttribute Student student ,ModelAndView modal) {
		
		String msg=studentServices.createStudent(student);
		modal.addObject("status", msg);
		modal.setViewName("createStudent");
		return modal;

	}
	
	@RequestMapping(value="/loginpage")
	public ModelAndView loginjsp(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}
	
    
	@RequestMapping("/loginform")
	public ModelAndView studentLogin(HttpServletRequest request,ModelAndView modelAndView) {
		int id=Integer.parseInt(request.getParameter("id"));
		String fristName=(String) request.getParameter("fristName");
		
		Student student=studentServices.studentLogin(id, fristName);
		
		if(student==null) {
			modelAndView.addObject("status", "you enter worng userid and username try agian");
			modelAndView.setViewName("login");
			return modelAndView;
		}
		else {
			modelAndView.addObject("status", "welcome to student login page successfully ");
			modelAndView.setViewName("studentafterlogin");
			return modelAndView;
		}
		
		

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
