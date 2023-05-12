package PreparedStatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) throws SQLException {
	String url="jdbc:mysql://localhost:3306?user=root&password=root";
	String query="select * from javamysql.department";
	  
	 Connection con=DriverManager.getConnection(url);
	 
	 PreparedStatement ps=con.prepareStatement(query);
	 
	 ResultSet rs=ps.executeQuery();
	 while(rs.next()){
		 String depnum=rs.getString("deptno");
		 String dname=rs.getString("dname");
		 String lcode=rs.getString("lcode");


		System.out.println(depnum+" "+dname+" "+lcode);
	 }
	 
	}

}
