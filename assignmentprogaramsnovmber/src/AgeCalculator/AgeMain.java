package AgeCalculator;

import java.util.Scanner;

public class AgeMain {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		AgeCalculator age=new AgeCalculator();
		
		System.out.println("enter your date of brith");
		System.out.println("enter your year");
		age.setYear(sc.nextInt());
		System.out.println("enter your month");
		age.setMonth(sc.nextInt());
		System.out.println("enter your day");
		
		age.setDate(sc.nextInt());
		
		double age1=age.calculateAge(age.getDate(), age.getMonth(), age.getYear());
		
		System.out.println(age1);
		
		
		
		
		
	}

}
