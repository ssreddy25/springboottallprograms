package fundamentalsprograms;

import java.util.Scanner;

public class OddRounder {
	
	public static int oddRounder(int number){
		int coefficent=0;
		if(number<0){
			return -1;
		}else if(number<=0){
			return -2;
		}else if(number%2==0){
			return number;
			
		}else{
			
			coefficent=number/10;
			return (coefficent+1)*10;
			
		}
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");

		int number = sc.nextInt();
		System.out.println("enter the number");
		
		System.out.println(oddRounder(number));

	}

}
