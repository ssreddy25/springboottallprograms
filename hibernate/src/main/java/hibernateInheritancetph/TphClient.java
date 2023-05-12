package hibernateInheritancetph;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TphClient {

	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		
		cfg.configure("inheritanceTph.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction  tx=s.beginTransaction();
		
		Employee emp=new Employee();
		
		emp.seteId(1);
		emp.setEname("siva");
		
		RegularEmployee regEmp =new RegularEmployee();
		regEmp.seteId(2);
		regEmp.setEname("sankar");
		regEmp.setSalary(78950);
		regEmp.setPercentage("10");
		
		ContractEmployee conEmp =new ContractEmployee();
		
		conEmp.seteId(3);
		conEmp.setEname("siva sankar reddy");
		conEmp.setPay_per_hour(8000);
		conEmp.setDuration("60");
		
		
		s.save(emp);
		s.save(regEmp);
		s.save(conEmp);
		
		tx.commit();
		s.close();
		sf.close();

	}

}
