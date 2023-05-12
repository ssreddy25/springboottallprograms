package doctordao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import docter.Doctor;
import hosptalmaneget.HospitalManegementFinal;
import paitentdat.Patient;

public class DoctorDapImp {

	public static List<Doctor> doctorOriganl = new ArrayList<Doctor>();
	public static List<Doctor> doctorTempary = new ArrayList<Doctor>();
	public static List<Patient> patientOriganl = new ArrayList<Patient>();
	public static List<Patient> patientTemp = new ArrayList<Patient>();
	static Scanner sc = new Scanner(System.in);
	Doctor doctor = null;
	Patient patient = null;

	@Override
	public void addDoctor() {

		int n = 1;
		while (n == 1) {
			doctor = new Doctor();

			System.out.println(" enter the doctor ditalis");
			System.out.println("enter the doctor ID");
			doctor.setDoctorId(sc.next());
			System.out.println("enter the doctor Name");
			doctor.setDoctorName(sc.next());
			System.out.println("enter the doctor Specialist");
			doctor.setDoctorSpecialist(sc.next());
			System.out.println("enter the doctor fee");
			doctor.setDoctorFee(sc.nextDouble());
			doctorOriganl.add(doctor);
			System.out.println("if want to add more doctor enter the one 1 otherwise 2");
			n = sc.nextInt();
		}
		System.out.println("succes fully added doctor");

	}

	@Override
	public Doctor viewDoctor(String doctorId) {
		doctor = new Doctor();
		for (Doctor serachDoctor : doctorOriganl) {
			if (serachDoctor.getDoctorId().equals(doctorId)) {
				doctor = serachDoctor;
				break;
			}

		}

		return doctor;
	}

	@Override
	public List<Doctor> viewAllDoctor() {

		return doctorOriganl;
	}

	@Override
	public void updateDoctor(String doctorId) {
		doctorTempary = new ArrayList<Doctor>();
		for (Doctor serachDoctor : doctorOriganl) {
			if (serachDoctor.getDoctorId().equals(doctorId)) {
				System.out.println("select your choice 1.Id 2.Name 3.specisilist 4.fee");
				int ch = sc.nextInt();
				if (ch == 1) {
					System.out.println("enter the doctor ID");
					serachDoctor.setDoctorId(sc.next());
				} else if (ch == 2) {
					System.out.println("enter the doctor Name");
					serachDoctor.setDoctorName(sc.next());
				} else if (ch == 3) {
					System.out.println("enter the doctor Specialist");
					serachDoctor.setDoctorSpecialist(sc.next());
				} else if (ch == 4) {
					System.out.println("enter the doctor fee");
					serachDoctor.setDoctorFee(sc.nextDouble());
				} else {
					System.out.println("doctor  is not avilable");
				}
				doctorTempary.add(serachDoctor);
			} else {
				doctorTempary.add(serachDoctor);
			}
		}

		doctorOriganl = new ArrayList<Doctor>();
		for (Doctor updateDoctor : doctorTempary) {
			doctorOriganl.add(updateDoctor);
		}
		System.out.println("suceesfully docotor updated");

	}

	@Override
	public void deleteDoctor(String doctorId) {
		doctorTempary = new ArrayList<Doctor>();
		for (Doctor deleteDocotor : doctorOriganl) {
			if (deleteDocotor.getDoctorId().equals(doctorId)) {

			} else {
				doctorTempary.add(deleteDocotor);
			}
		}
		doctorOriganl = new ArrayList<Doctor>();
		for (Doctor deleteDoctor : doctorTempary) {
			doctorOriganl.add(deleteDoctor);
		}
		System.out.println("suceesfully docotor deleted");

	}

	@Override
	public void appointment() {
		patient = new Patient();
		doctor = new Doctor();
		doctorTempary = new ArrayList<Doctor>();
		for (Doctor avilableDoctor : doctorOriganl) {

			System.out.println(avilableDoctor);

		}

		System.out.println("enter patient details");
		System.out.println("enter the your fristname");
		patient.setPatientFristName(sc.next());
		System.out.println("enter patient lastname");
		patient.setPatientLastName(sc.next());
		System.out.println("enter the patient AdahrNuber");
		patient.setPatientAdhhar(sc.nextLong());
		System.out.println("enter the patient moblienumber");
		patient.setMobileNumber(sc.nextLong());
		System.out.println("enter the paitent emailid");
		patient.setEmailId(sc.next());
		System.out.println("enter the paitent blood gruop");
		patient.setBloodGroup(sc.next());
		System.out.println("enter the patient problem");
		patient.setPatientProblem(sc.next());
		System.out.println("enter the patient address");
		patient.setAddress(sc.next());
		patientOriganl.add(patient);
		System.out.println(" enter the doctor id based on your helth issues  ");
		doctor.setDoctorId(sc.next());

		for (Doctor avidoc : doctorOriganl) {
			if (avidoc.getDoctorId().equals(doctor.getDoctorId())) {
				System.out.println("-------------------------------------------");
				System.out.println("|                  Bill                   |");
				System.out.println("-------------------------------------------");
				System.out.println("   doctorId         :   " + avidoc.getDoctorId());
				System.out.println("   doctor Name       :   " + avidoc.getDoctorName());
				System.out.println("   doctor Spesilist  :   " + avidoc.getDoctorSpecialist());
				System.out.println("---------------------------------------------");

				System.out.println("        patient deatials                      ");
				System.out.println("-------------------------------------------");
				System.out.println("patient Frist Name       :" + patient.getPatientFristName());
				System.out.println("patient last Name        :" + patient.getPatientLastName());
				System.out.println("patient adhar Number     :" + patient.getPatientAdhhar());
				System.out.println("patient Mobile Number    :" + patient.getMobileNumber());
				System.out.println("patient gamai            :" + patient.getEmailId());
				System.out.println("patient blood group      :" + patient.getBloodGroup());
				System.out.println("patient problem          :" + patient.getPatientProblem());
				System.out.println("patient address          :" + patient.getAddress());
				System.out.println("---------------------------------------------");

				System.out.println("   Total Amount      :   " + avidoc.getDoctorFee());
				System.out.println("----------------------------------------------");
				doctor = avidoc;
				break;
			}
			// else{
			// System.out.println("you enter the worng doctorid ");
			// System.out.println("you agian enter the corret the doctor id");
			// DoctorDapImp doctorDapImp=new DoctorDapImp();
			// doctorDapImp.appointment();
			// }

		}
		System.out.println("hope you better");

	}

	
	public void back() {
		HospitalManegementFinal.main(null);

	}

	
	public Patient viewPatient(long patientAdhhar) {
		patient = new Patient();
		for (Patient serachpatient : patientOriganl) {
			if (serachpatient.getPatientAdhhar() == patientAdhhar) {
				patient = serachpatient;
				break;
			}

		}

		return patient;
	}


	public List<Patient> viewAllPatient() {

		return patientOriganl;
	}

}
