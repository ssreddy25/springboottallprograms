//package com.ojas.dao;
//
//import java.util.List;
//
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//
//import com.ojas.hibernateconnection.HibernateConnection;
//import com.ojas.model.Student;
//
//public class StudentDaoImp implements StudentDao {
//	
//	SessionFactory sf=HibernateConnection.getSessionFactory();
//
//    
//	public String createStudent(String studentname, String studentLname, int studentMarks) {
//		Session session=sf.openSession();
//		Transaction tx=session.beginTransaction();
//		
//		Student student=new Student();
//		
//		student.setStudentLname(studentname);
//		student.setStudentLname(studentLname);
//		student.setStudentMarks(studentMarks);
//		
//		session.saveOrUpdate(student);
//		tx.commit();
//		session.close();
//	
//		
//	
//		return "student Created";
//	}
//   
//	public List<Student> viewStudent(int studentId) {
//		
//		Session session=sf.openSession();
//		Transaction tx=session.beginTransaction();
//		
//		Query query=session.createQuery("from Student where studentId=:id");
//		
//		query.setParameter("id",studentId);
//		
//		List<Student> student= query.getResultList();
//		
//		return student;
//    }
//		 
//	public List<Student> viewAllStudent() {
//		
//		Session session=sf.openSession();
//		Transaction tx=session.beginTransaction();
//		
//		Query query=session.createQuery("from Student");
//		return query.list();
//	}
//		
//	}
//
//	public String updateStudent(int studentId, String studentname, String studentLname, int studentMarks) {
//		String msg="";
//		Session session=sf.openSession();
//		Transaction tx=session.beginTransaction();
//		
//		
//		Query query=session.createQuery("update Student set studentName=:name,studentLname=:lname,studentMarks=:marks where studentId=:id");
//		
//		query.setParameter("name",studentname);
//		query.setParameter("lname",studentLname);
//		query.setParameter("marks",studentId);
//		query.setParameter("id",studentId);
//		
//		int n=query.executeUpdate();
//		tx.commit();
//		if(n!=0){
//			msg="student data is updated";
//		}else{
//			msg="student data is not updated";
//		}
//
//		
//		
//		return msg;
//	}
//
//	public String deleteStudent(int studentId) {
//		String msg="";
//		Session session=sf.openSession();
//		Transaction tx=session.beginTransaction();
//		
//		Query query=session.createQuery("delete from Student where studentId=:id");
//		
//		query.setParameter("id",studentId);
//		
//		int n=query.executeUpdate();
//		tx.commit();
//		session.close();
//		if(n!=0){
//			msg="student record deleted in a database";
//		}else{
//			msg="student record not deleted in a database";
//		}
//		
//		
//		return msg;
//	}
//
//}
