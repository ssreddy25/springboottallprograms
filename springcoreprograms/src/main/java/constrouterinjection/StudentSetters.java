package constrouterinjection;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentSetters {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("constrouter.xml");
		
		Student student=applicationContext.getBean(Student.class);
		
		System.out.println(student);
		
//		BeanFactory beanFactory=new AnnotationConfigApplicationContext("setreinjection.xml");
//		
//		Student student1=beanFactory.getBean(Student.class);
//		
//		System.out.println(student1);
	}

}
