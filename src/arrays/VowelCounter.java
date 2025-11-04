package arrays;

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		/*
		 * Write a program that will prompt the user to enter their first name. 
		 * This will be stored as a string. The program will then loop through the 
		 * string and assign each value to a char array.  Count the occurrences 
		 * of the different vowels: a, e, i, o, u. 
		 * The program should take into account both lowercase and uppercase characters. 
		 * The total number of occurrences for each vowel should also be calculated and displayed.
		 */
		
		// Init Scanner 
		Scanner keyboard = new Scanner(System.in);
		
		// get user first name
		System.out.print("Can you please enter your name: ");
		String userName = keyboard.nextLine();
		System.out.println("Thinking...");
		
		// init char Array
		char[] chars = userName.toCharArray();
		
		// init vowel count
		int vowels = 0;
		
		for (int i = 0; i < chars.length ; i++) {
			char candidate = chars[i];
			if (candidate == 'a' || candidate == 'A' ||
				candidate == 'e' || candidate == 'E' ||
				candidate == 'i' || candidate == 'I' ||
				candidate == 'o' || candidate == 'O' ||
				candidate == 'u' || candidate == 'U') {
				
				vowels++;
			}
		}
		
		System.out.println("Total vowels: " + vowels);
		
		
		// Close Scanner 
		keyboard.close();
	}

}
