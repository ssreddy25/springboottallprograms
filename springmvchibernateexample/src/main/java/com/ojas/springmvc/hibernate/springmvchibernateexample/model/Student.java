package com.ojas.springmvc.hibernate.springmvchibernateexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int studentId;
	private String studentFristName;
	private String studentLastName;
	private int studentMarks;
	private String studentAddress;
	
	
	public Student() {
		
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentFristName() {
		return studentFristName;
	}


	public void setStudentFristName(String studentFristName) {
		this.studentFristName = studentFristName;
	}


	public String getStudentLastName() {
		return studentLastName;
	}


	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}


	public int getStudentMarks() {
		return studentMarks;
	}


	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFristName=" + studentFristName + ", studentLastName="
				+ studentLastName + ", studentMarks=" + studentMarks + ", studentAddress=" + studentAddress + "]";
	}
	
	

}
