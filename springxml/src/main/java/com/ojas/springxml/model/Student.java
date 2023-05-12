package com.ojas.springxml.model;

public class Student {
	
	private String fristName;
	private String lastName;
	private String marks;
	private String city;
	
	public Student(){
		
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [fristName=" + fristName + ", lastName=" + lastName + ", marks=" + marks + ", city=" + city
				+ "]";
	}
	
	

}
