package manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOne {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("manytoone.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Vendor vendor = new Vendor();

		vendor.setId(1);
		vendor.setCompanyName("ojas invoation technology");

		Employee employee = new Employee();

		employee.setEmpId(1);
		employee.setEmployeeName("reddy uppaluru");
		employee.setEmpSalary(45000);
		employee.setVender(vendor);

		Employee employee1 = new Employee();

		employee1.setEmpId(2);
		employee1.setEmployeeName("siva");
		employee1.setEmpSalary(5000);
		employee1.setVender(vendor);

		Employee employee2 = new Employee();

		employee2.setEmpId(3);
		employee2.setEmployeeName("sankar reddy");
		employee2.setEmpSalary(5000);
		employee2.setVender(vendor);

		Employee employee3 = new Employee();

		employee3.setEmpId(4);
		employee3.setEmployeeName("siva sankar reddy");
		employee3.setEmpSalary(45000);
		employee3.setVender(vendor);

		Transaction tx = s.beginTransaction();
		
		s.save(employee);
		s.save(employee1);
		s.save(employee2);
		s.save(employee3);
		
		tx.commit();

	}

}
