package com.ojas.reactive.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.reactive.dto.Customer;
import com.ojas.reactive.services.CustomerServices;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/re")
public class CustomerController {

	@Autowired
	private CustomerServices customerServices; 
	
	@GetMapping("")
	public List<Customer> getCustomer(){
		return customerServices.getCustomer();
		
	}
	@GetMapping(value= "/stream")
	public Flux<Customer>  fluxgetCustomer(){
		return customerServices.fluxgetCustomer();
	}
}
