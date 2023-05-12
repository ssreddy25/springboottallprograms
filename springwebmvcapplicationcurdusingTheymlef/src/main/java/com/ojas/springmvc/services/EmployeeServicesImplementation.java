package com.ojas.springmvc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.springmvc.entity.EmloyeeEntity;
import com.ojas.springmvc.model.Employee;
import com.ojas.springmvc.repositery.EmployeeRepositery;

@Service
public class EmployeeServicesImplementation implements EmployeeServices {
	
	@Autowired
	private EmployeeRepositery employeeRepositery;

	@Override
	public void addEmloyee(Employee emp) {
		
		EmloyeeEntity employee=new EmloyeeEntity();
		//copy the model object into a entityobject
		BeanUtils.copyProperties(emp, employee);
		
		employeeRepositery.save(employee);
		
	}

	@Override
	public Employee getEmoloyee(int id) {
		
		Employee emp=new Employee();
		Optional<EmloyeeEntity> employee  =employeeRepositery.findById(id);
		BeanUtils.copyProperties(employee, emp);
		
		
		
		return emp;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> emploe=new ArrayList<>();
		List<EmloyeeEntity> employess=employeeRepositery.findAll();
		
		
		
		for(EmloyeeEntity emp:employess) {
			Employee employee=new Employee();
			
			BeanUtils.copyProperties(emp, employee);
			
			emploe.add(employee);
		}
		
		
//		emploe.forEach(data->System.out.println(data));
		
		
		return emploe;
	}

	@Override
	public void deleteEmployee(int id) {
		
		employeeRepositery.deleteById(id);
		
	}

}
