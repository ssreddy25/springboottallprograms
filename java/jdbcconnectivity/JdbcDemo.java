package jdbcconnectivity;
import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		
		String query = "insert into javamysql.department values (50,'Eshwar',143)";
		
		try {
			Connection connection = DriverManager.getConnection(url);
			
			Statement statement = connection.createStatement();
			
			statement.executeUpdate(query);
			
			
			connection.close();
			System.out.println("success:");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
