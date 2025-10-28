package revision;

import java.util.Scanner;
import java.util.Random;

public class magicEightBall {

	public static void main(String[] args) {
		/**
		 * Java Program to be a Magic 8 Ball 
		 */
		
		
		// Init Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Print Question 
		System.out.println("What is your question");
		
		// Get userQuestion 
		String userQuestion = keyboard.nextLine();
		
		// Get random int 
		Random random = new Random();
		int randomNumber = random.nextInt(8);
		
		String randomResponse = new String();
		
		// Use switch to pick response 
		switch (randomNumber) {
			case 0:
				randomResponse = "As I see it, yes.";
				break;
			case 1:
				randomResponse = "Ask again later.";
				break;
			case 2:
				randomResponse = "Better not tell you now.";
				break;
			case 3:
				randomResponse = "Cannot predict now.";
				break;
			case 4:
				randomResponse = "Concentrate and ask again.";
				break;
			case 5:
				randomResponse = "Don't count on it.";
				break;
			case 6:
				randomResponse = "It is certain.";
				break;
			case 7:
				randomResponse = "It is decidedly so.";
				break;
		}
		
		// Print the response  
		System.out.println("You want to know...");
		System.out.println(userQuestion);
		System.out.println(randomResponse);
		
		// Close Scanner
		keyboard.close();
	}

}
