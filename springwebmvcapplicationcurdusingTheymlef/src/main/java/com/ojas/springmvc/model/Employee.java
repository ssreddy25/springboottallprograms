package com.ojas.springmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	
	private int empId;
	private String empFristName;
	private String empLastName;
	private double empSalary;
	private int empExpericence;
	

}
