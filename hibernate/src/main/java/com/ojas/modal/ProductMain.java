package com.ojas.modal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductMain {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Product p=new Product();
		p.setProductId(2);
		p.setProductName("laptop");
		p.setProductQty(56);
		p.setProductPrice(10000.0);
		
		s.save(p);
		tx.commit();
		

	}

}
