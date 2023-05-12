package com.ojas.dao;

import java.util.List;

import com.ojas.modal.Student;

public interface StudentDAO {
	
	public String createStudent(int sid,String saname,String slanme,String mail,String mobile);
	
	public Student viewStudent(int studentId);
	
	public String updateStudent(int sid,String saname,String slanme,String mail,String mobile);
	
	public String deleteStudent(int studentId);
	
	public List<Student> viewAllStudent();

}
