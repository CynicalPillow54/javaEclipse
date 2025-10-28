package revision;

import java.util.Scanner;

public class ageChecker {

	public static void main(String[] args) {
		/**
		 * 1. Prompt the user for his age
		 * 2. Check if user is over 17
		 * 3. If user is over 17 then prompt for name
		 * 4. IF not throw error
		 * 5. Add age validation (0-17, 17+) 
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		int userAge = keyboard.nextInt();
		keyboard.nextLine();

		// Check validation for userAge 
		
		if (userAge < 0) {
			System.out.println("Sorry don't recognise your input");
		}
		else if (userAge >= 0 && userAge <= 17) {
			System.out.println("too young to continue");
		}
		else if (userAge > 17 ) {
			System.out.print("Enter your name: ");
			String userName = keyboard.nextLine();
			
			System.out.println("____________________");
			System.out.println("Output:");
			System.out.printf("Name: %s%n", userName);
			System.out.printf("Age: %d%n", userAge);
		}
		
		keyboard.close();
		
		
	}

}
