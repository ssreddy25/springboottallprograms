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
 * Servlet implementation class EditOperation
 */
@WebServlet(name = "./editurl")
public class EditOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditOperation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("show data list here");

		response.setContentType("text/html");
		out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi' crossorigin='anonymous'>");

		int id = Integer.parseInt(request.getParameter("id"));

		try {
			// step1:Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usermanagement", "root", "root");
			// step3:Prepare the statement

			PreparedStatement ps = con.prepareStatement(
					"select FristName,LastName,Email,NewPassword,ConfromPassword,PhoneNumber,DateOfBritah,City,Gender from usertable where id= ?");

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			
            rs.next();
            out.println("<form action='edit?id="+id+"' method='post' class='form card'>");
			out.println("<table class='table table-hover card-body'>");
			
			out.println("<tr>");
			out.println("<td>Frist Name:</td>");
			out.println("<td><input type='text' name='fname' value='"+rs.getString(1)+"'></td>");
			out.println("</tr>");

			out.println("<tr>");
			out.println("<td>Last  Name:</td>");
			out.println("<td><input type='text' name='lname' value='" + rs.getString(2) + "'></td>");
			out.println("</tr>");
			
			
			out.println("<tr>");
			out.println("<td>Email :</td>");
			out.println("<td><input type='text' name='email' value='" + rs.getString(3) + "'></td>");
			out.println("</tr>");
			
			
			out.println("<tr>");
			out.println("<td>NewPassword:</td>");
			out.println("<td><input type='text' name='npass' value='" + rs.getString(4) + "'></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>ConfromPassword:</td>");
			out.println("<td><input type='text' name='cpass' value='" + rs.getString(5) + "'></td>");
	        out.println("</tr>");
	
	
			out.println("<tr>");
			out.println("<td>PhoneNumber:</td>");
			out.println("<td><input type='text' name='pnumber' value='" + rs.getString(6) + "'></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>DateOfBritah:</td>");
			out.println("<td><input type='date' name='dob' value='" + rs.getString(7) + "'></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>City:</td>");
			out.println("<td><input type='text' name='city' value='" + rs.getString(8) + "'></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>Gender:</td>");
			out.println("<td><input type='text' name='gneder' value='" + rs.getString(9) + "'></td>");
			out.println("</tr>");
			
			out.println("</table>");
			
			out.println("<tr class='card-footer '>");
			out.println("<td><button type='subimt' class='btn btn-primary'>Edit</button></td>");
			
			
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td><button type='reset' class='btn btn-primary' >cancel</button> </td>");
			out.println("</tr>");
			
			out.println("</from>");
            out.println("<br/>");

			out.println("<a href='Register.html' style='color:red'>HOME</a>");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
