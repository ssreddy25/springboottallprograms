package com.emp.dao;

import java.util.List;

import com.emp.model.EmployeePojo;

public interface EmplyoeeDao {
	
	public String createEmployee(EmployeePojo emp);
	
	public EmployeePojo viewEmployee(int empid);
	
	public List<EmployeePojo> viewAllEmployee();
	
	public String deleteEmplyoee(int empid);
	
	public String editEmplyoee(int empid ,EmployeePojo updatedemp);

}
