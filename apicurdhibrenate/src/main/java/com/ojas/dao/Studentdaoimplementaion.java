package com.ojas.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ojas.model.StudentApi;

import hibernateConnection.Connectionsss;

public class Studentdaoimplementaion implements StudentApIDao {
	
	    SessionFactory sf=Connectionsss.getSession();

	public String createStudent(String studentname, String studentLname, int studentMarks) {
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		StudentApi s=new StudentApi();
		
		s.setStudentName(studentname);
		s.setStudentLname(studentLname);
		s.setStudentMarks(studentMarks);
		
		session.saveOrUpdate(s);
		
		tx.commit();
		
		
		return "student created";
	}

	public StudentApi viewStudent(int studentId) {
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		StudentApi student=session.get(StudentApi.class, studentId);
		
//		Query query=session.createQuery("from StudentApi where studentId=:id");
//		
//		query.setParameter("id",studentId);
//		
//		List<StudentApi> student= query.getResultList();
	
		
		return student;
	}

	public List<StudentApi> viewAllStudent() {
	    
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Query query=session.createQuery("from StudentApi");
		return query.list();
		
	}

	public String updateStudent(int studentId, String studentname, String studentLname, int studentMarks) {
		
		String msg="";
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		

		Query query=session.createQuery("update StudentApi set studentName=:name,studentLname=:lname,studentMarks=:marks where studentId=:id");
		
		query.setParameter("name",studentname);
		query.setParameter("lname",studentLname);
		query.setParameter("marks",studentMarks);
		query.setParameter("id",studentId);
		
		System.out.println(studentId+""+studentname+""+studentLname+""+studentMarks);
		int n=query.executeUpdate();
		tx.commit();
		if(n!=0){
			msg="student data is updated";
		}else{
			msg="student data is not updated";
		}

		
		
		return msg;
	}

	public String deleteStudent(int studentId) {
		String msg="";
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
    Query query=session.createQuery("delete from StudentApi where studentId=:id");
		
		query.setParameter("id",studentId);
		
		int n=query.executeUpdate();
		tx.commit();
		session.close();
		if(n!=0){
			msg="student record deleted in a database";
		}else{
			msg="student record not deleted in a database";
		}
		
		
		return msg;
	}

}
