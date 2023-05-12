package hibernateConnection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connectionsss {
	
	
	public static SessionFactory getSession(){
		
		Configuration cfg=new Configuration();
		cfg.configure();
		 
		SessionFactory sf=cfg.buildSessionFactory();
		
		return sf;
		
	}

}
