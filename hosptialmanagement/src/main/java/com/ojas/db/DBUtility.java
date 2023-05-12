package com.ojas.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {

	public static Connection getConnection() {
		Connection con = null;
		File file = new File("E:\\studentmanagement\\hosptialmanagement\\src\\main\\resources\\db.properties");

		try {
			FileInputStream fis = new FileInputStream(file);

			Properties ps = new Properties();
			ps.load(fis);
			Class.forName(ps.getProperty("driver"));
			con = DriverManager.getConnection(ps.getProperty("url"), ps.getProperty("user"), ps.getProperty("pwd"));
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

		return con;

	}

}
