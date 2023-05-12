package jdbcjaxwsrpctype;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtility {
	
	public static Connection getConnection(){
		
		
		Connection con=null;
		File file =new File("C:\\Users\\su22034\\xmlandwebservices\\jdbcjaxwsrpctype\\src\\main\\resources\\db.properties");
		
		try {
			FileInputStream fi=new FileInputStream(file);
			
			Properties pr=new Properties();
			
			pr.load(fi);
			
			String url=pr.getProperty("url");
			String user=pr.getProperty("user");
			String pwd=pr.getProperty("pwd");
			System.out.println(url+""+user+""+pwd);
//		  Class.forName(pr.getProperty("driver"));
		   con=DriverManager.getConnection(pr.getProperty("url"), pr.getProperty("user"), pr.getProperty("pwd"));
		} catch ( IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
}
