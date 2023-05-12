package fundamentalsprograms;

import java.util.Scanner;

public class FindSign {
	
	public static int findSign(int number){
		
		if(number<0){
			return -1;
		}else if(number<=0){
			return 0;
		}else{
			return 1;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");

		int number = sc.nextInt();
		System.out.println("enter the number");
		
		System.out.println(findSign(number));

	}

}
