package methods;

import java.util.Scanner;

public class PrintNumbersAsterixes {

	public static void main(String[] args) {
		/*
		 * Program will prompt user for int between 5 -> 50 
		 * Then will output a countdown with the numbe + asterix 
		 * e.g 5 *****, 4**** on seperate lines 
		 * 
		 * N.B need to use methods
		 */
		
		// Init Scanner 
		Scanner keyboard = new Scanner(System.in);
		
		// Print input request and get user input
		System.out.print("Please input a number in the range 5 to 50 (inclusive): ");
		int userInput = keyboard.nextInt();
		keyboard.nextLine();
		
		// Add validation
		if (userInput < 5 || userInput > 50) {
			System.out.println("ERROR: you input is not in range.");
		}
		else {
			printMethod(userInput);
		}
		
		// Close Scanner
		keyboard.close();

	}

	private static void printMethod(int userInput) {
		/*
		 * Will take user input and start countdown from that number adding
		 * multiple asterixes corresponding to the number's value
		 */
		
		int loopStart = userInput;
		
		for (int i = loopStart; i >= 0; i--) {
			System.out.print(i + " ");
			String asterix = "*".repeat(i);
			System.out.printf("%s%n", asterix);
		}
		
	}

}
