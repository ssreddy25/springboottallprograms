package aurowiredandcomponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ProductConfiguration.class);
          
		Product p=applicationContext.getBean(Product.class);
		
		System.out.println(p);
		
		p.display();
		
		
		
		
	}

}
