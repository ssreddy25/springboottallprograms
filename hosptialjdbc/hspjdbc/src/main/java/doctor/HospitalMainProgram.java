package doctor;

import java.sql.SQLException;
import java.util.Scanner;

public class HospitalMainProgram extends HospitalManagement {

	static Scanner sc = new Scanner(System.in);
	static HospitalMainProgram hospitalMainProgram = new HospitalMainProgram();

	public static void main(String[] args) throws SQLException {

		System.out.println("welcome to hosptiamanagement");
		System.out.println("***************************");
		System.out.println("1.admin                   *");
		System.out.println("2.patient                 *");
		System.out.println("3.exist                   *");
		System.out.println("***************************");

		System.out.println("select your choice");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("welcome to the adming portal");

			hospitalMainProgram.admin();
			break;
		case 2:
			System.out.println("welcome to the patient portal");
			hospitalMainProgram.paitent();
			
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("you enter worng choice");
		}

	}

}
