package fundamentalsprograms;

import java.util.Scanner;

public class Calculate {

	public static int  calculate(int number) {
		int coefficent = 0;
		if (number < 0 || number<=0) {
			return -1;
		
		} else if (number % 2 == 0) {
			return number*number;

		} else {

			return number*number*number;

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");

		int number = sc.nextInt();
		

		System.out.println(calculate(number));

}
}
