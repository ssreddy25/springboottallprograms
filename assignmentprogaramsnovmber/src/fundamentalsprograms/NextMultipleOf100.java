package fundamentalsprograms;

import java.util.Scanner;

public class NextMultipleOf100 {

	public static int getNextMultipleOf100(int number) {
		int num = 0;
		int add = 0;
		int coeeficent = 0;

		if (number <= 0) {
			return num = -1;
		}
		 else {

			coeeficent = number / 100;

			add = (coeeficent + 1) * 100;
			return add;
		 }

		
	}
		

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int number=sc.nextInt();
		
		System.out.println(getNextMultipleOf100(number));

	}

}
