package com.ojas.springmvc.hibernate.springmvchibernateexample.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ojas.springmvc.hibernate.springmvchibernateexample.model.Student;

@Repository
@Transactional
public class StudentDaoImplementation implements StudentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void createStudent(Student student) {
		
		hibernateTemplate.save(student);
	
		
	}

	@Override
	public Student loginStudent(int id, String studentFristName) {
		
		return hibernateTemplate.load(Student.class, id);
		
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		return hibernateTemplate.loadAll(Student.class) ;
	}

	@Override
	public Student getByStudentId(int id) {
		
		return hibernateTemplate.load(Student.class, id);
	}

	@Override
	public void deleteByStudentId(int id) {
		
		Student student=hibernateTemplate.load(Student.class, id);
		
		hibernateTemplate.delete(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		
		hibernateTemplate.update(student);
	}

}
