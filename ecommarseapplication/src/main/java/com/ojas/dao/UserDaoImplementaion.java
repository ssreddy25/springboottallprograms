package com.ojas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ojas.modal.User;

public class UserDaoImplementaion implements UserDao {
	
	Connection con=DatabaseConnection.getConnection();
	
	String msg=null;
	int count =0;
	User user=null;
	public String createUser(User user) {
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into usertable (username,useremail,userpassword)values(?,?,?)");
			
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserEmail());
			ps.setString(3, user.getUserPassword());
			
			count=ps.executeUpdate();
			
			if(count!=0){
				msg="register sucessfully";
			}
			else{
				msg="register unsucessfully ";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}

	public User userLogin(String userEmail, String passWord) {
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from usertable where  useremail=? and userpassword=?");
			
			ps.setString(1, userEmail);
			ps.setString(2, passWord);
			
			 ResultSet rs=ps.executeQuery();
			 
			 while(rs.next()){
				 
				 user=new User();
				 
				 user.setUserId(rs.getInt(1));
				 user.setUserName(rs.getString(2));
				 user.setUserEmail(rs.getString(3));
				 user.setUserPassword(rs.getString(4));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return user;
	}

	public User userForgetPassword(String userName, String userEmail) {
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from usertable where username=? and useremail=?");
			
			ps.setString(1, userName);
			ps.setString(2, userEmail);
			
			 ResultSet rs=ps.executeQuery();
			 
			 while(rs.next()){
				 
				 user=new User();
				 
				 user.setUserId(rs.getInt(1));
				 user.setUserName(rs.getString(2));
				 user.setUserEmail(rs.getString(3));
				 user.setUserPassword(rs.getString(4));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return user;
	}

}
