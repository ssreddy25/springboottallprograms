package fundamentalsprograms;

import java.util.Scanner;

public class GreatestNumber {
	
	public static int isGreatest(int number1,int number2){
		
		if(number1<0 || number2<0){
			return -1;
		}
		else if(number1<=0 || number2<=0){
			return -2;
		}
		else if(number1<number2){
			return number2;
			
		}else{
			
			return number1;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");

		int number1 = sc.nextInt();
		System.out.println("enter the number");
		int number2 = sc.nextInt();
		
		
		System.out.println(isGreatest(number1 ,number2));

		

	}

}
