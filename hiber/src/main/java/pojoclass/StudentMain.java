package pojoclass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Session ssession=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=ssession.beginTransaction();
		/*
		 * Student student=new Student(); student.setId(1); student.setName("gopi");
		 * student.setAddress("hyd");
		 * 
		 * ssession.save(student);
		 */
		tx.commit();
		
		Student s=ssession.load(Student.class ,1);
		
		System.out.println(s);
		

	}

}
