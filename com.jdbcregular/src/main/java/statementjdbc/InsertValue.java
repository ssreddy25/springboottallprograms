package statementjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValue {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root", "root");
			
			Statement st=con.createStatement();
			
			st.executeUpdate("insert into student values(123,'siva sankar reddy',24)");
			st.close();
			con.close();
			System.out.println("values are inserted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
