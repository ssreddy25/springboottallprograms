package com.ojas.springmvc.hibernate.springmvchibernateexample.dao;

import java.util.List;

import com.ojas.springmvc.hibernate.springmvchibernateexample.model.Student;

public interface StudentDao {
	
	public void createStudent(Student student);
	
	public Student loginStudent(int id,String studentFristName);
	
	public List<Student> getAllStudent();
	
	public Student getByStudentId(int id);
	
	public void deleteByStudentId(int id);
	
	public void updateStudent(Student student);
	
	
	
	

}
