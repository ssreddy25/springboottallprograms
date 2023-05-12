package com.ojas.user.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ojas.dao.UserDaoImplemnts;
import com.ojas.entity.User;

/**
 * Servlet implementation class LoginUserSer
 */
@WebServlet(name="/login")
public class LoginUserSer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginUserSer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		
		response.setContentType("text/html");
		
		UserDaoImplemnts dao=new UserDaoImplemnts();
		
		User user=new User();
		
		HttpSession session=request.getSession();
		 String email=request.getParameter("email");
		String pwd=request.getParameter("pwd");
		
		  user=dao.loginUser(email, pwd);
		  
		  
		  if(user !=null){
				
				session.setAttribute("userobj", user);
				response.sendRedirect("user/index.jsp");
			}else{
				
				session.setAttribute("errormsg", "invalid email && password");
				response.sendRedirect("User_login.jsp");
				
			}
		  
		  
		  
	}

}
