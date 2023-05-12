package pojoclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Students {

	public static void main(String[] args) {
		
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Student student=new Student();
		
		student.setSid(1);
		student.setStudentName("siva sankar reddy");
		student.setStudentMarks("100");
		
		s.save(student);
		tx.commit();
	
		
	}

}
