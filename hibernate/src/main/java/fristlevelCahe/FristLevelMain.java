package fristlevelCahe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class FristLevelMain {

	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure("fristlevelcahe.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		Laptop laptop=new Laptop();
		
		laptop.setLaptopName("dell");
		laptop.setLaptopRam("4gb ram");
		
		s.save(laptop);
		
		tx.commit();
		
		
		
		

	}

}
