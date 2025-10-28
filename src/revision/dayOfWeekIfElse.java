package revision;

import java.util.Scanner;

public class dayOfWeekIfElse {

	public static void main(String[] args) {
		/**
		 * If Else program to write day of week given a int input
		 */
		
		// Init Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Get User Input for day of week
		System.out.print("Input day of week: ");
		int userDayOfWeek = keyboard.nextInt();
		keyboard.nextLine();
		
		// Add validation
		
		if (userDayOfWeek < 1 || userDayOfWeek > 7) {
			System.out.print("Invalid input");
		}
		else {
			if (userDayOfWeek == 1) {
				System.out.println("Day of week: Sunday");
			}
			else if (userDayOfWeek == 2) {
				System.out.println("Day of week: Monday");
			}
			else if (userDayOfWeek == 3) {
				System.out.println("Day of week: Tuesday");
			}
			else if (userDayOfWeek == 4) {
				System.out.println("Day of week: Wednesday");
			}
			else if (userDayOfWeek == 5) {
				System.out.println("Day of week: Thursday");
			}
			else if (userDayOfWeek == 6) {
				System.out.println("Day of week: Friday");
			}
			else if (userDayOfWeek == 7) {
				System.out.println("Day of week: Saturday");
			}
		}
		
	}

}
