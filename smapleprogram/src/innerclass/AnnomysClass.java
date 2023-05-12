package innerclass;

import java.util.Scanner;

@FunctionalInterface
interface Race {

	public void run();

}

public class AnnomysClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("functionInterface examples");

		// Race race = new Race() {
		//
		// @Override
		// public void run() {
		// System.out.println("only 18 year above age boy/girl are praticipaid
		// ");
		//
		// System.out.println("enter the your age ");
		//
		// int age = sc.nextInt();
		// if (age >= 18) {
		// System.out.println("your aligble for the race");
		// } else {
		// System.out.println("your not aligble for the race because your age is
		// 18 below ");
		// }
		//
		// }
		//
		// };
		// race.run();//through the annyomus class we provided the method
		// imlementaion.

		// we over come the length of the code to move to the lamada expersion

		Race race = () -> {
			System.out.println("only 18 year above age boy/girl are praticipaid ");
			System.out.println("enter the your age ");
			int age = sc.nextInt();
			if (age >= 18) {
				System.out.println("your aligble for the race");
			} else {
				System.out.println("your not aligble for the race because your age is 18 below ");
			}
		};
		
		race.run();
	}

}
