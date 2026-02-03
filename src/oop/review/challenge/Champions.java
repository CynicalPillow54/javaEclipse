package oop.review.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;

public class Champions {
	
	public static final String PATH = "src/oop/review/challenge/ECWinners.txt";
	public static final int STARTYEAR = 1956;

	public static void main(String[] args) {
		// Read txt file 
		// add each line to ArrayList
		// loop through and print each year 1956 and winner 
		
		// File Operations 
		ArrayList<String> yearWinners = readFile();
		// display list method
		displayYearList(yearWinners);
		
		
		// Remove duplicates 
		ArrayList<String> deduplicatedWinners = removeDuplicates(yearWinners);
		// Output winners list 
		System.out.println(deduplicatedWinners.toString());

	}

	private static ArrayList<String> removeDuplicates(ArrayList<String> yearWinners) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> seen = new ArrayList<String>();
		
		for (String winner : yearWinners) {
			if (seen.contains(winner)) {
				// duplicate - do not add to list
			} else {
				seen.add(winner);
				list.add(winner);
			}
		}
		
		return list;
	}

	private static void displayYearList(ArrayList<String> yearWinners) {
		for (int counter = 0; counter < yearWinners.size(); counter++) {
			int year = counter + STARTYEAR;
			System.out.printf("%d:%s%n", year, yearWinners.get(counter));
		}
		
	}

	private static ArrayList<String> readFile() {
		ArrayList<String> list = new ArrayList<String>();
		File file = new File(PATH);
		String line;
		
		try {
			if(!file.exists()) {
				// file not found
				throw new FileNotFoundException();
			} else {
				// File exists
				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					line = br.readLine();
					while(line != null) {
						list.add(line);
						line = br.readLine();
					}
					
					//close 
					br.close();
				} catch (IOException ex) {
					System.out.println("IO Exception");
					ex.printStackTrace();
				} catch (Exception ex) {
					System.out.println("Oops! There was an error...");
					ex.printStackTrace();
				}
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File does not exist at path:" + file.getAbsolutePath());
			ex.printStackTrace();
		}
		return list;
	}

}
