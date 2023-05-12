package com.ojas.adminser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ojas.entity.User;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet(name="/adminlogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("pwd");
		
		out.println(email);
		out.println(password);
		String adminemal="admin@gmail.com";
		String pwd="admin";
		
		HttpSession session=request.getSession();
		out.println("<h1>admin login</h1>");
		
		if(adminemal.equals(email) && pwd.equals(password)){
			out.println("<h1>admin login</h1>");
			session.setAttribute("adminobj", new User());
			response.sendRedirect("admin/index.jsp");
		}else{
			
			session.setAttribute("errormsg", "invalid email && password");
			response.sendRedirect("Admin_login.jsp");
			
		}
		
		
	}

}
