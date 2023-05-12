package inhertianceTpConcerateClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TPSEntity {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		
		cfg.configure("TPCinhertance.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		EmployeeConcreate emp=new EmployeeConcreate();
		
		
		emp.setEmpName("siva sankar");
		
		RegularEmployeeConcrete  remp=new RegularEmployeeConcrete ();
		
	
		
		remp.setEmpName("reddy");
		remp.setSalary(3567800);
		
		remp.setBouns("5%");
		
		
		ConncerateEmployee cemp=new ConncerateEmployee();
	
		
		cemp.setEmpName("siva sankar reddy uppaluru");
		cemp.setPay_per_hours(48);
		cemp.setDuration("48days");
		
		s.save(emp);
		s.save(remp);
		s.save(cemp);
		tx.commit();
		
		
		

	}

}
