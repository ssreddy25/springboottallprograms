package methodrefences;

import java.util.Scanner;

interface Race{
	void run();
}

public class InstanceMethodRefence {
      
	static Scanner sc = new Scanner(System.in);
	public  void runningRace(){
		System.out.println("only 18 year above age boy/girl are praticipaid ");
		System.out.println("enter the your age ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("your aligble for the race");
		} else {
			System.out.println("your not aligble for the race because your age is 18 below ");
		}
	}
	
	public static void main(String[] args) {
		  // Referring non-static method using reference  
		InstanceMethodRefence instanceMethodRefence=new InstanceMethodRefence();
		
		Race race=instanceMethodRefence::runningRace;
		   // Calling interface method 
		race.run();
		
		//you can provide the directly using annyomus object
		// Referring non-static method using anonymous object  
		Race race1=new InstanceMethodRefence()::runningRace;
		
		 // Calling interface method  
		race1.run();

	}

}
