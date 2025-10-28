package revision;

import java.util.Scanner;
import java.lang.Math;


public class operatorsAndSelectionStatements {

	public static void main(String[] args) {
		/**
		 * This main method will prompt the user for a decimal point number and output:
		 * 1. rounded number (2dp)
		 * 2. squared number (3dp)
		 * 3. cubed number (3dp)
		 * 4. square root number (4dp)
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a decimal point number in the format xx.xxxx eg 12.3456");
		float userInput = keyboard.nextFloat();
		
		keyboard.close();
		
		//float rounded = Math.round(userInput);
		//double rounded = Math.round(userInput);
		double squared = Math.pow(userInput, 2);
		double cubed = Math.pow(userInput, 3);
		double sqrt = Math.sqrt(userInput);
		
		System.out.printf("Number rounded (two decimal places)    :%.2f %n", userInput);
		System.out.printf("Number squared (three decimal places)  :%.3f %n", squared);
		System.out.printf("Number cubed to (three decimal places) :%.3f %n", cubed);
		System.out.printf("Square root (four decimal places) :%.4f %n", sqrt);
		
	}

}
