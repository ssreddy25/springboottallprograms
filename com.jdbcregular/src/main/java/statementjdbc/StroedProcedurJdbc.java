package statementjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StroedProcedurJdbc {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javajdbc", "root", "root");
			CallableStatement cst=con.prepareCall("{?=call mul(?,?)}");
			 cst.registerOutParameter(1, Types.INTEGER);
			 cst.setInt(2, 10);
			 cst.setInt(3, 20);
			
			 
			 cst.execute();
			 
			 System.out.println("done"+"\t" +cst.getInt(1));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}

}
