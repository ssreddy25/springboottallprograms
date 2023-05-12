package fundamentalsprograms;

import java.util.Scanner;

public class RangeOfNaturalNumbers {
	public static String getNumbersInRange(int firstNumber,int secondNumber){
		String out="";
		if(firstNumber<0||secondNumber<0){
			return "-1";
		}
		else if(firstNumber==0||secondNumber==0){
			return "-2";
		}
		else if(firstNumber>secondNumber){
			return "-3";
		}
		else{
			int result=firstNumber+1;
			while(result<secondNumber){
				 out+=result+" ";
				 result++;
			}
		}
		return out;
			
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter numbers");
		int firstNumber=s.nextInt();
		int secondNumber=s.nextInt();
		
System.out.println(getNumbersInRange(firstNumber,secondNumber));
	}

}

