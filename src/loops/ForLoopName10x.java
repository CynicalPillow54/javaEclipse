package loops;

import java.util.Scanner;

public class ForLoopName10x {

	public static void main(String[] args) {
		/**
		 * Create a program that prompts the user for a name and 
		 * prints it to screen 10 times
		 */
		
		// Init Scanner 
		Scanner keyboard = new Scanner(System.in);
		
		// Get users name
		System.out.print("Please input your name: ");
		String userName = keyboard.next();
		
		for (int i = 0; i < 10; i++ ) {
			System.out.println(userName + " index: " + i);
		}
		
		// Close Scanner 
		keyboard.close();
	}

}
