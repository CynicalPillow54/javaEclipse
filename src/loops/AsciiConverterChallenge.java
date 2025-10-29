package loops;

import java.util.Scanner;

public class AsciiConverterChallenge {

	public static void main(String[] args) {
		/**
		 * Program that is a console app that draws a menu.
		 * Menu:
		 * ASCII Convertor Menu ....................
		 * [1] Show ASCII Table
		 * [2] Convert a Character to ASCII
		 * [3] Convert your Name to ASCII
		 * [4] Quit
		 */
		
		// Init Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Init asciiStart value 
		int asciiStart = 32;
		
		// Init asciiEnd value
		int asciiEnd = 126;
		
		// Init exit Bool
		boolean exit = false;
		
		// Create do while loop
		
		do {
			
			//draw menu
			System.out.println("ASCII Convertor Menue");
			System.out.println("*********************");
			System.out.println("[1] Show ASCII Table");
			System.out.println("[2] Convert a Charcter to ASCII");
			System.out.println("[3] Convert your name to ASCII");
			System.out.println("[4] Quit");
			System.out.print("Enter a number and return: ");
			
			int userChoice = keyboard.nextInt();
			keyboard.nextLine();
			
			// Add validation
			if (userChoice >= 1 && userChoice <= 4 ) {
				// Switch for options 
				switch(userChoice) {
				case 1:
					// for loop for printing ASCII Table
					
					
				case 2:
					// User input for char and cast to ASCII
				
				case 3:
					// User input for string and for loop for converting each char to ASCII
				
				case 4:
					// exit bool = true
				}
			}
			else {
				System.out.println("Invalid input please try agin.");
			}
			
		}while(exit != true);
		
		
		// Close Scanner
		keyboard.close();
		
		
	}

}
