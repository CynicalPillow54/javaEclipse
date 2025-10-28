package revision;

import java.util.Scanner;

public class dayOfWeekSwitch {

	public static void main(String[] args) {
		/**
		 * Switch program to write day of week given int input 
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
			switch(userDayOfWeek) {
				case 1:
					System.out.println("Day of week: Sunday");
					break;
				case 2:
					System.out.println("Day of week: Monday");
					break;
				case 3:
					System.out.println("Day of week: Tuesday");
					break;
				case 4:
					System.out.println("Day of week: Wednesday");
					break;
				case 5:
					System.out.println("Day of week: Thursday");
					break;
				case 6:
					System.out.println("Day of week: Friday");
					break;
				case 7:
					System.out.println("Day of week: Saturday");
					break;
			}
		}
		keyboard.close();
	}

}
