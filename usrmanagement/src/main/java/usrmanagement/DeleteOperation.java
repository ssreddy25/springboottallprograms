package usrmanagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteOperation
 */
@WebServlet(name="./deleteurl")
public class DeleteOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteOperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("show data list here");
		
		response.setContentType("text/html");
		
		int id=Integer.parseInt(request.getParameter("id"));
		try {
			// step1:Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usermanagement", "root", "root");
			// step3:Prepare the statement
			
			PreparedStatement ps = con.prepareStatement("delete from usertable where id= ?");
			
			ps.setInt(1, id);
			
			int count=ps.executeUpdate();
			
			if(count==1){
				out.println("<h1 style='clolor:red'>data is deleted</h1>");
				out.println("<a href='showdata' style='color:green'>show useer list</a>");
			}
			else{
				out.println("<h1 style='clolor:red'>data is not  deleted</h1>");
				out.println("<a href='showdata' style='color:green'>show useer list</a>");
			}
			
			
			ps.close();
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
