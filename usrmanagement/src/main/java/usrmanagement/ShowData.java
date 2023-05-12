package usrmanagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowData
 */
@WebServlet(name="./showdata")
public class ShowData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowData() {
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
		out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi' crossorigin='anonymous'>");

		
		try {
			// step1:Load the driver
						Class.forName("com.mysql.cj.jdbc.Driver");
						// step2:Establish the connection
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usermanagement", "root", "root");
						// step3:Prepare the statement
						PreparedStatement ps = con.prepareStatement("select id,FristName,LastName,Email,NewPassword,ConfromPassword,PhoneNumber,DateOfBritah,City,Gender from usertable");
						
						ResultSet rs=ps.executeQuery();
						
						out.println("<table class='table table-hover card-body'>");
						out.println("<tr>");
						out.println("<th>ID</th>");
						out.println("<th>frist name</th>");
						out.println("<th>last name</th>");
						out.println("<th>email</th>");
						out.println("<th>newpassword</th>");
						out.println("<th>confrimpassword</th>");
						out.println("<th>phonenumber</th>");
						out.println("<th>dateofbrith</th>");
						out.println("<th>city</th>");
						out.println("<th>gender</th>");
						out.println("<th>edit</th>");
						out.println("<th>Delete</th>");
						
						out.println("</tr>");
						
			              while(rs.next()){
			            	  out.println("<tr>");
			            	  out.println("<td>"+rs.getInt(1)+"</td>");
			            	  out.println("<td>"+rs.getString(2)+"</td>");
			            	  out.println("<td>"+rs.getString(3)+"</td>");
			            	  out.println("<td>"+rs.getString(4)+"</td>");
			            	  out.println("<td>"+rs.getString(5)+"</td>");
			            	  out.println("<td>"+rs.getString(6)+"</td>");
			            	  out.println("<td>"+rs.getString(7)+"</td>");
			            	  out.println("<td>"+rs.getString(8)+"</td>");
			            	  out.println("<td>"+rs.getString(9)+"</td>");
			            	  out.println("<td>"+rs.getString(10)+"</td>");
			            	  
			            	  out.println("<td>"+"<a href='editurl?id="+rs.getInt(1)+"'>edit</a>"+"</td>");
			            	  out.println("<td>"+"<a href='deleteurl?id="+rs.getInt(1)+"'>delete</a>"+"</td>");
			            	  
			            	
			            	  
			            	  out.println("</tr>");
						}
						out.println("</table>");
						out.println("<a href='Register.html' style='color:red'>HOME</a>");
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
