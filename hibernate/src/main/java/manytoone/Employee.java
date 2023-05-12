package manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Employee {
	@Id
	private int  empId;
	private String employeeName;
	private double empSalary;
    
	@ManyToOne(cascade=CascadeType.ALL)
	private Vendor vender;
	
	
	public Employee(){}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	public Vendor getVender() {
		return vender;
	}


	public void setVender(Vendor vender) {
		this.vender = vender;
	}
	
	

}
