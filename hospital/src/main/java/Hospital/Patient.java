package Hospital;

public class Patient {
	String patientname;
	long patientmobile;
	String patientemail;
	long patientaadhar;
	String patienthealth;
	double fee;

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public long getPatientmobile() {
		return patientmobile;
	}

	public void setPatientmobile(long patientmobile) {
		this.patientmobile = patientmobile;
	}

	public String getPatientemail() {
		return patientemail;
	}

	public void setPatientemail(String patientemail) {
		this.patientemail = patientemail;
	}

	public long getPatientaadhar() {
		return patientaadhar;
	}

	public void setPatientaadhar(long patientaadhar) {
		this.patientaadhar = patientaadhar;
	}

	public String getPatienthealth() {
		return patienthealth;
	}

	public void setPatienthealth(String patienthealth) {
		this.patienthealth = patienthealth;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "\n" + "Patient Details" + "\n" + "-------------------" + "\n" + "Patient Name=" + patientname + "\n"
				+ "Patient Mobile=" + patientmobile + "\n" + "Patient email=" + patientemail + "\n"
				+ "Patient aadhar number=" + patientaadhar + "\n" + "Patient health issue=" + patienthealth + "\n"
				+ "fee=" + fee;
	}

}
