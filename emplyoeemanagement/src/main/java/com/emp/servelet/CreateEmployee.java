package com.emp.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.dao.EmployeeImplements;
import com.emp.model.EmployeePojo;

/**
 * Servlet implementation class CreateEmployee
 */
public class CreateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		EmployeeImplements edao=new EmployeeImplements();
		EmployeePojo emppojo=new  EmployeePojo();
		
		
//		String name=request.getParameter("ename");
//		emppojo.setEmployeeName(name);
		
		emppojo.setEmployeeId(Integer.parseInt(request.getParameter("eid")));
		emppojo.setEmployeeName(request.getParameter("ename"));
		emppojo.setEmployeeSalary(Integer.parseInt(request.getParameter("esalary")));
		emppojo.setEmployeeRole(request.getParameter("role"));
		emppojo.setEmployeeCity(request.getParameter("city"));
		emppojo.setEmployeeexperience(Integer.parseInt(request.getParameter("experience")));
		
//		 String msg=edao.createEmployee(emppojo);
		 
		 out.println("<h1>"+emppojo+"</h1>");
		 
		 out.println("<h1><a herf='Emplyoee.html'>back to register from </a></h1>");
	}

}
