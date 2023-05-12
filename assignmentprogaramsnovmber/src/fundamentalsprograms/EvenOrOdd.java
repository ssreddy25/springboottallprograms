package fundamentalsprograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static String  isEvenOrOdd(int number) {
		int coefficent = 0;
		if (number < 0 || number<=0) {
			return "invalid input";
		
		} else if (number % 2 == 0) {
			return "Even";

		} else {

			return "Ood";

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");

		int number = sc.nextInt();
		

		System.out.println(isEvenOrOdd(number));
	}

}
