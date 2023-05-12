package oopsprograms;

public class DayOfWeek {

	public String dayName = "SUN";

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		String day = new String(dayName);
		String day1 = (String) day.toUpperCase().subSequence(0, 3);
		this.dayName = day1;
	}

	public String getNextDay() {
		String dayName = this.dayName;

		String nextday = "";
		switch (dayName) {

		case "SUN":
			nextday = "netDay is a " + "MON";
			break;

		case "MON":
			nextday = "netDay is a " + "TUE";
			break;

		case "TUE":
			nextday = "netDay is a " + "THU";
			break;

		case "THU":
			nextday = "netDay is a " + "FRI";
			break;
		case "FRI":
			nextday = "netDay is a" + "SAT";
			break;

		case "SAT":
			nextday = "netDay is a " + "SUN";
			break;

		default:
			System.out.println("your enter the day name is worng");
		}
		return nextday;
	}

	public String getPreviousDay() {

		String dayName = this.dayName;

		String privouesday = "";
		switch (dayName) {

		case "SUN":
			privouesday = "privouesday is a " + "SAT";
			break;

		case "MON":
			privouesday = "privouesday is a " + "SUN";
			break;

		case "TUE":
			privouesday = "privouesday is a " + "MON";
			break;

		case "THU":
			privouesday = "privouesday is a " + "TUE";
			break;
		case "FRI":
			privouesday = "privouesday is a " + "THU";
			break;

		case "SAT":
			privouesday = "netDay is a " + "FRI";
			break;

		default:
			System.out.println("your enter the day name is worng");
		}
		return privouesday;

	}

	public String addToCurrentDay(int noOfDays) {

		String week[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int num = 0;
		String day = "";
		for (int i = 0; i < week.length; i++) {
			if (this.dayName.equals(week[i]))
				
			{
				num += i;
			}

		}
		System.out.println(num);

		int day2 = num + noOfDays % 7;
		
      //	int day3=1-num - noOfDays % 7;
		

		for (int i = 0; i < week.length; i++) {
			if (day2 == i)
				
			{
				day = week[i];
			}
//			else if(day3==i){
//				
//				day = week[i];
//			}

		}
		return day;
	}

}
