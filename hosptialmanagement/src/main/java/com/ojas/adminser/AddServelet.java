package com.ojas.adminser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ojas.dao.SpeciaListDaoImplements;
import com.ojas.entity.Spesilist;
import com.ojas.entity.User;

/**
 * Servlet implementation class AddServelet
 */
@WebServlet(name="/AddServelet")
public class AddServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SpeciaListDaoImplements spdao =new SpeciaListDaoImplements();
		
		Spesilist sp=new Spesilist();
		
		String spname=request.getParameter("spname");
		
		sp.setSpeName(spname);
		
		String msg=spdao.addSpecialist(spname);
		
		HttpSession session=request.getSession();
		
		
		if(msg!=null){
			
			session.setAttribute("succmsg", msg);
			response.sendRedirect("admin/index.jsp");
		}else{
			
			session.setAttribute("errormsg", msg);
			response.sendRedirect("addspeslist.jsp");
			
		}
		
		
			
		}
		
		
		
		
	

}
