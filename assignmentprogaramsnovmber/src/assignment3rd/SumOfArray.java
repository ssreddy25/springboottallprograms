package assignment3rd;

import java.util.Scanner;

public class SumOfArray {
	static Scanner sc=new Scanner(System.in);
	
	public static String sumOfArray(int size){
		
		String msg="";
		int[] arry=new int[size];
		
	
		
		for(int i=0;i<arry.length;i++){
			System.out.println("enter the arry values");
			int number=sc.nextInt();
			
			if(number>=0){
			   
				msg="your enter negate numbers or zero :"+" -1";
				break;
				
			}
			else{
				arry[i]=number;
			}
		}
		
		if(arry.length!=0){
			int sum=0;
			for(int i=0;i<arry.length;i++){
				sum=sum+i;
			}
			msg=sum+"";
		}
		else{
			msg="your arry size is empty";
		}
		return msg;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arry size");
		
		int size =sc.nextInt();
		
		System.out.println(sumOfArray(size));
		
		

	}

}
