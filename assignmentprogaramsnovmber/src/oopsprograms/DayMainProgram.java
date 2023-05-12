package oopsprograms;

import java.util.Scanner;

public class DayMainProgram {

	public static void main(String[] args) {
		
		
		DayOfWeek day=new DayOfWeek();
		day.setDayName("sunday");
		System.out.println(day.getNextDay());
		System.out.println(day.getPreviousDay());
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(day.addToCurrentDay(sc.nextInt()));
		
		
	}

}
