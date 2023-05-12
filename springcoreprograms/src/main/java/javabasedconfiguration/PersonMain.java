package javabasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(PersonConfiguration.class);
		
		Person p=applicationContext.getBean(Person.class);
		
		p.setFristName("sivasankarreddy");
		p.setLastName("uppaluru");
		p.setStateName("andrapradesh");
		
		System.out.println(p);
		

	}

}
