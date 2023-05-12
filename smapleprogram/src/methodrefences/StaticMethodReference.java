package methodrefences;

import java.util.Scanner;
@FunctionalInterface
interface Race{
	void run();
}
public class StaticMethodReference {
	
	static Scanner sc = new Scanner(System.in);
	public static void runningRace(){
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
		
		Race race=StaticMethodReference::runningRace;//through the method refrence we reduce the code compare to the lamda expersion ;
		
		race.run();
		
	}

}
