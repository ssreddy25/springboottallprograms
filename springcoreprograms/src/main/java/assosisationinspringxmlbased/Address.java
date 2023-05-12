package assosisationinspringxmlbased;

public class Address {
	
	private String villageName;
	private String manadalName;
	private String districtName;
	private String stateName;
	private int pinNumber;
	public Address() {
		
	}
	public Address(String villageName, String manadalName, String districtName, String stateName, int pinNumber) {
		
		this.villageName = villageName;
		this.manadalName = manadalName;
		this.districtName = districtName;
		this.stateName = stateName;
		this.pinNumber = pinNumber;
	}
	
	
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public String getManadalName() {
		return manadalName;
	}
	public void setManadalName(String manadalName) {
		this.manadalName = manadalName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	@Override
	public String toString() {
		return "Address [villageName=" + villageName + ", manadalName=" + manadalName + ", districtName=" + districtName
				+ ", stateName=" + stateName + ", pinNumber=" + pinNumber + "]";
	}
	
	
	
	
	

}
