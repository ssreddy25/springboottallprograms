package com.ojas.adminser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ojas.dao.DoctorDAO;
import com.ojas.dao.DoctorDAOImplemenataion;

import com.ojas.entity.Doctor;
import com.ojas.entity.User;

/**
 * Servlet implementation class AddDoctor
 */
@WebServlet(name="/AddDoctor")
public class AddDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDoctor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		DoctorDAO dao=new DoctorDAOImplemenataion();
		
		Doctor doctor=new Doctor();
		
		HttpSession session=request.getSession();
		
		
		doctor.setDoctorFullName(request.getParameter("fname"));
		doctor.setDoctorDateOfBrith(request.getParameter("dob"));
		doctor.setDoctorQualificatio(request.getParameter("qlafication"));
		doctor.setDoctorSpecialist(request.getParameter("splist"));
		doctor.setDoctorEmail(request.getParameter("email"));
		doctor.setDoctorPhoneNumber(request.getParameter("phone"));
		doctor.setDoctorPassword(request.getParameter("pwd"));
		
		
		boolean msg=dao.createDoctor(doctor);
		
		

		if(msg){
			
			session.setAttribute("suessmsg", "add doctor suessfully");
			response.sendRedirect("admin/Doctor.jsp");
		}else{
			
			session.setAttribute("errormsg", "server error");
			response.sendRedirect("admin/Doctor.jsp");
			
		}
		
		
		
		
		
		
		
		
		
	}

}
