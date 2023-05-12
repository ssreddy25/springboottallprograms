package autowirenobytypebynameconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryMain {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("autowire.xml");
		
		Country country=applicationContext.getBean(Country.class);
		
		country.display();
	}

}
