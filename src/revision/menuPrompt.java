package revision;

import java.util.Scanner;

public class menuPrompt {

	public static void main(String[] args) {
		/**
		 * Show the user a menu and given the user input navigate them to the option
		 * 1. File
		 * 2. Edit
		 * 3. Exit 
		 * 
		 * Now add
		 * 3. Delete
		 * 4. Exit 
		 */
		
		// Init Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Create Menu Screen 
		System.out.println("Welcome! Please select one of the following options.");
		System.out.println("[1] File");
		System.out.println("[2] Edit");
		System.out.println("[3] Delete");		
		System.out.println("[4] Exit");		

		
		// Take User input
		System.out.print("Please type your selection: ");
		int userInput = keyboard.nextInt();
		keyboard.nextLine();
		
		// Add input validation
		if (userInput < 1 || userInput > 4) {
			System.out.println("Invalid input");
		}
		else {
			// Switch statement for selection 
			switch (userInput) {
				case 1:
					System.out.println("You have selected File");
					break;
				case 2:
					System.out.println("You have selecetd Edit");
					break;
				case 3:
					System.out.println("You have selected Delete");
					break;
				case 4:
					System.out.println("You have selected Exit");
			}				
		}	
		
		// Close Scanner
		keyboard.close();
	}

}
