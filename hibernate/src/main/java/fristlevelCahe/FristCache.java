package fristlevelCahe;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FristCache {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("fristlevelcahe.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		Laptop laptop=new Laptop();
		
		laptop  = s.get(Laptop.class, 1);
		
		System.out.println(laptop);
		
		System.out.println(s.contains(laptop));
		laptop  = s.get(Laptop.class, 1); 
		
		System.out.println(laptop);
		
//		List<Laptop> lap =null;
//		Query query=null;
//		 query=s.createQuery("from Laptop");
//		
//		 lap=query.list();
//		
//		for(Laptop l:lap){
//			System.out.println(l);
//		}
//		
//		
//		
//	 		
//      query=s.createQuery("from Laptop");
//		
//		 lap=query.list();
//		
//		for(Laptop l:lap){
//			System.out.println(l);
//		}
//		
//		
//		
	}

}
