package methods;

import java.util.Scanner;

public class UpperToLowerChar {

	public static void main(String[] args) {
		/*
		 * Program to convert Uppercase Char to Lowercase 
		 */
		
		// Init Scanner 
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("*** Uppercase to Lowercase Converter ***");
		System.out.print("Please input your character here: ");
		
		// Get char from user 
		String userInput = keyboard.nextLine();
		
		if (userInput.length() > 1) {
			System.out.println("Your input has more than 1 character.");
		}
		else {
			if (userInput.equals(userInput.toUpperCase())){
				System.out.println("Your char is Uppercase: "+userInput);
				char letter = userInput.charAt(0);
				converterUpperToLower(letter);
			}
			else {
				System.out.println("Your char is Lowercase already: "+userInput);
			}
		}
		
		
	 
		
		
		// Close Scanner
		keyboard.close();
	}

	private static void converterUpperToLower(char letter) {
		/*
		 * Converts input char to lowercase
		 */
		
		String lower = String.valueOf(letter).toLowerCase();
		System.out.println("Lowercase: "+lower);
		
	}


}
