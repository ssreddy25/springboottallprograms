package jdbcconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsert {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";

		String query = "insert into javamysql.department values (?,?,?)";
		
		try {
			Connection connection = DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter deptno:");
			String udptno = sc.next();
			preparedStatement.setString(1,udptno);
			
			System.out.println("Enter deptname:");
			String udptname = sc.next();
			preparedStatement.setString(2,udptname);
			
			System.out.println("Enter dept loca:");
			String udptloc = sc.next();
			preparedStatement.setString(3,udptloc);
			
			preparedStatement.executeUpdate();
			
			connection.close();
			System.out.println("success:");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
