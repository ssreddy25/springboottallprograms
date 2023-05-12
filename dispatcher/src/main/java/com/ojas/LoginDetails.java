package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginDetails
 */
@WebServlet(name="./login")
public class LoginDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		response.setContentType("text/html");
		
//		out.println("<center> <h1> welcome to servlet class</h1></center>");
		
		String email=request.getParameter("email");
		
		String password=request.getParameter("pwd");
		
		if(email.equals(password)){
			
			out.println("<center> <h1> welcome to servlet class</h1></center>");
			
		}
		else{
			
			out.println("<center> <h1> you enter the wrong credantial</h1></center>");
			
			RequestDispatcher rd=request.getRequestDispatcher("/login.html");
			rd.include(request, response);
			
//			rd.forward(request, response);// we use forward method  error data not visible to the user page is refresed 
			
		}
		
		
		
		
	}

}
