package assosisationinspringxmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class personMain {

	public static void main(String[] args) {
	
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("assosiation.xl.xml");
		
		Person person=applicationContext.getBean(Person.class);
		
		System.out.println(person);
	}

}
