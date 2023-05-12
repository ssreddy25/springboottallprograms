package hosptalmaneget;

import java.util.List;
import java.util.Scanner;

import docter.Doctor;
import doctordao.DoctorDapImp;
import paitentdat.Patient;

public class HosptitalManagement {

	static Scanner sc = new Scanner(System.in);
	static DoctorDapImp doctorDapImp = new DoctorDapImp();

	public static void adminMenu() {
		while (true) {

			System.out.println("************************************");
			System.out.println("     ADMIN Main MENU                  ");
			System.out.println("************************************");
			System.out.println("|    1.Add Doctor                      |");
			System.out.println("|    2.View Doctor                     |");
			System.out.println("|    3.View all Doctor                 |");
			System.out.println("|    4.Replace Doctor                   |");
			System.out.println("|    5.Remove Doctor                   |");
			System.out.println("|    6.View All Paitent                   |");
			System.out.println("|    7.View  Paitent                   |");
			System.out.println("|    8.back to main menu               |");
			System.out.println("*****************************************");
			System.out.println("choose your choice ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				doctorDapImp.addDoctor();
				adminMenu();
				break;
			case 2:
				System.out.println("enter the doctor id");
				String doctorId = sc.next();
				Doctor doctor = doctorDapImp.viewDoctor(doctorId);
				System.out.println("DoctorID" + "\t" + "DName" + "\t" + "DSpecialization" + "\t" + "Fees");
				System.out.println("-----------------------------------");
				System.out.println(doctor);
				adminMenu();
				break;
			case 3:

				List<Doctor> doctor1 = doctorDapImp.viewAllDoctor();

				System.out.println("DoctorID" + "\t" + "DName" + "\t" + "DSpecialization" + "\t" + "Fees");
				System.out.println("-----------------------------------");
				for (Doctor alldoctor : doctor1) {
					System.out.println(alldoctor);

				}
				adminMenu();
				break;
			case 4:
				System.out.println("enter the doctor id");
				String doctorId2 = sc.next();
				doctorDapImp.updateDoctor(doctorId2);
				adminMenu();
				break;
			case 5:
				System.out.println("enter the doctor id");
				String doctorId3 = sc.next();
				doctorDapImp.deleteDoctor(doctorId3);
				adminMenu();
				break;
			case 6:
				List<Patient> paitnet = doctorDapImp.viewAllPatient();
				for (Patient paitnt : paitnet) {
					System.out.println(paitnt);
				}
				adminMenu();
				break;
			case 7:
				System.out.println("enter the patient adharnumber i");
				long paitentadhar = sc.nextLong();
				Patient paitent = doctorDapImp.viewPatient(paitentadhar);
				System.out.println("paitent details");
				System.out.println("-----------------------------------");
				System.out.println(paitent);
				adminMenu();
				break;

			case 8:
				doctorDapImp.back();
				break;
			default:
				System.out.println("select the 1 to 8 only");
			}

		}
	}

	public static void PatientMenu() {

		while (true) {

			System.out.println("************************************");
			System.out.println("     Patient Main MENU                  ");
			System.out.println("************************************");
			System.out.println("|    1.View Doctor                     |");
			System.out.println("|    2.View all Doctor                 |");
			System.out.println("|    3.Apoitment Doctor                   |");
			System.out.println("|    4.back to main menu               |");
			System.out.println("*****************************************");
			System.out.println("choose your choice ");
			int ch = sc.nextInt();
			switch (ch) {

			case 1:
				System.out.println("enter the doctor id");
				String doctorId = sc.next();
				Doctor doctor = doctorDapImp.viewDoctor(doctorId);
				System.out.println("DoctorID" + "\t" + "DName" + "\t" + "DSpecialization" + "\t" + "Fees");
				System.out.println("-----------------------------------");
				System.out.println(doctor);
				PatientMenu();
				break;
			case 2:

				List<Doctor> doctor1 = doctorDapImp.viewAllDoctor();

				System.out.println("DoctorID" + "\t" + "DName" + "\t" + "DSpecialization" + "\t" + "Fees");
				System.out.println("-----------------------------------");
				for (Doctor alldoctor : doctor1) {
					System.out.println(alldoctor);

				}
				PatientMenu();
				break;
			case 3:
				doctorDapImp.appointment();
				PatientMenu();
				break;

			case 4:
				doctorDapImp.back();
				break;
			default:
				System.out.println("select the 1 to 4 only");

			}

		}
	}

}
