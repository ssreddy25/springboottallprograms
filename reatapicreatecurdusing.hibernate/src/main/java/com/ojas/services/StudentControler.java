package com.ojas.services;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ojas.dao.StudentDao;
import com.ojas.dao.StudentDaoImplemenation;
import com.ojas.model.Student;

@Path("/curd")
public class StudentControler  {
   
	StudentDao dao=new StudentDaoImplemenation();
     
	@POST
	@Path("/create/{studentName}/{studentLname}/{studentMarks}")
	public String createStudent(@PathParam ("studentName")String studentname,@PathParam ("studentLname") String studentLname,@PathParam ("studentMarks") int studentMarks) {
		
		return dao.createStudent(studentname, studentLname, studentMarks);
	}

	@GET
	@Path("/viewlist/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> viewStudent(@PathParam("id")int studentId) {
		
		return dao.viewStudent(studentId);
	}

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> viewAllStudent() {
		
		return dao.viewAllStudent();
	}

	
	@POST
	@Path("/update/{id}/{name}/{lname}/{marks}")
	public String updateStudent(@PathParam("id")int studentId,@PathParam("name") String studentname,@PathParam("lname") String studentLname,@PathParam("marks") int studentMarks) {
		
		return dao.updateStudent(studentId, studentname, studentLname, studentMarks);
	}

	@DELETE
	@Path("/delete/{id}")
	public String deleteStudent(@PathParam("id")int studentId) {
		
		return dao.deleteStudent(studentId);
	}
	
	

}
