package javabasedconfiguration;

public class Person {
	
	private String fristName;
	private String lastName;
	private String stateName;
	private Adress adress;
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
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public Person() {
		
	}
	@Override
	public String toString() {
		
		adress.addressDetails();
		return "Person [fristName=" + fristName + ", lastName=" + lastName + ", stateName=" + stateName + "]";
	}
	
	
	

}
