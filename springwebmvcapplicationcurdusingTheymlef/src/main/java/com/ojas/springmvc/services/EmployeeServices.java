package com.ojas.springmvc.services;

import java.util.List;

import com.ojas.springmvc.model.Employee;

public interface EmployeeServices {
	
	
	public void addEmloyee(Employee emp);
	
	public Employee getEmoloyee(int id);
	
	public List<Employee> getAllEmployee();
	
	
	public void deleteEmployee(int id);
	
	

}
