package com.ojas.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Dbutility {
	
  static Connection con=null;
  
  public static Connection getConnection(){
	  
	  try {
		File file=new File("C:\\Users\\su22034\\xmlandwebservices\\apicurdjdbc\\src\\main\\resources\\db.properties");
		  FileInputStream fileInputStream=new FileInputStream(file);
		  
		  Properties p=new Properties();
		  
		  p.load(fileInputStream);
		  
		  Class.forName(p.getProperty("driver"));
		  System.out.println(p.getProperty("url")+""+p.getProperty("user")+""+p.getProperty("pwd"));
		  con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("pwd"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  System.out.println(con);
	  
	  return con;
	  
  }

}
