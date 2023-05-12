package com.ojas.springxml;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ojas.springxml.model.Student;

@Controller
public class HomeController {
	
	List<Student> students;
	
	@RequestMapping("/home")
	public String home(){
		
		return "register";
	}
	@RequestMapping("/p")
	public String helo(){
		return "hii";
	}
	
	@RequestMapping("/details")
	public String details(Model model){
		
		model.addAttribute("fristName", "siva sankar reddy");
		model.addAttribute("lastName", "uppaluru");
		model.addAttribute("marks", "89");
		model.addAttribute("like", "challing");
		
		return "details";
	}
	@RequestMapping("/registers")
	public String display(@ModelAttribute("student") Student student){
		
		//System.out.println(student);
		 students=new ArrayList<Student>();
		
		students.add(student);
		
		students.forEach(System.out::println);
		
		return "register";
		
	}
	
	
	@RequestMapping("/list")
	public String listStudent(Model model){
		
		model.addAttribute("liststu", students);
		
		return "listStudent";
	}

}
