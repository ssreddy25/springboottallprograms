package com.ojas.controler;

import java.util.List;


import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ojas.dao.StudentApIDao;
import com.ojas.dao.Studentdaoimplementaion;
import com.ojas.model.StudentApi;

@Path("/curd")
public class StudentSrivices {

	StudentApIDao dao = new Studentdaoimplementaion();

	@POST
	@Path("/create/{fname}/{lname}/{marks}")
	public String createStudent(@PathParam ("fname")String studentname,@PathParam ("lname") String studentLname,@PathParam ("marks") int studentMarks) {
		return dao.createStudent(studentname, studentLname, studentMarks);

	}
   
	 @GET
	 @Path("/view/{id}")
	 @Produces(MediaType.APPLICATION_JSON)
	public StudentApi  viewStudent(@PathParam ("id")int studentId) {
		return dao.viewStudent(studentId);
	}
	 @GET
	 @Path("/list")
	 @Produces(MediaType.APPLICATION_JSON)
	public List<StudentApi> viewAllStudent() {
		return dao.viewAllStudent();
	}
    
	 @PUT
	 @Path("/update/{id}/{fname}/{lname}/{marks}")
	public String updateStudent(@PathParam ("id")int studentId,@PathParam ("fname") String studentname,@PathParam ("lname") String studentLname,@PathParam ("marks") int studentMarks) {

		return dao.updateStudent(studentId, studentname, studentLname, studentMarks);
	}
     @DELETE
     @Path("/delete/{id}")
	public String deleteStudent(@PathParam ("id")int studentId) {

		return dao.deleteStudent(studentId);
	}

}
