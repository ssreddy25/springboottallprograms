package fundamentalsprograms;

import java.util.Scanner;

public class Palindrome {

	public static int isPalindrome(int number) {
		int poly = number;
		int num = number;
		int sum = 0, remder = 0, coefficent = 0;

		if (number <= 0) {
			return sum = -1;
		} else if (number > 999) {
			return sum = -2;

		} else if (num <= 999) {

			while (num != 0) {

				remder = num % 10;
				sum = sum * 10 + remder;
				coefficent = num / 10;
				num = coefficent;
			}
			if (sum == poly) {
				return sum = 1;
			} else {
				return sum = 0;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");

		int number = sc.nextInt();
		
		System.out.println(isPalindrome(number));

	}

}
