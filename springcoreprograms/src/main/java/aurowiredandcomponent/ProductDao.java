package aurowiredandcomponent;

import org.springframework.stereotype.Component;

@Component
public interface ProductDao {
	
	public void createproduct();

	public void viewproduct();
	public void deleteproduct();
	public void allproduct();

}
