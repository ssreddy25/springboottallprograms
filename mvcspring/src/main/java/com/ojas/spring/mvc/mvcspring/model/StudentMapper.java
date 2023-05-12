package com.ojas.spring.mvc.mvcspring.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int i) throws SQLException {

		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setFristName(rs.getString("fristName"));
		student.setLastName(rs.getString("lastName"));
		student.setMarks(rs.getInt("marks"));
		return student;
	}

}
