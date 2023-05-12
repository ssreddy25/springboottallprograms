package com.ojas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ojas.db.DBUtility;
import com.ojas.db.SpeciaListDao;
import com.ojas.entity.Spesilist;


public class SpeciaListDaoImplements implements SpeciaListDao {
	
	 Connection  con=DBUtility.getConnection();
	 Spesilist spesilist=null;
    String msg=null;
    int count=0;

	public String addSpecialist(String speaciaName) {
		
		 try {
			PreparedStatement ps=con.prepareStatement(Query.insertSpeciallist);
			 
			 ps.setString(1, speaciaName );
			 
			 count=ps.executeUpdate();
			 if(count!=0){
				 
				 msg="successfully added specialist name";
			 }else{
				 msg="successfully added specialist name";
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return msg;
	}

}
