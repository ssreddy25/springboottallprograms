package secondlevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class SecondLevelCache {

	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure("seconlevelCahe.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		
		Laptop lap  = s.get(Laptop.class, 1);
		
		System.out.println(lap);
		
		s.close();
		
		Session	s1=sf.openSession();
		System.out.println(s1.contains(lap));
		
		Laptop lap1 = s1.get(Laptop.class, 1);
		
		
		
		
		System.out.println(s1.contains(lap1));
		
		System.out.println(lap1);
		
		
      s1.close();
		
		Session	s2=sf.openSession();
		System.out.println(s2.contains(lap1));
		
		Laptop lap2 = s2.get(Laptop.class, 1);
		
		System.out.println(s2.contains(lap2));
		
		System.out.println(lap2);
		

	}

}
