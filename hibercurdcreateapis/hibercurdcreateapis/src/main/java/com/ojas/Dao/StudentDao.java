package com.ojas.Dao;

import java.util.List;

import com.ojas.model.Student;

public interface StudentDao {
	
	public String createStudent(String fname,String lname,int marks);
	
	public List<Student> viewStudent(int studentId);
	
	public String deleteStudent(int studentId);
	
	public List<Student> viewAllStudent();
	
	public String updateStudent(int id,String fname,String lname,int marks);
	
	
	
	

}
