package springcollectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaCollectionMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("collection.xml");
		
		javaCollection java=applicationContext.getBean(javaCollection.class);
		
		System.out.println(java.getAddressList());
		System.out.println(java.getAddressSet());
		System.out.println(java.getAddressMap());
		System.out.println(java.getAddressprop());
		

	}

}
