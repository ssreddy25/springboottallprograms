package com.ojas.spring.services;

import java.util.List;
import java.util.Optional;

import com.ojas.spring.entity.Plans;
import com.ojas.spring.entity.PlansHistroy;

public interface PlansServices {
	
	public String addPlans(Plans plans);
	
	public Optional<Plans> getPlan(int id);
	
	public String editPaln(Plans plan);
	
	public String deletePlan(int id);
	
	public List<Plans> getAllPlans();

	public List<PlansHistroy> getAllPlanHistory();
}
