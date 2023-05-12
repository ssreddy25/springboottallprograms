package com.ojas.reactive.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.reactive.dao.CustomerDao;
import com.ojas.reactive.dto.Customer;

import reactor.core.publisher.Flux;

@Service
public class CustomerServices {
	
	@Autowired
	private CustomerDao customerDao;
	
	
	public List<Customer> getCustomer(){
		long start =System.currentTimeMillis();
		List<Customer> customer = customerDao.getCustomer();
		long end =System.currentTimeMillis();
		
		System.out.println(start +"fkhf"+end);
		
		return customer;
		
		
	}
	
	public Flux<Customer> fluxgetCustomer(){
		long start =System.currentTimeMillis();
		Flux<Customer> customer =  customerDao.fluxCustomer();
		long end =System.currentTimeMillis();
		
		System.out.println(start +"fkhf"+end +""+(start-end));
		
		return customer;
		
		
	}

}
