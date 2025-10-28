package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/**
		 * Output to the screen menu options:
		 * 1. File
		 * 2. Edit
		 * 3. Save
		 * 4. Delete
		 * 5. Exit
		 * 
		 * Depending on the selection provide a message
		 * Show menu again
		 * Only stop loop when Exit is selected
		 */
		
		// Init Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Init userInput 
		int userInput;
		
		
		// Do While Loop here
		do {
			// Print Options
			System.out.println("Welcome! Pick an option:");
			System.out.println("[1] File");
			System.out.println("[2] Edit");
			System.out.println("[3] Save");
			System.out.println("[4] Delete");
			System.out.println("[5] Exit");
			
			// Get user input
			System.out.print("Input: ");
			userInput = keyboard.nextInt();
			keyboard.nextLine();
			
			// Add validation
			if (userInput <= 0 || userInput >= 6) {
				System.out.println("Invalid input. Choose again.");
			}
			else {				
				// Switch Statement for decision
				switch(userInput) {
					case 1:
						System.out.println("File selected");
						break;
					case 2:
						System.out.println("Edit selected");
						break;
					case 3:
						System.out.println("Save selected");
						break;
					case 4:
						System.out.println("Delete selected");
						break;
					case 5:
						System.out.println("Exiting...");
						break;
				}
			}
		} while (userInput != 5);
		
		// Close Scanner
		keyboard.close();
		
	}

}
