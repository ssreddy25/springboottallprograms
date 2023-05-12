package aurowiredandcomponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("product")
public class Product {
	
	@Value("123")
	private int productNumber;
	@Value("tv")
	private String productName;
	@Value("500000")
	private String productPrice;
	
	@Autowired
	@Qualifier("productDaoImplementaion")
	private ProductDao productDao;

	public Product() {
		
	}
	
	public void display(){
		
		productDao.createproduct();
		productDao.allproduct();
		productDao.deleteproduct();
		productDao.viewproduct();
	}

	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productDao=" + productDao + "]";
	}
	
	
	
	
	

}
