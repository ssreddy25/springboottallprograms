package docter;

public class Doctor {
	private String doctorId;
	private String doctorName;
	private String doctorSpecialist;
	private double doctorFee;
	
	public Doctor (){}

	public Doctor(String doctorId, String doctorName, String doctorSpecialist, double doctorFee) {
		
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorSpecialist = doctorSpecialist;
		this.doctorFee = doctorFee;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSpecialist() {
		return doctorSpecialist;
	}

	public void setDoctorSpecialist(String doctorSpecialist) {
		this.doctorSpecialist = doctorSpecialist;
	}

	public double getDoctorFee() {
		return doctorFee;
	}

	public void setDoctorFee(double doctorFee) {
		this.doctorFee = doctorFee;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorSpecialist=" + doctorSpecialist
				+ ", doctorFee=" + doctorFee + "]";
	}

}
