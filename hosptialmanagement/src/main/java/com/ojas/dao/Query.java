package com.ojas.dao;

public interface Query {
	
	public String insert="insert into user (username,useremail,userpassword) values(?,?,?)";
	
	public String retrive="select * from user where useremail=? and userpassword=? ";
	
	public String insertSpeciallist="insert into specialist (specialistName) values(?)";
	
	public String insertDoctor="insert into doctor (fullname,dob,doctorqualification,doctorspecalist,email,phoneNumber,password) values(?,?,?,?,?,?,?)";
	
	public String retrivewdoctorData="select * from doctor order by doctorId desc ";

}
