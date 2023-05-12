package hibernateannataion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentClient {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("Annotaion.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		Student s1=new Student();
		
		
		s1.setStudentId(3);
		s1.setStudentName("SIVA SANKAR REDDY");
		s1.setStudentMarks(89);
		
		
		s.saveOrUpdate(s1);
		
	 Student s2=s.get(Student.class, 3);	
	 
		 s.delete(s2);
		 
		 Student s3=s.get(Student.class, 5);	
		 
		 s3.setStudentName("siva sankar reddy uppaluru");
		 s.update(s3);
		 
		 
	 tx.commit();
	 
	
	 
	
		
		
		sf.close();
		s.close();

	}

}
