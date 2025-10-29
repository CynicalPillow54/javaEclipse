package loops;

import java.util.Scanner;

public class AgeClassifier {

	public static void main(String[] args) {
		/**
		 * Program that prompts user for their age
		 * Uses do while loop and has range validation 
		 */
		
		// Init Scanner 
		Scanner keyboard = new Scanner(System.in);
		
		// Exit Bool
		boolean exit = false;
		
		// Create Do While loop
		do {
			// Ask user for age
			System.out.print("Please enter your age: ");
			int userAge = keyboard.nextInt();
			keyboard.nextLine();
			
			// Validate input
			if (userAge < 1 || userAge > 100) {
				System.out.println("Invalid input. Please try again");
			}
			else {
				if (userAge >= 1 && userAge <= 30) {
					System.out.println("you are young");
					exit = true;
				}
				else if (userAge >= 31 && userAge <= 60) {
					System.out.println("You are getting on!");
					exit = true;
				}
				else {
					System.out.println("You look amazing for your age!");
					exit = true;
				}
				
			}
		}while(exit == false);
		
		// Close Scanner 
		keyboard.close();
	}

}
