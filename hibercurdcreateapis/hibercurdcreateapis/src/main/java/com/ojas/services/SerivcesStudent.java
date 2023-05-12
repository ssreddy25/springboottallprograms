package com.ojas.services;

import java.util.List;


import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.ojas.Dao.StudentDao;
import com.ojas.Dao.StudentDaoImplementation;
import com.ojas.model.Student;

@Path("/curd")
public class SerivcesStudent {

	StudentDao studentdao = new StudentDaoImplementation();

	@POST
	@Path("/crate/{fname}/{lname}/{marks}")
	public String createStudent(@PathParam("fname") String fname, @PathParam("lname") String lname,
			@PathParam("marks") int marks) {

		return studentdao.createStudent(fname, lname, marks);
	}
     
	@GET
	@Path("/viewone/{id}")
	public List<Student> viewStudent(@PathParam("id")int studentId) {

		return studentdao.viewStudent(studentId);
	}

	@DELETE
	@Path("/delete/{id}")
	public String deleteStudent(@PathParam("id") int studentId) {

		return studentdao.deleteStudent(studentId);
	}

	@GET
	@Path("/list")
	public List<Student> viewAllStudent() {

		return studentdao.viewAllStudent();
	}

	@PUT
	@Path("/update/{id}/{fname}/{lname}/{marks}")
	public String updateStudent(@PathParam("id") int id, @PathParam("fname") String fname,
			@PathParam("lname") String lname, @PathParam("marks") int marks) {

		return studentdao.updateStudent(id, fname, lname, marks);
	}

}
