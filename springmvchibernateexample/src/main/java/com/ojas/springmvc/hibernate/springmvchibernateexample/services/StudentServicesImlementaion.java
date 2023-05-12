package com.ojas.springmvc.hibernate.springmvchibernateexample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.springmvc.hibernate.springmvchibernateexample.dao.StudentDao;
import com.ojas.springmvc.hibernate.springmvchibernateexample.model.Student;

@Service
public class StudentServicesImlementaion implements StudentServices {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public void createStudent(Student student) {
		
		studentDao.createStudent(student);
	}

	@Override
	public Student loginStudent(int id, String studentFristName) {
		
		return studentDao.loginStudent(id, studentFristName);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentDao.getAllStudent();
	}

	@Override
	public Student getByStudentId(int id) {
		
		return studentDao.getByStudentId(id);
	}

	@Override
	public void deleteByStudentId(int id) {
		
		studentDao.deleteByStudentId(id);
		
	}

	@Override
	public void updateStudent(Student student) {
		
		studentDao.updateStudent(student);
	}

}
