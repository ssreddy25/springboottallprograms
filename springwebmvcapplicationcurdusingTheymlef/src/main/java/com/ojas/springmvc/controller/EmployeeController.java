package com.ojas.springmvc.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ojas.springmvc.model.Employee;
import com.ojas.springmvc.services.EmployeeServices;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeServices employeeServices;
	
	
	@RequestMapping("/loadform")
	public String loadForm(Model model) {
		
		Employee emp=new Employee();
		
		model.addAttribute("employee", emp);
		
		return "employeeregister";
		
	}
	
	@RequestMapping(value = "/register" , method =RequestMethod.POST)
	public String addEmployee(@ModelAttribute("employee") Employee emp) {
		
		System.out.println(emp);
		
		employeeServices.addEmloyee(emp);
		
		return "redirect:/loadform";
		
	}
	@RequestMapping(value = "/list")
	public String getAllEmployess(Model model) {
//		System.out.println("all method called");
		List<Employee> employess=employeeServices.getAllEmployee();
		
//		employess.forEach((data)->System.out.println(data));
		
		model.addAttribute("employesslist" ,employess);
		
//		model.addAllAttributes(employess);
		
		return "employeelist";
	}
	@RequestMapping(value = "/deleteemp")
	public String deleteEmployee(@PathVariable ("id") int id ) {
		
		System.out.println("delete method called");
		
		employeeServices.deleteEmployee(id);
		
		return "redirect:/list";
		
	}
	

}
