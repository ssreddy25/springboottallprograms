package com.ojas.spring.mvc.mvcspring.services;

import java.util.List;

import com.ojas.spring.mvc.mvcspring.model.Student;

public interface StudentService {
	
public String createStudent(Student student);
	
	public Student studentLogin(int id,String fristName);
	
	public List<Student> listOFStudent();
	
	public String updateStudent(Student student);
	
	public String deleteStudent(int id);
	
	public Student getStudentbyId(int id);

}
