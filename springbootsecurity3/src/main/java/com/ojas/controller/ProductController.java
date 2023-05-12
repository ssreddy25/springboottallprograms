package com.ojas.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.Product;
import com.ojas.entity.UserInfo;
import com.ojas.exception.ProductNotFuondException;
import com.ojas.services.ProductServices;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	private ProductServices productServices;
	
	public ProductController (ProductServices productServices) {
		this.productServices=productServices;
	}
	
	@PostMapping("/user")
	public String addUser(@RequestBody UserInfo user) throws ProductNotFuondException {
		return productServices.adduser(user);
	}
	
	@GetMapping("/wel")
	public String welcomeProduct() {
		return "welcome product page";
	}
	
	@GetMapping("/all")
	@PreAuthorize("hasAuthority('ADMIN')")
	public List<Product> getAll(){
		return productServices.getProduct();
		
	}
	@GetMapping("/{id}")
	@PreAuthorize("hasAuthority('EMPLOYEE')")
	public Optional<Product> getId(@PathVariable int id) throws ProductNotFuondException {
		return productServices.getProductId(id);
	}
	
	

}
