package com.ojas.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ojas.springmvc.model.Product;
import com.ojas.springmvc.services.ProductServices;

@Controller
@RequestMapping("/curd")
public class ProductController {
	
	@Autowired
	private ProductServices services;
	@RequestMapping("/rigister")
	public String home(Model model) {
		System.out.println("siva ss");
		Product pro=new Product();
		
		model.addAttribute("product", pro);
		
		return "addproduct";
		
	}
	
	@RequestMapping("/insert")
	public String addProduct(@ModelAttribute("product") Product product ,Model model) {
		
		String msg=services.addProduct(product);
		System.out.println("data soted");
		model.addAttribute("msg", msg);
		
		return "redirect:/curd/rigister";
		
	}
	
	

}
