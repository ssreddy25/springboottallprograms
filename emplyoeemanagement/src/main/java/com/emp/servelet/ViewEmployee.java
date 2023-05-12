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
 * Servlet implementation class ViewEmployee
 */
public class ViewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		EmployeeImplements edao=new EmployeeImplements();
		EmployeePojo emppojo=new  EmployeePojo();
		out.println("siva ");
		int empid=Integer.parseInt(request.getParameter("id"));
		emppojo=edao.viewEmployee(empid);
		
		out.println("<table>");
		  out.println("<h1 style='color:green'>employee details</h1>");
		  out.println("<tr>");
		  out.println("<td>empid</td>");
		  out.println("<td>empname</td>");
		  out.println("<td>emprole</td>");
		  out.println("<td>empsalary</td>");
		  out.println("<td>empcity</td>");
		  out.println("<td>empexperience</td>");
		  out.println("</tr>");
		  out.println("<tr>");
		  out.println("<td>"+emppojo.getEmployeeId()+"</td>");
		  out.println("<td>"+emppojo.getEmployeeName()+"</td>");
		  out.println("<td>"+emppojo.getEmployeeRole()+"</td>");
		  out.println("<td>"+emppojo.getEmployeeSalary()+"</td>");
		  out.println("<td>"+emppojo.getEmployeeCity()+"</td>");
		  out.println("<td>"+emppojo.getEmployeeexperience()+"</td>");
		  out.println("</tr>");
		  out.println("<tr>");
		  out.println("<td><a href='AllEpmloyee' >view all employee</a></td>");
		  out.println("</tr>");
		  out.println("</table>");
		  
		  
		  
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
