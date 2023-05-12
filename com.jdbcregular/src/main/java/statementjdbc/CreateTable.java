package statementjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root", "root");
			
			Statement st=con.createStatement();
			
			st.execute("create table student (id int ,name varchar(45) not null,age int,primary key(id))");
			
			st.close();
			con.close();
			System.out.println("table is created");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
