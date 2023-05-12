package collectionsorting;

public class LaptopComparator {
	
	String laptopName;
	int id;
	double price;
	public LaptopComparator(String laptopName, int id, double price) {
		
		this.laptopName = laptopName;
		this.id = id;
		this.price = price;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "LaptopComparator [laptopName=" + laptopName + ", id=" + id + ", price=" + price + "]";
	}
	
	
	

}
