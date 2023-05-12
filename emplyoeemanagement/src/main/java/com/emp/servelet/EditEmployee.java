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
 * Servlet implementation class EditEmployee
 */
public class EditEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi' crossorigin='anonymous'>");
		response.setContentType("text/html");
		EmployeeImplements edao=new EmployeeImplements();
		EmployeePojo emppojo=new  EmployeePojo();
		out.println("siva ");
		int empid=Integer.parseInt(request.getParameter("id"));
		emppojo=edao.viewEmployee(empid); 
		out.println("<form action='./UpdateEmployee' method='post'>");
		out.println("<h1 style='color:green'> edit employee detials </h1>");
		out.println("<table>");
		out.println("<tr>");
		 out.println("<td>employee Id</td>");
		 out.println("<td><input type='text' name='eid' value='"+emppojo.getEmployeeId()+"'/></td>");
		 out.println("</tr>");
		 out.println("<tr>");
		 out.println("<td>employee Id</td>");
		 out.println("<td><input type='text' name='ename' value='"+emppojo.getEmployeeName()+"'/></td>");
		 out.println("</tr>");
		 
		 out.println("<tr>");
		 out.println("<td>employee Id</td>");
		 out.println("<td><input type='text' name='erole' value='"+emppojo.getEmployeeRole()+"'/></td>");
		 out.println("</tr>");
		 out.println("<tr>");
		 out.println("<td>employee Id</td>");
		 out.println("<td><input type='text' name='esala' value='"+emppojo.getEmployeeSalary()+"'/></td>");
		 out.println("</tr>");
		 out.println("<tr>");
		 out.println("<td>employee Id</td>");
		 out.println("<td><input type='text' name='ecity' value='"+emppojo.getEmployeeCity()+"'/></td>");
		 out.println("</tr>");
		 out.println("<tr>");
		 out.println("<td>employee Id</td>");
		 out.println("<td><input type='text' name='eexperience' value='"+emppojo.getEmployeeexperience()+"'/></td>");
		 out.println("</tr>");
		  out.println("<tr>");
		  out.println("<td><button type='submit' class='btn btn-primary'>update</button></td>");
		  out.println("</tr>");
		  out.println("</table>");
		  out.println("</from>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
