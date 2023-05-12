package com.emp.model;

import java.io.Serializable;

public class EmployeePojo implements Serializable {
	
	public int employeeId;
	public String employeeName;
	public String employeeRole;
	public int employeeSalary;
	public String employeeCity;
	public int employeeexperience;
	
	public EmployeePojo() {}
	
	public EmployeePojo(int employeeId, String employeeName, String employeeRole, int employeeSalary,
			String employeeCity, int employeeexperience) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
		this.employeeCity = employeeCity;
		this.employeeexperience = employeeexperience;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeCity == null) ? 0 : employeeCity.hashCode());
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + ((employeeRole == null) ? 0 : employeeRole.hashCode());
		result = prime * result + employeeSalary;
		result = prime * result + employeeexperience;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeePojo other = (EmployeePojo) obj;
		if (employeeCity == null) {
			if (other.employeeCity != null)
				return false;
		} else if (!employeeCity.equals(other.employeeCity))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeRole == null) {
			if (other.employeeRole != null)
				return false;
		} else if (!employeeRole.equals(other.employeeRole))
			return false;
		if (employeeSalary != other.employeeSalary)
			return false;
		if (employeeexperience != other.employeeexperience)
			return false;
		return true;
	}
	
	

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	public int getEmployeeexperience() {
		return employeeexperience;
	}

	public void setEmployeeexperience(int employeeexperience) {
		this.employeeexperience = employeeexperience;
	}

	@Override
	public String toString() {
		return "EmployeePojo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + ", employeeSalary=" + employeeSalary + ", employeeCity=" + employeeCity
				+ ", employeeexperience=" + employeeexperience + "]";
	}
	
	
	
	

}
