package Statment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		String query="Update javamysql.department set dname='siva' where deptno=50";
		Connection con=DriverManager.getConnection(url);
		Statement st=con.createStatement();
		st.executeUpdate(query);
		System.out.println("Data Updated: ");

	}
}
