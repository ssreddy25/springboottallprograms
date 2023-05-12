package com.ojas.userservelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.dao.UserDaoImplementaion;
import com.ojas.modal.User;

/**
 * Servlet implementation class LoginUser
 */
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		response.setContentType("text/html");
		
		User user=new User();
		
		UserDaoImplementaion dao=new UserDaoImplementaion();
		
		String userEmail =request.getParameter("emial");
		String passWord=request.getParameter("pwd");
		
		user=dao.userLogin(userEmail, passWord);
		
		
		if(user!=null){
			request.getSession().setAttribute("user", user);
			response.sendRedirect("Home.jsp");
		}
		
		else{
			out.println("invalid email and password");
		}
		
		
	}

}
