package hospitalmanagement;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Hospital.Doctor;
import Hospital.Patient;
import doctorDao.DoctorDAOimp;

class ListEmptyException extends RuntimeException {
	ListEmptyException(String msg) {
		super(msg);
	}
}

public class DoctorDetails {
	static Scanner sc = new Scanner(System.in);
	static DoctorDAOimp dao = new DoctorDAOimp();

	public static void adminMainMenu() {
		System.out.println("-----------------------------------");
		System.out.println("|        ADMIN MAIN MENU          |");
		System.out.println("-----------------------------------");
		System.out.println("          1. ADD DOCTOR            ");
		System.out.println("          2. VIEW DOCTOR           ");
		System.out.println("          3. VIEW ALLDOCTORS       ");
		System.out.println("          4. REPLACE DOCTOR        ");
		System.out.println("          5. REMOVE DOCTOR         ");
		System.out.println("          6. Check Patients List   ");
		System.out.println("          7. View Particular Bills ");
		System.out.println("          8. BACK                  ");
		System.out.println("-----------------------------------");
		System.out.println("Enter Your Choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			dao.addDoctor();
			adminMainMenu();
			break;
		case 2:

			System.out.println("Enter Search Doctor Id");
			List<Doctor> searchdoctor = dao.viewDoctor(sc.nextInt());
			System.out.println("DoctorID" + "   " + "DName" + "\t" + "DSpecialization" + "       " + "Fees");
			System.out.println("-----------------------------------");
			System.out.println(searchdoctor);
			adminMainMenu();
			break;
		case 3:
			List<Doctor> doctor = dao.viewAlldoctors();
			System.out.println("DoctorID" + "   " + "DName" + "\t" + "DSpecialization" + "      " + "Fees");
			System.out.println("-----------------------------------");
			for (Doctor viewdoctor : doctor) {
				System.out.println(viewdoctor);
			}
			adminMainMenu();
			break;
		case 4:
			System.out.println("Which doctor do you want to update");
			dao.replaceDoctor(sc.nextInt());
			adminMainMenu();
			break;
		case 5:
			System.out.println("WHich Doctor do you want to delete");
			dao.removeDoctor(sc.nextInt());
			adminMainMenu();
			break;
		case 6:
			List<Patient> patient = dao.viewPatient();

			// Patient ListEmpty Exception is used here
			if (patient.isEmpty()) {
				try {
					throw new ListEmptyException("Patient List is Empty");
				} catch (Exception e1) {

					System.err.println("Patient List is Empty");
				}

			}

			for (Patient patients : patient) {
				System.out.println(patients);
			}

			adminMainMenu();
			break;
		case 7:
			System.out.println("Enter the range of bills");

			List<Patient> patientt = dao.viewPatient();
			if (patientt.isEmpty()) {
				try {
					throw new ListEmptyException("Patient List is Empty");
				} catch (Exception e1) {

					System.err.println("No Bills Generated");
				}

			} else {
				double fees = sc.nextDouble();

				List<Patient> patients = dao.viewPatient();

				List<Patient> patien = patients.stream().filter(e -> e.getFee() >= fees).collect(Collectors.toList());
				if (patien.isEmpty()) {
					System.err.println("No Patient Found for the given Bill range");
				} else {
					for (Patient p : patien)
						System.out.println(p);
				}
			}
		case 8:
			dao.back();
			break;
		default:
			System.out.println("Please Select your range 1-6 only");

		}

	}

	public static void patientMainMenu() {
		System.out.println("-----------------------------------");
		System.out.println("|       PATIENT MAIN MENU         |");
		System.out.println("-----------------------------------");
		System.out.println("          1. VIEW DOCTOR           ");
		System.out.println("          2. VIEW ALLDOCTORS       ");
		System.out.println("          3. APPOINTMENT           ");
		System.out.println("          4. BACK                  ");
		System.out.println("-----------------------------------");
		System.out.println("Enter Your Choice");
		int ch = sc.nextInt();
		switch (ch) {

		case 1:
			System.out.println("Enter Search Doctor Id");
			String sid3 = sc.next();
			while (!Pattern.matches("[0-9]{4}", sid3)) {
				System.err.println("Please enter Doctor ID must be 4 digit");
				sid3 = sc.next();

			}
			List<Doctor> searchdoctor = dao.viewDoctor(Integer.parseInt(sid3));

			System.out.println("DoctorID" + "\t" + "DName" + "\t" + "DSpecialization" + "\t" + "Fees");
			System.out.println("-----------------------------------");
			System.out.println(searchdoctor);
			patientMainMenu();
			break;
		case 2:
			List<Doctor> doctor = dao.viewAlldoctors();
			System.out.println("DoctorID" + "\t" + "DName" + "\t" + "DSpecialization" + "\t" + "Fees");
			System.out.println("-----------------------------------");
			for (Doctor viewdoctor : doctor) {
				System.out.println(viewdoctor);
			}
			patientMainMenu();
			break;
		case 3:
			dao.patientinfo();
			dao.appointment();

			patientMainMenu();
			break;

		case 4:
			dao.back();
			break;
		default:
			System.out.println("Please Select your range 1-4 only");

		}
	}
}
