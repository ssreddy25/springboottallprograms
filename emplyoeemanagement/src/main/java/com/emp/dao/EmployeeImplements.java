package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.model.EmployeePojo;

import daoproperties.DbUtility;

public class EmployeeImplements implements EmplyoeeDao {
	
	public static Connection con=DbUtility.getConncetion();
	 String msg =null;
	EmployeePojo emp=null;
	List<EmployeePojo> employees=null;
    int count=0;

	public String createEmployee(EmployeePojo emp1) {
		
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			
			ps.setInt(1, emp1.getEmployeeId());
			ps.setString(2, emp1.getEmployeeName());
			ps.setString(3,emp1.getEmployeeRole());
			ps.setInt(4, emp1.getEmployeeSalary());
			ps.setString(5, emp1.getEmployeeCity());
			ps.setInt(6, emp1.getEmployeeexperience());
			
			count=ps.executeUpdate();
			
			if(count!=0){
				msg="employee data is inseted into a data base";
			}else{
				msg="employee data is not inseted into a data base";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return msg;
	}

	public EmployeePojo viewEmployee(int empid) {
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from employee where employeeid =?");
			
			 ps.setInt(1, empid );
			 
			 ResultSet rs=ps.executeQuery();
			 
			 if(rs.next()){
				 
				 emp=new EmployeePojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return emp;
	}

	public List<EmployeePojo> viewAllEmployee() {
		employees =new ArrayList<EmployeePojo>();
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from employee ");
			 ResultSet rs=ps.executeQuery();
			 
			 while(rs.next()){
				 emp=new EmployeePojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6));
				 
				 employees.add(emp);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		
		
		return employees;
	}

	public String deleteEmplyoee(int empid) {
		
		try {
			PreparedStatement ps=con.prepareStatement("delete from employee where employeeid =?");
			
			ps.setInt(1, empid );
			
			count=ps.executeUpdate();
			
			if(count!=0){
				msg="employee data is deleted  into a data base";
			}else{
				msg="employee data is not deleted into a data base";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return msg;
	}

	public String editEmplyoee(int empid, EmployeePojo updatedemp) {
		
		try {
			PreparedStatement ps=con.prepareStatement("update employee set empname=?, emprole=?, empsalary=?, employeecity=?, empexperience=? where employeeid=? ");
			
			ps.setString(1, updatedemp.getEmployeeName());
			ps.setString(2,updatedemp.getEmployeeRole());
			ps.setInt(3, updatedemp.getEmployeeSalary());
			ps.setString(4, updatedemp.getEmployeeCity());
			ps.setInt(5, updatedemp.getEmployeeexperience());
			ps.setInt(6, updatedemp.getEmployeeId());
			
			count=ps.executeUpdate();
			
			if(count!=0){
				msg="employee data is updated  into a data base";
			}else{
				msg="employee data is not updated into a data base";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return msg;
	}

}
