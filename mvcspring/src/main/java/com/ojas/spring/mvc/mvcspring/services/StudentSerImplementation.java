package com.ojas.spring.mvc.mvcspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.spring.mvc.mvcspring.dao.StudentDAOImplementaion;
import com.ojas.spring.mvc.mvcspring.dao.Studentdao;
import com.ojas.spring.mvc.mvcspring.model.Student;

@Service
public class StudentSerImplementation implements StudentService {
	
	@Autowired
	private Studentdao studentdaoimplementains;

	@Override
	public String createStudent(Student student) {
		
		return studentdaoimplementains.createStudent(student);
	}

	@Override
	public Student studentLogin(int id, String fristName) {
		
		return studentdaoimplementains.studentLogin(id, fristName);
	}

	@Override
	public List<Student> listOFStudent() {
		
		return studentdaoimplementains.listOFStudent();
	}

	@Override
	public String updateStudent(Student student) {
		
		return studentdaoimplementains.updateStudent(student);
	}

	@Override
	public String deleteStudent(int id) {
		
		return studentdaoimplementains.deleteStudent(id);
	}

	@Override
	public Student getStudentbyId(int id) {
		
		return studentdaoimplementains.getStudentbyId(id);
	}

}
