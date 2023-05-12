package smapleprogram;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a postive interger number");
		int num1 = sc.nextInt();
		int num = num1;
		int rmender = 0;
		int coeficent = 0;
		int sum = 0;

		if (num == 1) {
			System.out.println("num is happy numbere");

		}

		while (num != 1) {
           
			
			rmender = num % 10;
			coeficent = num / 10;
       System.out.println(rmender);
       System.out.println(coeficent);
			sum = (rmender * rmender + coeficent * coeficent);
			
			System.out.println(sum);

			if (sum == 1) {
				System.out.println(num + "it is happy number");
			} else {
				num = sum;
			}

		}

	}

}
