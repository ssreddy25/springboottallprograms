package com.ojas.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ojas.web.model.User;
import com.ojas.web.services.UserServices;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServices userServices;
	
	@GetMapping("/register")
	public String userPage() {
		
//		User user=new User();
//		
//		model.addAttribute("user", user);
		
		
		return "sivasankarreddy";
		
	}
	
	@RequestMapping("/save")
	public String userSave(@ModelAttribute User user ,Model model) {
		
		String msg=userServices.saveUser(user);
		
		model.addAttribute("msg", msg);
		
		return "UserRegister.jsp";
		
	}

}
