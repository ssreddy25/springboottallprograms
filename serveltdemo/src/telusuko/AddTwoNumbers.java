package telusuko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddTwoNumbers extends HttpServlet {

	
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException{
		
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		HttpSession session=req.getSession();
		
		session.setAttribute("k", k);
		
		res.sendRedirect("Sq");
		
		
//		res.sendRedirect("Sq?k="+k);//senRedirect and url rewriting
		
//		PrintWriter out=res.getWriter();
//		
//		out.println("result is :"+ k);
		
	}

}
