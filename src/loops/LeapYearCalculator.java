package loops;

public class LeapYearCalculator {

	public static void main(String[] args) {
		/**
		 * Program that will output all leap years from 1910 and 1990.
		 */
		
		// Init yearStart
		int yearStart = 1910;
		
		// Init yearEnd
		int yearEnd = 1990;
		
		// Init leapYear bool
		boolean leapYear;
		
		// Create for loop
		for (int i = yearStart; i <= yearEnd; i++) {
			// Calc leap year
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
				leapYear = true;
			}
			else {
				leapYear = false;
			}
			
			if (leapYear == true) {
				System.out.println(i + " is a Leap Year");
			}
			
		}
	}

}
