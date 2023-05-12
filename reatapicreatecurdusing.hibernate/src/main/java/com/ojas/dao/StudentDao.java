package com.ojas.dao;

import java.util.List;

import com.ojas.model.Student;

public interface StudentDao {
	
	public String createStudent(String studentname,String studentLname,int studentMarks);
	
	public List<Student> viewStudent(int studentId);
	
	public List<Student> viewAllStudent();
	
	public String updateStudent(int studentId,String studentname,String studentLname,int studentMarks);
	
	public String deleteStudent(int studentId);
	

}
