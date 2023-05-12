package com.ojas.entity;

public class Doctor {
	
	public int doctorId;
	public String doctorFullName;
	public String doctorDateOfBrith;
	public String doctorQualificatio;
	public String doctorSpecialist;
	public String doctorEmail;
	public String doctorPhoneNumber;
	public String doctorPassword;
	
	public Doctor(){}

	

	public Doctor(int doctorId, String doctorFullName, String doctorDateOfBrith, String doctorQualificatio,
			String doctorSpecialist, String doctorEmail, String doctorPhoneNumber, String doctorPassword) {
		
		this.doctorId = doctorId;
		this.doctorFullName = doctorFullName;
		this.doctorDateOfBrith = doctorDateOfBrith;
		this.doctorQualificatio = doctorQualificatio;
		this.doctorSpecialist = doctorSpecialist;
		this.doctorEmail = doctorEmail;
		this.doctorPhoneNumber = doctorPhoneNumber;
		this.doctorPassword = doctorPassword;
	}



	public int getDoctorId() {
		return doctorId;
	}



	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}



	public String getDoctorFullName() {
		return doctorFullName;
	}



	public void setDoctorFullName(String doctorFullName) {
		this.doctorFullName = doctorFullName;
	}



	public String getDoctorDateOfBrith() {
		return doctorDateOfBrith;
	}



	public void setDoctorDateOfBrith(String doctorDateOfBrith) {
		this.doctorDateOfBrith = doctorDateOfBrith;
	}



	public String getDoctorQualificatio() {
		return doctorQualificatio;
	}



	public void setDoctorQualificatio(String doctorQualificatio) {
		this.doctorQualificatio = doctorQualificatio;
	}



	public String getDoctorSpecialist() {
		return doctorSpecialist;
	}



	public void setDoctorSpecialist(String doctorSpecialist) {
		this.doctorSpecialist = doctorSpecialist;
	}



	public String getDoctorEmail() {
		return doctorEmail;
	}



	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}



	public String getDoctorPhoneNumber() {
		return doctorPhoneNumber;
	}



	public void setDoctorPhoneNumber(String doctorPhoneNumber) {
		this.doctorPhoneNumber = doctorPhoneNumber;
	}



	public String getDoctorPassword() {
		return doctorPassword;
	}



	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}



	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorFullName=" + doctorFullName + ", doctorDateOfBrith="
				+ doctorDateOfBrith + ", doctorQualificatio=" + doctorQualificatio + ", doctorSpecialist="
				+ doctorSpecialist + ", doctorEmail=" + doctorEmail + ", doctorPhoneNumber=" + doctorPhoneNumber
				+ ", doctorPassword=" + doctorPassword + "]";
	}



	
	
	
	
	
	
	
	

}
