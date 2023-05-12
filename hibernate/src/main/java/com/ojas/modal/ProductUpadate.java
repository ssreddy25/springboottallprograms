package com.ojas.modal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductUpadate {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
		
		Product p1 = s.get(Product.class ,1);
		System.out.println(p1);
		p1.setProductName("mobile");
		
		s.update(p1);
		tx.commit();
		
		

	}

}
