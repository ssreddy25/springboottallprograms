package fundamentalsprograms;

import java.util.Scanner;

public class Vacation {
	public static String ringAlarm(int dayOfTheWeek, boolean vacation) {
		if ((dayOfTheWeek < 0 && dayOfTheWeek > 6)) {
			return "invalid inputs";
		} else if (dayOfTheWeek > 0 && dayOfTheWeek < 6) {
			if (vacation == true) {
				return "10:00";
			} else
				return "07:00";
		} else {
			if (vacation == true) {
				return "off";
			} else
				return "10:00";

		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter day of the week");
		int dayOfTheWeek = s.nextInt();
		boolean vacation = false;
		System.out.println("are you on vacation?");
		try {
			vacation = s.nextBoolean();
		} catch (Exception e) {
			System.out.println("invalid inputs");
			;
		}
		System.out.println(ringAlarm(dayOfTheWeek, vacation));
	}

}