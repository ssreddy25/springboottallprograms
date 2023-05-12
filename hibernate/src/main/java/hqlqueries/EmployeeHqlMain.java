package hqlqueries;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class EmployeeHqlMain {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		
		cfg.configure("hqlandhcql.cfg.xml");
		
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
	Query query=s.createQuery("from Job");
		
	query.setFirstResult(0);
	query.setMaxResults(2);
	  
		
		List<Job>  emp= query.getResultList();
		
		
		
		for(Job e:emp){
			System.out.println(e);
		}
		
		Query query1=s.createQuery("update Job set name=:n where jcode=:i");
		
		query1.setParameter("n", "siva sankar reddy");
		query1.setParameter("i", 401);
		
		int staus=query1.executeUpdate();
		System.out.println(staus);
		
		tx.commit();
		
		
		Query query2=s.createQuery("from Job");
		
		query2.setFirstResult(0);
		query2.setMaxResults(2);
		  
			
			List<Job>  emp1= query2.getResultList();
			
			
			
			for(Job e:emp1){
				System.out.println(e);
			}
		
		tx.commit();
	}

}
