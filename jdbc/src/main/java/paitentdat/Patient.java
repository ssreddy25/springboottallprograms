package paitentdat;

public class Patient {

	private String patientFristName;
	private String patientLastName;
	private long patientAdhhar;
	private long mobileNumber;
	private String emailId;
	private String bloodGroup;
	private String patientProblem;
	private String address;

	public Patient() {
	}

	public Patient(String patientFristName, String patientLastName, long patientAdhhar, long mobileNumber,
			String emailId, String bloodGroup, String patientProblem, String address) {
		super();
		this.patientFristName = patientFristName;
		this.patientLastName = patientLastName;
		this.patientAdhhar = patientAdhhar;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.bloodGroup = bloodGroup;
		this.patientProblem = patientProblem;
		this.address = address;
	}

	public String getPatientFristName() {
		return patientFristName;
	}

	public void setPatientFristName(String patientFristName) {
		this.patientFristName = patientFristName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getPatientProblem() {
		return patientProblem;
	}

	public void setPatientProblem(String patientProblem) {
		this.patientProblem = patientProblem;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPatientAdhhar() {
		return patientAdhhar;
	}

	public void setPatientAdhhar(long patientAdhhar) {
		this.patientAdhhar = patientAdhhar;
	}

	@Override
	public String toString() {
		return "Patient [patientFristName=" + patientFristName + ", patientLastName=" + patientLastName
				+ ", patientAdhhar=" + patientAdhhar + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", bloodGroup=" + bloodGroup + ", patientProblem=" + patientProblem + ", address=" + address + "]";
	}

}
