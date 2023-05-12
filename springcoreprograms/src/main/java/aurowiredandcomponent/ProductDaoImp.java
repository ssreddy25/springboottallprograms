package aurowiredandcomponent;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class ProductDaoImp implements ProductDao {

	@Override
	public void createproduct() {
		System.out.println("primaryqulifiersss");
		
	}

	@Override
	public void viewproduct() {
		System.out.println("primaryqulifiersss");
		
	}

	@Override
	public void deleteproduct() {
		System.out.println("primaryqulifiersss");
		
	}

	@Override
	public void allproduct() {
		System.out.println("primaryqulifiersss");
		
	}

}
