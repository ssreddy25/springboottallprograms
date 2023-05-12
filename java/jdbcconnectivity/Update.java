package jdbcconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";

		String query = "select * from javamysql.department where Deptno=?";
		
		try {
			Connection connection = DriverManager.getConnection(url);
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Deptno:");
			String sno = sc.next();
			preparedStatement.setString(1,sno);
			
			ResultSet resultset = preparedStatement.executeQuery();
			
			//String udeptid = resultSet.getString("Deptno",1);
			
			if(resultset.next()){
				   String sdno=resultset.getString("Deptno");
	                String sdname=resultset.getString("DName");
	                String slcode=resultset.getString("LCode");
	                System.out.println(sdno +" " +sdname+""+slcode);
	                System.out.println("Print Successfull.....");
			}else{
				System.out.println("Error");
			}
			
			connection.close();
			System.out.println("success:");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
