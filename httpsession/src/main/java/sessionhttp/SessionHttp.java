package sessionhttp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class SessionHttp
 */
public class SessionHttp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionHttp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pt=response.getWriter();
		
		response.setContentType("text/html");
		
		pt.println("<center><h1>htpp sessio application</h1></center>");
		HttpSession session=request.getSession();
		
		String fname=request.getParameter("fname");
		
		String lname=request.getParameter("last");
		
		session.setAttribute("fname", fname);
		session.setAttribute("lname", lname);
		
		pt.println("<a href=./second> click move to second page");
		
		
		
	}

}
