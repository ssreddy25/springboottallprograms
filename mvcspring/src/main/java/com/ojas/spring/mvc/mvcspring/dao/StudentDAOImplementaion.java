package com.ojas.spring.mvc.mvcspring.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ojas.spring.mvc.mvcspring.model.Student;
import com.ojas.spring.mvc.mvcspring.model.StudentMapper;

@Repository
public class StudentDAOImplementaion implements Studentdao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public StudentDAOImplementaion(DataSource dataSource) {

		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public String createStudent(Student student) {

		boolean msg = jdbcTemplate.update("insert into student(id,fristName,lastName,marks) values(?,?,?,?)",
				student.getId(), student.getFristName(), student.getLastName(), student.getMarks()) > 0;
		if (msg == true) {
			return "student data inserted into database";
		}
		return "student data not inserted into database";
	}

	@Override
	public Student studentLogin(int id, String fristName) {
		
		Student student=jdbcTemplate.queryForObject("select * from student where id=? and fristName=?", new Object[]{id,fristName}, new StudentMapper());

		return student;
	}

	@Override
	public List<Student> listOFStudent() {
		
		List<Student> students=jdbcTemplate.query("select * form student ",  new StudentMapper());
		
		return students;
	}

	@Override
	public String updateStudent(Student student) {
		
	boolean msg=	jdbcTemplate.update("update student set(fristName=?, lastName=?, marks=?) where id=?",student.getFristName(), student.getLastName(), student.getMarks(),student.getId() )>0;
	if (msg == true) {
		return "student data  updated into database";
	}
	return "student data not updated into database";
	}

	@Override
	public String deleteStudent(int id) {
		
		boolean msg=jdbcTemplate.update("delete form student where id=?", id)>0;
		
		if (msg == true) {
			return "student data  deleted into database";
		}
		return "student data not deleted into database";
		}
	

	@Override
	public Student getStudentbyId(int id) {
		
//		Student student=(Student) jdbcTemplate.queryForList("select * from student where id=? ", id ,new StudentMapper());
		
		Student studetn1=jdbcTemplate.queryForObject("select * from student where id=?", new Object[] {id},new StudentMapper() );
	
		return studetn1;
	}

}
