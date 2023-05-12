package Hospital;

public class Doctor {
	private int doctorid;
	private String doctorname;
	private String specialist;
	private double doctorfee;

	public Doctor() {

	}

	public Doctor(int doctorid, String doctorname, String specialist, double doctorfee) {

		this.doctorid = doctorid;
		this.doctorname = doctorname;
		this.specialist = specialist;
		this.doctorfee = doctorfee;
	}

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public double getDoctorfee() {
		return doctorfee;
	}

	public void setDoctorfee(double doctorfee) {
		this.doctorfee = doctorfee;
	}

	@Override
	public String toString() {
		return doctorid + "\t" + doctorname + "\t" + specialist + "\t" + doctorfee;
	}
}
