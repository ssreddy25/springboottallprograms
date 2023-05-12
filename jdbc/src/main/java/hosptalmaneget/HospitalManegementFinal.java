package hosptalmaneget;

import java.util.Scanner;

public class HospitalManegementFinal {

	public static void main(String[] args) {

		HosptitalManagement hosptitalManagement = new HosptitalManagement();
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("************************************");
			System.out.println("    Hospital Manegement                ");
			System.out.println("************************************");
			System.out.println("|    1.Admin                       |");
			System.out.println("|    2.Patient                     |");
			System.out.println("|    3.Exit                        |");
			System.out.println("************************************");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				hosptitalManagement.adminMenu();
				break;
			case 2:
				hosptitalManagement.PatientMenu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("select the 1 to 3 only");
			}
		}

	}

}
