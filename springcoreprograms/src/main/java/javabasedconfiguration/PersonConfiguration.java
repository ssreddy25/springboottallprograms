package javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfiguration {
	
	@Bean
	public Adress adressdetails(){
		return new Adress();
	}
	@Bean
	public Person person(){
		
		 Person p=new Person();
		p.setAdress(adressdetails());
		return p;
		
		
	}

}
