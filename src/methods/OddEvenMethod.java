package methods;

import java.util.Scanner;

public class OddEvenMethod {

	public static void main(String[] args) {
		/*
		 * Program when given an integer will determine if it is odd or even. 
		 */

		// Init Scanner 
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("***Odd or Even Evaluator***");
		System.out.print("Please input your integer: ");
		
		// Get int from user
		int userInput = keyboard.nextInt();
		keyboard.nextLine();
		
		// Pass userInput to method
		oddEven(userInput);
		
		
		// Close Scanner 
		keyboard.close();
	}

	private static void oddEven(int userInput) {
		/*
		 * Evaluates if the the given int is odd or even
		 */
		
		if (userInput % 2 == 0) {
			// Input is even 
			System.out.printf("Your input %d is even.", userInput);
		}
		else {
			// Input is odd
			System.out.printf("Your input %d is odd.", userInput);
		}
		
	}

}
