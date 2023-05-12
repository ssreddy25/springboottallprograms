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
 * Servlet implementation class RegisterProgram
 */
@WebServlet(name = "./register")
public class RegisterProgram extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterProgram() {
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
		response.setContentType("text/html");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String npass = request.getParameter("npass");
		String cpass = request.getParameter("cpass");
		String pnumber = request.getParameter("pnumber");
		String dob = request.getParameter("dob");
		String city = request.getParameter("city");
		String gneder = request.getParameter("gneder");
		
		
		try {
			// step1:Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step2:Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usermanagement", "root", "root");
			// step3:Prepare the statement
			PreparedStatement ps = con.prepareStatement("INSERT INTO usertable(FristName,LastName,Email,NewPassword,ConfromPassword,PhoneNumber,DateOfBritah,City,Gender) VALUES(?,?,?,?,?,?,?,?,?)");

			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, npass);
			ps.setString(5, cpass);
			ps.setString(6, pnumber);
			ps.setString(7, dob);
			ps.setString(8, city);
			ps.setString(9, gneder);

			// step4:execute the query
			int n = ps.executeUpdate();
			if (n != 0) {
				System.out.println("Successfully Student Record Inserted...");
			} else {
				System.out.println("Notable to Inserted.Please try again.....");
			}
			// step5:Close the statement and connection
			
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
