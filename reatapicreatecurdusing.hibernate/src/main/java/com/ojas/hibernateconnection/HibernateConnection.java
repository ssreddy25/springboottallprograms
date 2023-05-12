package com.ojas.hibernateconnection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnection {
	
	
	public static SessionFactory getSessionFactory(){
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		 
		SessionFactory sf=cfg.buildSessionFactory();
		
		return sf;
		
	}

}
