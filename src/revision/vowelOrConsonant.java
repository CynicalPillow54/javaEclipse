package revision;

import java.util.Scanner;

public class vowelOrConsonant {

	public static void main(String[] args) {
		/**
		 * Check if input char is vowel or consonant using switch statement
		 */
		
		// Init Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Init user input
		System.out.print("Input: ");
		char userInput = keyboard.next().charAt(0);
		
		// Switch Statement
		switch (userInput) {
			case 'a':
				System.out.printf("User Input %s is a vowel.", userInput);
				break;
			case 'e':
				System.out.printf("User Input %s is a vowel.", userInput);
				break;
			case 'i':
				System.out.printf("User Input %s is a vowel.", userInput);
				break;
			case 'o':
				System.out.printf("User Input %s is a vowel.", userInput);
				break;
			case 'u':
				System.out.printf("User Input %s is a vowel.", userInput);
				break;
			default:
				System.out.printf("User Input %s is a consonant.", userInput);
				break;
		}
		
		// Close Scanner
		keyboard.close();
	}

}
