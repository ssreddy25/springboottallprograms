package lamdaexpeersionsandmethodstreams;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ProductDisplay {

//	public static void display() {
//
//		System.out.println("form the static method refrence");
//	}
//	
//	
//
//	public void display1() {
//
//		System.out.println("form the  not static static method refrence");
//	}
	
	public ProductDisplay() {
		
		System.out.println("from the constructor refrence");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Product product =new Product() {
//
//			@Override
//			public void display() {
//			System.out.println("dispaly product");
//				
//			}
//			
//		};
//		
//		product.display();
//
//		Product product1 = (i) -> System.out.println("dispaly product using lamda experssion :" + i);
//
//		product1.display(5);
		
		
		///static method refrence 
		
//		Product product12 =ProductDisplay::display;
//		
//		product12.display();
//		
//		ProductDisplay productDisplay = new ProductDisplay();
//		
//				Product nonstaic = productDisplay::display1;
//				nonstaic.display();
				
//				Product con=ProductDisplay::new;
//				
//				con.display();
		
		
		//not static method rfence
		

		// Function

		Function<Integer, String> function = number -> number + 5 + "";

		System.out.println(function.apply(5));
		
		//method r
		Function<String, char[]>  method =String::toCharArray;
		
//		System.out.println(method.apply("java"));
		
		char[] apply = method.apply("fullstackdeveloper");
		
		for(char c:apply) {
			System.out.println(c);
		}
		
		
	String number=	UUID.randomUUID().toString();
	int num= (int) (Math.random()*999+1000);
	
	System.out.println(num);
	
	System.out.println(number);
		//supplier
		Supplier<Double> supplier = Math::random;
		
		
		System.out.println(supplier.get());
		
		
		Consumer<Integer> con =(i)->System.out.println(i);
		
		con.accept(5);
		
		
		
		

	}

}
