package com.ojas.controler;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ojas.dao.StudentDAO;
import com.ojas.dao.StudentDAOImplementation;
import com.ojas.modal.Student;

@Path("/curd")
public class CurdRestControler  {
	
    StudentDAO daoImple=new StudentDAOImplementation();
   
   @POST
   @Path("/create/{sid}/{saname}/{slanme}/{mail}/{mobile}")
	public String createStudent(@PathParam("sid")int sid,@PathParam("saname")String saname,@PathParam("slanme")String slanme,@PathParam("mail")String mail,@PathParam("mobile")String mobile) {
		
		return  daoImple.createStudent(sid,saname,slanme,mail,mobile);
		
		
	}
     @GET
     @Path("/viewstudent/{sid}")
     @Produces(MediaType.APPLICATION_JSON)
	public Student viewStudent(@PathParam("sid")int studentId) {
//		Student stu=new Student();
		return daoImple.viewStudent(studentId);
		
		
	}
   @PUT
   @Path("/update/{sid}/{saname}/{slanme}/{mail}/{mobile}")
	public String updateStudent(@PathParam("sid")int sid,@PathParam("saname")String saname,@PathParam("slanme")String slanme,@PathParam("mail")String mail,@PathParam("mobile")String mobile) {
		String msg=daoImple.updateStudent(sid,saname,slanme,mail,mobile);
		
		return msg;
	}
   @DELETE
   @Path("/delete/{sid}")
	public String deleteStudent(@PathParam("sid")int studentId) {
		
		String msg=daoImple.deleteStudent(studentId);
		
		return msg;
	}
    
   @GET
   @Path("/allstudent")
   @Produces(MediaType.APPLICATION_JSON)
	public List<Student> viewAllStudent() {
//		List<Student> students=new ArrayList<Student>();
	   return daoImple.viewAllStudent();
		
		
	}
	
	
	

}
