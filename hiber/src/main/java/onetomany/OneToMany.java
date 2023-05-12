package onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {
		
		Session ssession=new Configuration().configure("onetomany.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=ssession.beginTransaction();
		Persons persons=new Persons();
		Phone phone=new Phone();
		phone.setNumber(9542884372l);
		phone.setPerson(persons);
		Phone phone1=new Phone();
		phone1.setNumber(9542884373l);
		phone.setPerson(persons);
		Phone phone2=new Phone();
		phone2.setNumber(9542884374l);
		phone.setPerson(persons);
		
		List<Phone> ph=new ArrayList<>();
		ph.add(phone);
		ph.add(phone1);
		ph.add(phone2);
		
		
		
		persons.setName("sivasankar");
		persons.setPhone(ph);
		
		ssession.save(persons);
		tx.commit();
		
		
		

	}

}
