package com.ojas.springmvc.hibernate.springmvchibernateexample.services;

import java.util.List;

import com.ojas.springmvc.hibernate.springmvchibernateexample.model.Student;

public interface StudentServices {
	
	
public void createStudent(Student student);
	
	public Student loginStudent(int id,String studentFristName);
	
	public List<Student> getAllStudent();
	
	public Student getByStudentId(int id);
	
	public void deleteByStudentId(int id);
	
	public void updateStudent(Student student);

}
