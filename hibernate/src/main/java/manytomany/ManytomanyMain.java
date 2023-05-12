package manytomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManytomanyMain {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();

		cfg.configure("manytomany.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();
		
		
		
		Answers answers=new Answers();
		
		answers.setAnswer("java is high level programin language");
		
		answers.setPostedBy("siva sankar reddy");
		
       Answers answers1=new Answers();
		
		answers1.setAnswer("java is platform indepandent");
		
		answers1.setPostedBy("reddy");
		
		  ArrayList<Answers> l1=new ArrayList<Answers>();
		  
		  l1.add(answers);
		  
		  l1.add(answers1);
		  
		  Qusation q=new Qusation();
			
			q.setQuesationName("what is the java");
			q.setAnswers(l1);
			
			Transaction tx=s.beginTransaction();
			
			s.save(q);
			
			tx.commit();
		  
		


	}

}
