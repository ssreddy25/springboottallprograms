package com.ojas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StudentApi {
	
	@Id
	@GeneratedValue
	private int studentId;
	private String studentName;
	private String studentLname;
	private int studentMarks;
	public StudentApi() {
		
	}
	public StudentApi(int studentId, String studentName, String studentLname, int studentMarks) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentLname = studentLname;
		this.studentMarks = studentMarks;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentLname() {
		return studentLname;
	}
	public void setStudentLname(String studentLname) {
		this.studentLname = studentLname;
	}
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "StudentApi [studentId=" + studentId + ", studentName=" + studentName + ", studentLname=" + studentLname
				+ ", studentMarks=" + studentMarks + "]";
	}
	
	
	

}
