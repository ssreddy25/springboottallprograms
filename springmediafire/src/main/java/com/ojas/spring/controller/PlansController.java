package com.ojas.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.spring.entity.Plans;
import com.ojas.spring.entity.PlansHistroy;
import com.ojas.spring.services.PlansServices;

@RestController
public class PlansController {

	@Autowired
	private PlansServices plansServices;
   
	@PostMapping("/addplan")
	public String addPlans(@RequestBody Plans plans) {
		
		return plansServices.addPlans(plans);
		 

	}
    @GetMapping("/getplan/{id}")
	public Optional<Plans> getPlan(@PathVariable("id") int id) {
		
		return plansServices.getPlan(id);

	}

    @PutMapping("/update")
	public String editPaln(@RequestBody Plans plans) {
		return plansServices.editPaln(plans);

	}
    
    @DeleteMapping("/delete/{id}")
	public String deletePlan(@PathVariable("id") int id) {
		
		return plansServices.deletePlan(id);

	}
    
    @GetMapping("/getall")
    public List<Plans> getAllPlans(){
    	
    	return plansServices.getAllPlans();
    }
    
    @GetMapping("/planhistory")
    public List<PlansHistroy> getAllPlanHistory(){
    	
    	System.out.println("hi");
    	
    	return plansServices.getAllPlanHistory();
    	
    }

}
