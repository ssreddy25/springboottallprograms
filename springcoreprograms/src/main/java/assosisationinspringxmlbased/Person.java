package assosisationinspringxmlbased;

public class Person {
	
	private String fristName;
	private String lastName;
	private Address address;
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Person(String fristName, String lastName, Address address) {
		
		this.fristName = fristName;
		this.lastName = lastName;
		this.address = address;
	}
	public Person() {
		
	}
	@Override
	public String toString() {
		return "Person [fristName=" + fristName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
	
	
	
	

}
