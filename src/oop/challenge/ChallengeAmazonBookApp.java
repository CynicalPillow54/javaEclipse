package oop.challenge;

import oop.challenge.AmazonBook;

public class ChallengeAmazonBookApp {

	public static void main(String[] args) {
		
		AmazonBook test1 = new AmazonBook(
				"The Body: A Guide for Occupants",
				"Bill Bryson",
				20.00,
				464,
				"0857522418",
				4,
				"English"
				);
		AmazonBook test2 = new AmazonBook(
				"Ulysses",
				"James Joyce",
				4.99,
				736,
				"1840226358",
				4,
				"English"
				);
		
		String longestBook = checkLongestBook(test1, test2);
		System.out.println("The longest book is:");
		System.out.println(longestBook);
		
		System.out.println(test1.toString());
				

	}

	private static String checkLongestBook(AmazonBook test1, AmazonBook test2) {
		String longestBook;
		
		if(test1.getPages() >= test2.getPages()) {
			longestBook = "Title: " + test1.getTitle() + " by: " + test1.getAuthor(); 
		}else {
			longestBook = "Title: " + test2.getTitle() + " by: " + test2.getAuthor(); 
		}
		
		return longestBook;
	}

}

