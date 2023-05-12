package assignment3rd;

import java.util.Scanner;

public class AddTwoNumbers {

	public static String getSum(int number1,int number2){
		 String msg="";
		if(number1<=0 &&number2<=0){
			msg="error";
			
		}else{
			msg=number1+number2+"";
		}
		
		return msg;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the frist number");
		int number1=sc.nextInt();
		
		System.out.println("enter the second number");
		int number2=sc.nextInt();
		
		System.out.println(getSum(number1,number2));
		
		
	}

}
