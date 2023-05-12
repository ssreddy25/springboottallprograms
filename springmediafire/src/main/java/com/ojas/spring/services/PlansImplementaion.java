package com.ojas.spring.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.spring.entity.Plans;
import com.ojas.spring.entity.PlansHistroy;
import com.ojas.spring.repositery.PlansHistoryRepository;
import com.ojas.spring.repositery.PlansRepository;

@Service
public class PlansImplementaion implements PlansServices {

	@Autowired
	private PlansRepository repo;
	
	@Autowired
	private PlansHistoryRepository plansHistoryRepository;

	@Override
	public String addPlans(Plans plans) {

		PlansHistroy planHistory=new PlansHistroy();
		

		if (plans != null) {
			repo.save(plans);
			//here add plans data added to planhistrory 
			planHistory.setName(plans.getName());
			planHistory.setPrice(plans.getPrice());
			planHistory.setStorage(plans.getStorage());
			planHistory.setDescription(plans.getDescription());
			planHistory.setPublishedDate(LocalDate.now());
			plansHistoryRepository.save(planHistory);
			
			return " plan data inserted sucessfully";
		}

		return "plan data not inserted sucessfully";
	}

	@Override
	public Optional<Plans> getPlan(int id) {

		Optional<Plans> plans = repo.findById(id);

		return plans;
	}

	@Override
	public String editPaln(Plans plan) {

		PlansHistroy planHistory=new PlansHistroy();

		if (plan != null) {

			repo.saveAndFlush(plan);
			planHistory.setName(plan.getName());
			planHistory.setPrice(plan.getPrice());
			planHistory.setStorage(plan.getStorage());
			planHistory.setDescription(plan.getDescription());
			planHistory.setPublishedDate(LocalDate.now());
			plansHistoryRepository.save(planHistory);
			
			return "plans data updated sucesfully";

		}

		return "plans data not updated sucesfully";
	}

	@Override
	public String deletePlan(int id) {

		repo.deleteById(id);

		Optional<Plans> plan = getPlan(id);

		if (plan != null) {

			
			return "plans data  deleted";

		}

		return "plans data not deleted ";

	}

	@Override
	public List<Plans> getAllPlans() {
		
		return repo.findAll() ;
	}

	@Override
	public List<PlansHistroy> getAllPlanHistory() {
		
		return plansHistoryRepository.findAll();
	}

}
