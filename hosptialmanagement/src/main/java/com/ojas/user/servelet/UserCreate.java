package com.ojas.user.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ojas.dao.UserDaoImplemnts;
import com.ojas.entity.User;

/**
 * Servlet implementation class UserCreate
 */
@WebServlet(name="/create")
public class UserCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserCreate() {
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
		
		user.setUserName(request.getParameter("uname"));
		user.setUserEmail(request.getParameter("email"));
		user.setUserPassword(request.getParameter("pwd"));
		
		String msg=dao.createUser(user);
		
		if(msg!=null){
			
			session.setAttribute("suecessmsg", msg);
			response.sendRedirect("NewUser.jsp");
			
		
			
		}else{
			session.setAttribute("errormsg", msg);
			response.sendRedirect("NewUser.jsp");
		}
		
	}

}
