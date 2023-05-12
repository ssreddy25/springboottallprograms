package com.ojas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ojas.db.DBUtility;
import com.ojas.entity.Doctor;
import com.ojas.entity.Spesilist;

public class DoctorDAOImplemenataion implements DoctorDAO {
	
	 Connection  con=DBUtility.getConnection();
	 Spesilist spesilist=null;
	 List<Doctor> doctors=null;
	 Doctor doctor=null;
    boolean msg=false;
    int count=0;

	public boolean createDoctor(Doctor doctor) {
		
		System.out.println(doctor);
		
	try {
		PreparedStatement ps=con.prepareStatement("insert into doctor (fullname,dob,doctorqualification,doctorspecalist,email,phoneNumber,password) values(?,?,?,?,?,?,?)");
		
		ps.setString(1, doctor.getDoctorFullName());
		ps.setString(2, doctor.getDoctorDateOfBrith());
		ps.setString(3, doctor.getDoctorQualificatio());
		ps.setString(4, doctor.getDoctorSpecialist());
		ps.setString(5, doctor.getDoctorEmail());
		ps.setString(6, doctor.getDoctorPhoneNumber());
		ps.setString(7, doctor.getDoctorPassword());
		
//		count=ps.executeUpdate();
		
		msg=ps.execute();
//		if(f!=false){
//			System.out.println("its excuted");
//		}
		
//		ps.execute();
		
		
		
		
		if(msg){
			 msg=true;
		}else{
			 msg=false;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		return msg;
	}

	public List<Doctor> viewAllDoctor() {
		doctors = new ArrayList<Doctor>();
		
		try {
			PreparedStatement ps=con.prepareStatement(Query.retrivewdoctorData);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				doctor=new Doctor(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
				
				doctors.add(doctor);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return doctors;
	}

}
