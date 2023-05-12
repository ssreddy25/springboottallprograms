package doctorDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import Hospital.Doctor;
import Hospital.Patient;
import doctorDao.DoctorDao.DoctorDAO;
import hospitalmanagement.HospitalManagement;

public class DoctorDAOimp implements DoctorDAO {
	public static List<Doctor> originalList = new ArrayList<Doctor>();
	public static List<Doctor> tempList = new ArrayList<Doctor>();
	public static List<Patient> plist = new ArrayList<Patient>();
	static Scanner sc = new Scanner(System.in);
	Doctor doctor = null;

	@Override
	public void addDoctor() {
		int n = 1;
		while (n == 1) {
			doctor = new Doctor();
			System.out.println("Enter Doctor ID ");
			String sid = sc.next();
			while (!Pattern.matches("[0-9]{4}", sid)) {
				System.err.println("Please enter Doctor ID must be 4 digit");
				sid = sc.next();

			}
			doctor.setDoctorid(Integer.parseInt(sid));
			System.out.println("Enter Doctor Name");
			doctor.setDoctorname(sc.next());
			while (!Pattern.matches("[A-Z][a-z]*", doctor.getDoctorname())) {
				System.err.println("Please enter Doctors Name First Letter Capitals");
				doctor.setDoctorname(sc.next());
			}
			System.out.println("Enter Doctor Specialization ");
			doctor.setSpecialist(sc.next());
			System.out.println("Enter Doctor FEE ");
			String s1 = sc.next();
			while (!Pattern.matches("^[\\+\\-]{0,1}[0-9]+[\\.\\,][0-9]+$", s1)) {
				System.err.println("Please enter Doctors Fee with decimals");
				s1 = sc.next();
			}
			doctor.setDoctorfee(Double.parseDouble(s1));
			// doctor.setDoctorfee(sc.nextLong());
			originalList.add(doctor);
			System.out.println("If you want to add more doctors enter 1 or else enter any key");
			n = sc.nextInt();

		}
		System.out.println("Successfully Doctors added....");

	}

	@Override
	public List<Doctor> viewDoctor(int doctorId) {
		List<Doctor> doctors = originalList.stream().filter(doctor -> doctor.getDoctorid() == doctorId)
				.collect(Collectors.toList());
		return doctors;
	}

	@Override
	public List<Doctor> viewAlldoctors() {

		return originalList;
	}

	@Override
	public void replaceDoctor(int doctorid) {
		tempList = new ArrayList<Doctor>();
		for (Doctor updatedoctor : originalList) {
			if (updatedoctor.getDoctorid() == doctorid) {
				System.out
						.println("Select Your Choice : 1.Doctor Id 2.Doctor Name 3.Doctor Specialization 4.Doctor Fee");
				int ch = sc.nextInt();
				if (ch == 1) {

					System.out.println("Enter Updated Doctor ID ");
					String sid2 = sc.next();
					while (!Pattern.matches("[0-9]{4}", sid2)) {
						System.err.println("Please enter Doctor ID must be 4 digit");
						sid2 = sc.next();

					}
					doctor.setDoctorid(Integer.parseInt(sid2));
				} else if (ch == 2) {
					System.out.println("Enter Updated Doctor Name");
					updatedoctor.setDoctorname(sc.next());
					while (!Pattern.matches("[A-Z][a-z]*", updatedoctor.getDoctorname())) {
						System.err.println("Please enter Doctor Name Fist letter Capital");
						updatedoctor.setDoctorname(sc.next());
					}
				} else if (ch == 3) {
					System.out.println("Enter Update Doctor Specialzation");
					updatedoctor.setSpecialist(sc.next());
				} else if (ch == 4) {
					System.out.println("Enter Update Doctor Fees");
					// updatedoctor.setDoctorfee(sc.nextDouble());
					String s2 = sc.next();
					while (!Pattern.matches("^[\\+\\-]{0,1}[0-9]+[\\.\\,][0-9]+$", s2)) {
						System.err.println("Please enter Doctors Fee with decimals");
						s2 = sc.next();
					}
					updatedoctor.setDoctorfee(Double.parseDouble(s2));

				} else {
					System.out.println("Doctor not found");
				}
				tempList.add(updatedoctor);
			} else {
				tempList.add(updatedoctor);

			}
		}
		originalList = new ArrayList<Doctor>();
		for (Doctor updatedoctor : tempList) {
			originalList.add(updatedoctor);
		}
		System.out.println("Successfully Doctor Updated.....");
	}

	@Override
	public void removeDoctor(int doctorId) {
		tempList = new ArrayList<Doctor>();

		List<Doctor> doctors = originalList.stream().filter(doctorremove -> doctorremove.getDoctorid() != doctorId)
				.collect(Collectors.toList());
		tempList.addAll(doctors);

		originalList = new ArrayList<Doctor>();

		originalList = tempList.stream().collect(Collectors.toList());
		System.out.println("---Removed Successfully----");

	}

	@Override
	public void appointment() {
		// int x = 1;
		// while (x == 1) {

		boolean type = true;
		tempList = new ArrayList<Doctor>();
		for (Doctor availabledoctor : originalList) {
			if (availabledoctor.getSpecialist().equals(patient.getPatienthealth())) {

				tempList.add(availabledoctor);

			}
		}
		for (Doctor docavailable : tempList) {
			System.out.println(docavailable);
		}
		System.out.println("Which Doctor do you want ?");

		int doctorId = sc.nextInt();

		for (Doctor availabledoctor : tempList) {
			if (availabledoctor.getDoctorid() == doctorId) {
				System.out.println("-----------------------");
				System.out.println("          Fee          ");
				System.out.println("-----------------------");
				System.out.println("  Doctor ID  : " + availabledoctor.getDoctorid());
				System.out.println("  Doctor Name  : " + availabledoctor.getDoctorname());
				System.out.println("  Doctor FEE  : " + availabledoctor.getDoctorfee());
				patient.setFee(availabledoctor.getDoctorfee());
				System.out.println(patient);
				type = false;
				break;
			}

		}
		if (type) {

			System.out.println("Enter valid doctor id");
			appointment();
			// break;

		}
	}

	@Override
	public void back() {
		HospitalManagement.main(null);

	}

	static Patient patient = null;

	public void patientinfo() {
		patient = new Patient();
		System.out.println("-----Please Enter Patient Name-----");
		patient.setPatientname(sc.next());
		while (!Pattern.matches("[A-Z][a-z]*", patient.getPatientname())) {
			System.err.println("Please Enter Patients Name Fist letter Capital");
			patient.setPatientname(sc.next());
		}
		System.out.println("-----Please Enter Patient Mobile number----");
		String s3 = sc.next();

		while (!Pattern.matches("[0-9]{10}", s3)) {
			System.err.println("Please Enter Mobile number must be 10 digits only");
			s3 = sc.next();
		}

		patient.setPatientmobile(Long.parseLong(s3));
		System.out.println("-----Please Enter Patient Email----");
		patient.setPatientemail(sc.next());

		System.out.println("----Please Enter Patient AAdhar number----");

		String s4 = sc.next();

		while (!Pattern.matches("[0-9]{12}", s4)) {
			System.err.println("Please Enter AAdhar numbers must be 12 digits");
			s4 = sc.next();
		}
		patient.setPatientaadhar(Long.parseLong(s4));
		System.out.println("-----Based on your Health issue Enter Doctor Specialization----");
		patient.setPatienthealth(sc.next());
		plist.add(patient);
	}

	@Override
	public List<Patient> viewPatient() {

		return plist;
	}

}
