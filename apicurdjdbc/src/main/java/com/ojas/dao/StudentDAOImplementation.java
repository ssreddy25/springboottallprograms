package com.ojas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ojas.db.Dbutility;
import com.ojas.modal.Student;

public class StudentDAOImplementation implements StudentDAO {
	
	Connection con=Dbutility.getConnection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	List<Student> students=new ArrayList<Student>();
	int n=0;
	String msg=null;
	Student s=null;
		

	public String createStudent(int sid,String saname,String slanme,String mail,String mobile) {
		
		try {
			ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setInt(1,sid );
			ps.setString(2,saname );
			ps.setString(3,slanme );
			ps.setString(4,slanme );
			ps.setString(5,mobile );
			n=ps.executeUpdate();
			if(n!=0){
				msg="student data inserted succsfully";
			}else{
				msg="student data  not inserted once try agin";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	public Student viewStudent(int studentId) {
		
		try {
			ps=con.prepareStatement("select * from student where studentid=?");
			ps.setInt(1, studentId);
			
			rs=ps.executeQuery();
			
			if(rs.next()){
				s=new Student();
				s.setStudentId(rs.getInt(1));
				s.setStudentName(rs.getString(2));
				s.setStudetntLname(rs.getString(3));
				s.setStudentEmail(rs.getString(4));
				s.setStudentMobile(rs.getString(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}

	public String updateStudent(int sid,String saname,String slanme,String mail,String mobile) {
		
		try {
			ps=con.prepareStatement("update  student set (fristname=?,lastname=?,email=?,mobile=?) where studentid=?");
			
			ps.setString(1,saname );
			ps.setString(2,slanme );
			ps.setString(3,mail );
			ps.setString(4,mobile );
			ps.setInt(5, sid);
			
			n=ps.executeUpdate();
			if(n!=0){
				msg="student data updated succsfully";
			}else{
				msg="student data  not updated once try agin";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	public String deleteStudent(int studentId) {
		try {
			ps=con.prepareStatement("delete from student where studentid=?");
			ps.setInt(1, studentId);
			
			n=ps.executeUpdate();
			
			if(n!=0){
				msg="student data deleted succsfully";
			}else{
				msg="student data  not deleted once try agin";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	public List<Student> viewAllStudent() {
		
		try {
			ps=con.prepareStatement("select * from student ");
			
			
			rs=ps.executeQuery();
			
			while(rs.next()){
				s=new Student();
				s.setStudentId(rs.getInt(1));
				s.setStudentName(rs.getString(2));
				s.setStudetntLname(rs.getString(3));
				s.setStudentEmail(rs.getString(4));
				s.setStudentMobile(rs.getString(5));
				students.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Student List Size = "+students.size());
		
		return students;
	}
	}

