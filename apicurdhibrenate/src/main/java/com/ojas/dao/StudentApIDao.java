package com.ojas.dao;

import java.util.List;

import com.ojas.model.StudentApi;

public interface StudentApIDao {
	
public String createStudent(String studentname,String studentLname,int studentMarks);
	
	public StudentApi viewStudent(int studentId);
	
	public List<StudentApi> viewAllStudent();
	
	public String updateStudent(int studentId,String studentname,String studentLname,int studentMarks);
	
	public String deleteStudent(int studentId);

}
