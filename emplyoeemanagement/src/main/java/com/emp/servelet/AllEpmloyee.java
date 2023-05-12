package com.emp.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.dao.EmployeeImplements;
import com.emp.model.EmployeePojo;

/**
 * Servlet implementation class AllEpmloyee
 */
public class AllEpmloyee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllEpmloyee() {
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
//		EmployeePojo emppojo=new  EmployeePojo();
		
		  List<EmployeePojo> employess=edao.viewAllEmployee();
		  
		  out.println("<a href='Emplyoee.html'>add another employee </a>");
		  
		  out.println("<table>");
		  out.println("<h1 style='color:green'>employee list tables</h1>");
		  out.println("<tr>");
		  out.println("<td>empid</td>");
		  out.println("<td>empname</td>");
		  out.println("<td>emprole</td>");
		  out.println("<td>empsalary</td>");
		  out.println("<td>empcity</td>");
		  out.println("<td>empexperience</td>");
		  out.println("<td>viewemployee</td>");
		  out.println("<td>deleteemp</td>");
		  out.println("<td>editemployee</td>");
		  out.println("</tr>");
		  
		  for(EmployeePojo emp:employess){
			  out.println("<tr>");
			  out.println("<td>"+emp.getEmployeeId()+"</td>");
			  out.println("<td>"+emp.getEmployeeName()+"</td>");
			  out.println("<td>"+emp.getEmployeeRole()+"</td>");
			  out.println("<td>"+emp.getEmployeeSalary()+"</td>");
			  out.println("<td>"+emp.getEmployeeCity()+"</td>");
			  out.println("<td>"+emp.getEmployeeexperience()+"</td>");
			  out.println("<td><a href='ViewEmployee?id="+emp.getEmployeeId()+"'>view</a></td>");
			  out.println("<td><a href='DeleteEmployee?id="+emp.getEmployeeId()+"'>delete</a></td>");
			  out.println("<td><a href='EditEmployee?id="+emp.getEmployeeId()+"'>edit</a></td>");
			  
			  out.println("</tr>");
			  
		  }
		  out.println("</table>");
		  
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
