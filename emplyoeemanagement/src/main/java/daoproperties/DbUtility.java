package daoproperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtility  {
	
	
	public static Connection getConncetion(){
		
		Connection con=null;
		File file = new File("C:\\Users\\su22034\\servelt\\emplyoeemanagement\\src\\main\\resources\\db.properties");
		
		try {
			FileInputStream fi=new FileInputStream(file);
			
			Properties ps=new Properties();
			
			ps.load(fi);
			
			Class.forName(ps.getProperty("driver"));
			
	     	con = DriverManager.getConnection(ps.getProperty("url"), ps.getProperty("user"),ps.getProperty("pwd"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}

}
