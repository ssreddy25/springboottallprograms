package com.ojas.Dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ojas.model.Student;

import hibernateconnection.HibernateConnection;

public class StudentDaoImplementation implements StudentDao {

	 SessionFactory sf = HibernateConnection.getSession();
	
	

	@Override
	public String createStudent(String fname, String lname, int marks) {
		
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();

		
		Student student = new Student();

		student.setStudentName(fname);
		student.setStudentLname(lname);
		student.setStudentMarks(marks);

		session.saveOrUpdate(student);
		tx.commit();

		return "student created";
	}

	@Override
	public List<Student> viewStudent(int studentId) {
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();
		
		
		Query query=session.createQuery(" from Student where studentId=:i"); 
		
		query.setParameter("i",studentId);
		
		List<Student> student= query.getResultList();
		
		
		
		
		return student;
	}

	@Override
	public String deleteStudent(int studentId) {
		
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();
		
		Query query=session.createQuery("delete from Student where studentId=:i"); 
		
		query.setParameter("i",studentId);
		query.executeUpdate();  
		
		tx.commit();
		
		return "student data deleted";
	}

	@Override
	public List<Student> viewAllStudent() {
		
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();
	
		Query query=session.createQuery("from Student");  
		
		 
		
		return query.list();
	}

	@Override
	public String updateStudent(int id, String fname, String lname, int marks) {
		
		 Session session = sf.openSession();
		 Transaction tx = session.beginTransaction();
		
		Query q=session.createQuery("update Student set studentName=:f ,studentLname=:l ,studentMarks=:m where studentId=:i");  
		q.setParameter("f",fname);  
		q.setParameter("l",lname);  
		q.setParameter("m",marks);  
		q.setParameter("i",id);  
		  
		int status=q.executeUpdate();  
		tx.commit();
		
		
		return status+"";
	}

}
