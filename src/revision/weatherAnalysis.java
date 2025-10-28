package revision;

public class weatherAnalysis {

	public static void main(String[] args) {
		boolean day1sun = true;
		boolean day2sun = false;
		boolean day3sun = true;
		boolean day4sun = true;
		boolean day5sun = false;
		
		float day1temp = 15.5f;
		float day2temp = 10.5f;
		float day3temp = 16.0f;
		float day4temp = 12.5f;
		float day5temp = 17.0f;
		
		float averageTemp = (day1temp + day2temp + day3temp + day4temp + day5temp)/5;
		
		int daysOfSun = 3;
		
		System.out.println("Weather analysis");
		System.out.println("____________________________________");
		System.out.println("Day 1");
		System.out.printf("Temp     : %.1f %n",day1temp);
		System.out.printf("Sun      : %b%n", day1sun);
		if (day1temp >= averageTemp) {
			System.out.println("Above average Temp");
		}
		System.out.println("____________________________________");
		System.out.println("Day 2");
		System.out.printf("Temp     : %.1f %n",day2temp);
		System.out.printf("Sun      : %b%n", day2sun);
		if (day2temp >= averageTemp) {
			System.out.println("Above average Temp");
		}
		System.out.println("____________________________________");
		System.out.println("Day 3");
		System.out.printf("Temp     : %.1f %n",day3temp);
		System.out.printf("Sun      : %b%n", day3sun);
		if (day3temp >= averageTemp) {
			System.out.println("Above average Temp");
		}
		System.out.println("____________________________________");
		System.out.println("Day 4");
		System.out.printf("Temp     : %.1f %n",day4temp);
		System.out.printf("Sun      : %b%n", day4sun);
		if (day4temp >= averageTemp) {
			System.out.println("Above average Temp");
		}
		System.out.println("____________________________________");
		System.out.println("Day 5");
		System.out.printf("Temp     : %.1f %n",day5temp);
		System.out.printf("Sun      : %b%n", day5sun);
		if (day5temp >= averageTemp) {
			System.out.println("Above average Temp");
		}
		System.out.println("____________________________________");
		System.out.println();
		System.out.println("Overall stats");
		System.out.printf("Average temp              :%.1f %n", averageTemp);
		System.out.printf("Number of days of sun     :%d %n", daysOfSun);
		
	}

}
