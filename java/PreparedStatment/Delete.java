package PreparedStatment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		String query="delete from javamysql.department where deptno=?";
		
		Connection con=DriverManager.getConnection(url);
		
		PreparedStatement ps=con.prepareStatement(query);
//		 CallableStatement cs=con.prepareCall(query);
		 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the delete the deptno");
		String deptno=sc.next();
		
		ps.setString(1,deptno);
//		cs.setString(1,deptno);
//		cs.executeUpdate();
		ps.executeUpdate();
		System.out.println("data deleted");
		

	}

}
