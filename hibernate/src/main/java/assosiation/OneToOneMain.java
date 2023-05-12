package assosiation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMain {

	public static void main(String[] args) {
		
        Configuration cfg=new Configuration();
		
		cfg.configure("onetoone.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		AuthorOneToOne author=new AuthorOneToOne();
		author.setAuthorID(1);
		author.setAuthourName("mannu anna");
		
		BookOneToOne book=new BookOneToOne();
		
		book.setBookId(1);
		book.setBookName("400 days");
		book.setBookPrice(400.00);
		book.setAuthor(author);
		
		
		s.save(book);
		tx.commit();
	}

}
