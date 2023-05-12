package fundamentalsprograms;

import java.util.Scanner;

public class Even {
	
	public static int isEven(int number){
		
		

		if (number <= 0) {
			return  -1;
		}
		else if(number%2==0){
			return 1;
		}else{
			return 0;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");

		int number = sc.nextInt();
		
		System.out.println(isEven(number));

	}

}
