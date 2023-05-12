package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesData
 */
@WebServlet(name="/cookies")
public class CookiesData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pt=response.getWriter();
		
		response.setContentType("text/html");
		pt.println("<center><h1>cookie application</h1></center>");
		String fname = request.getParameter("fname");

		String lname = request.getParameter("lname");
		
		
		Cookie ck1=new Cookie("fname" ,fname);
		Cookie ck2=new Cookie("lname" ,lname);
		response.addCookie(ck1);
		response.addCookie(ck2);
		
		pt.println("<a href=./second> move to another page");
		
		
		
		
		
		
	}

}
