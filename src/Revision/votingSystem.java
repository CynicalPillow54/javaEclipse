package Revision;

import java.util.Scanner;

public class votingSystem {

	public static void main(String[] args) {
		/*
		 * 1. Take user input and map to party
		 * 2. con -> Conservative 
		 * 3. lab -> Labour
		 * 4. Add input Validation
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Voting...");
		
		// Take user input 
		System.out.println("Enter 'con' for Conservative and 'lab' for Labour.");
		String userVote = keyboard.nextLine();
		
		// Make lower case
		userVote = userVote.toLowerCase();
		
		// Add Validation
		if (!userVote.equals("con") && !userVote.equals("lab")) {
			System.out.println("Sorry voting party unrecognised.");
		}
		else {
			// Init vote string
			String vote = new String();
			
			//Check Vote
			if (userVote.equals("con")) {
				vote = "Conservative";
			}
			else {
				vote = "Labour";
			}
			
			System.out.printf("Voted registerd for %s. %n", vote);
		}
		
		keyboard.close();
		
	}

}
