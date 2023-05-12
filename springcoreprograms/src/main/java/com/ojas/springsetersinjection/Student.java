package com.ojas.springsetersinjection;

public class Student {
	
	private String studentName;
	private String studentMarks;
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentMarks(String studentMarks) {
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentMarks=" + studentMarks + "]";
	}
	
	

}
