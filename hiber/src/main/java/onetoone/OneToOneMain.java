package onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMain {

	public static void main(String[] args) {
	
		
              Session session= new Configuration().configure("onetoone.cfg.xml").buildSessionFactory().openSession();
              
              Transaction tx=session.beginTransaction();
				
				  Passport passport=new Passport(); Person person =new Person();
				  
				  person.setName("sivasankarreddy"); person.setNumber(9542884371l);
				  person.setPassport(passport);
				  
				  person.setName("sivasankarreddy"); person.setNumber(9542884371l);
				  
				 
				  passport.setName("india"); passport.setPerson(person);
				  
				  
				  person.setName("sivasankarreddy"); person.setNumber(9542884371l);
				 
				 
				 session.save(person); session.save(passport); tx.commit();
				 
             
              
//              Person person=session.get(Person.class, 1);
//              session.delete(person);
              tx.commit();
              
              
              
	}

}