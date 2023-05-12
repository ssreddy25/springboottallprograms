package AgeCalculator;

import java.time.LocalDate;
import java.time.Month;

public class AgeCalculator {
	
     public int date;
     public int month;
     public int year;
     
     public AgeCalculator(){}

	public AgeCalculator(int date, int month, int year) {
		
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
     
	public double calculateAge(int birthdate, int birthMonth, int birthYear) {
		
		
		 //Getting the current date value
	      LocalDate currentdate = LocalDate.now();
	      System.out.println("Current date: "+currentdate);
	      //Getting the current day
	      int currentDay = currentdate.getDayOfMonth();
	      System.out.println("Current day: "+currentDay);
	      //Getting the current month
	      int currentMonth = currentdate.getMonthValue();
	      System.out.println("Current month: "+currentMonth);
	      //getting the current year
	      int currentYear = currentdate.getYear();
	      System.out.println("Current month: "+currentYear);
	      
	      double age=(currentYear-currentMonth-currentDay)-(birthYear-birthMonth-birthdate);
	      
	      return age;
		
		
		
		
		
	}
     

}
