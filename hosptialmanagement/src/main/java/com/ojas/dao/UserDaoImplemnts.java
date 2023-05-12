package com.ojas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ojas.db.DBUtility;
import com.ojas.entity.User;

public class UserDaoImplemnts implements UserDao {
	
     Connection con=DBUtility.getConnection();
       User user=null;  
      String msg=null;
      int count=0;
	


	public String createUser(User user) {
		
		try {
			PreparedStatement ps=con.prepareStatement(Query.insert);
			
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserEmail());
			ps.setString(3, user.getUserPassword());
			
			count=ps.executeUpdate();
			
			if(count!=0){
				msg="user account created please login";
			}else{
				
				msg="user account not created please try agin";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return msg;
	}



	public User loginUser(String email, String password) {
		
		try {
			PreparedStatement ps=con.prepareStatement(Query.retrive);
			
			
			ps.setString(1, email );
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				
				user=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return user;
	}

}
