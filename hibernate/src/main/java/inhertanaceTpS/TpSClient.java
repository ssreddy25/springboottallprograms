package inhertanaceTpS;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TpSClient {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		
		cfg.configure("inhertanceTpS.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		Employee1 e1=new Employee1();
		e1.setEmpid(5);
		
		e1.seteName("siva");
		
		RegularEmployee1 rgemp1=new RegularEmployee1();
		
		rgemp1.setEmpid(6);
		rgemp1.seteName("sankar");
		
		rgemp1.setSalary(34679);
		
		rgemp1.setBouns(5);
		
		
		ContractEmployee1 cnemp1=new ContractEmployee1();
		
		cnemp1.setEmpid(7);
		cnemp1.seteName("reddy");
		cnemp1.setPay_per_hours(56);
		cnemp1.setDuration("49days");
		
		s.save(e1);
		s.save(rgemp1);
		s.save(cnemp1);
		
		tx.commit();
		

	}

}
