package Statment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		String query = "select * from javamysql.department";
		
		try {
			Connection connection = DriverManager.getConnection(url);
			Statement st=connection.createStatement();
			
			ResultSet resultset = st.executeQuery(query);

			while(resultset.next()){
				String sdeptno = resultset.getString("deptno");
				String sdname = resultset.getString("dname");
				String slcode = resultset.getString("lcode");
				System.out.println(sdeptno+" "+sdname+" "+slcode);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
