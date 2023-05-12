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
 * Servlet implementation class UpdateEmployee
 */
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
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
		out.println("updated detais");
		
		int empid=Integer.parseInt(request.getParameter("eid"));
		
		emppojo.setEmployeeId(Integer.parseInt(request.getParameter("eid")));
		emppojo.setEmployeeName(request.getParameter("ename"));
		emppojo.setEmployeeRole(request.getParameter("erole"));
		emppojo.setEmployeeCity(request.getParameter("ecity"));
		emppojo.setEmployeeSalary(Integer.parseInt(request.getParameter("esala")));
		emppojo.setEmployeeexperience(Integer.parseInt(request.getParameter("eexperience")));
		
		String msg=edao.editEmplyoee(empid, emppojo);
		
		response.sendRedirect("AllEpmloyee");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
