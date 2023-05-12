package fundamentalsprograms;

import java.util.Scanner;

public class SumOfMultiples {

	public static int sumofMultiples(int number1, int number2, int number3) {
		int num1 = 0, num2 = 0, num3 = 0, coeeficent = 0, coeeficent1 = 0, coeeficent2 = 0;
		int sum = 0;

		if (number1 <= 0 || number2 <= 0 || number3 <= 0) {
			return -1;
		} else if (number1 >= 0 && number2 >= 0 && number3 >= 0) {

			if (number1 % 10 == 0) {
				num1 = number1;
				sum = sum + num1;
			} else {
				coeeficent = number1 / 10;
				sum =sum + (coeeficent + 1) * 10;
				

			}
			if (number2 % 10 == 0) {
				num2 = number2;
				sum = sum + num2;
			} else {
				coeeficent1 = number2 / 10;
				sum =sum + (coeeficent1 + 1) * 10;
				

			}
			if (number3 % 10 == 0) {
				num3 = number3;
				sum = sum + num3;
			} else {
				coeeficent2 = number3 / 10;
				sum = sum +(coeeficent2 + 1) * 10;
				
				

			}
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");

		int number1 = sc.nextInt();
		System.out.println("enter the number");
		int number2 = sc.nextInt();
		System.out.println("enter the number");
		int number3 = sc.nextInt();

		System.out.println(sumofMultiples(number1, number2, number3));

	}

}
