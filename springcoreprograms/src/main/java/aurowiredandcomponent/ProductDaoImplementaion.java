package aurowiredandcomponent;

import org.springframework.stereotype.Component;

@Component
public class ProductDaoImplementaion implements ProductDao {

	@Override
	public void createproduct() {
		System.out.println("product create product");
		
	}

	@Override
	public void viewproduct() {
		System.out.println("product view product");
		
	}

	@Override
	public void deleteproduct() {
		System.out.println("product delete product");
		
	}

	@Override
	public void allproduct() {
		System.out.println("product all product");
		
	}

}
