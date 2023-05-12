package PreparedStatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306?user=root&password=root";
		String query="insert into javamysql.department values(?,?,?)";
		
		
		Connection con=DriverManager.getConnection(url);//connection database throuth the java application
		System.out.println("step1");
		
		PreparedStatement ps=con.prepareStatement(query);//dyanamic state ment preparedStatement
		System.out.println("step2");

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the deptno");
		String deptno=sc.next();
		ps.setString(1, deptno);
		
		System.out.println("enter the dapartment name");
		String dname=sc.next();
		ps.setString(2, dname);
		
		System.out.println("enter the location code");
		String lcode=sc.next();
		ps.setString(3, lcode);
		
		ps.executeUpdate();// qurey excute statement
		System.out.println("step3");

		
		con.close();//connection close
		System.out.println("data inserted");

	}

}
