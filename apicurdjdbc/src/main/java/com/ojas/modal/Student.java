package com.ojas.modal;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studetntLname;
	private String studentEmail;
	private String studentMobile;
	
	
	public Student(){}


	public Student(int studentId, String studentName, String studetntLname, String studentEmail, String studentMobile) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studetntLname = studetntLname;
		this.studentEmail = studentEmail;
		this.studentMobile = studentMobile;
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


	public String getStudetntLname() {
		return studetntLname;
	}


	public void setStudetntLname(String studetntLname) {
		this.studetntLname = studetntLname;
	}


	public String getStudentEmail() {
		return studentEmail;
	}


	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}


	public String getStudentMobile() {
		return studentMobile;
	}


	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studetntLname=" + studetntLname
				+ ", studentEmail=" + studentEmail + ", studentMobile=" + studentMobile + "]";
	}
	
	

}
