package fileReadWrite;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ChallengeDictionaryAttack {
	
	private static final String FILE_NAME = "src/fileReadWrite/rockyou.txt";
	private static final String CONCAT = "@#@";

	public static void main(String[] args) {
		// Prompt user for password 
		// Read rockyou.txt
		// Check if password is part of rockyou list
		
		Scanner scanner = new Scanner(System.in);
		String userPassword;
		boolean match;
		
		System.out.println("Password cheker");
		System.out.println("Enter a password to check for common useage");
		
		userPassword = scanner.nextLine();
		
		// method to read text file
		String[] rockYouArray = readFile();
		
		// check password to rockYou
		match = checkPassword(rockYouArray, userPassword);
		
		System.out.println("Ok lets check that one...");
		
		if(match) {
			System.out.println("Weak password! Try another");
		} else {
			System.out.println("Password not found... could be a good one to use...");
		}
		
		
		// close
		scanner.close();

	}

	private static boolean checkPassword(String[] rockYouArray, String userPassword) {
		boolean match = false;
		for (String word : rockYouArray) {
			if(word.equalsIgnoreCase(userPassword)) {
				match = true;
			}
			
		}
		return match;
	}

	private static String[] readFile() {
		File file = new File(FILE_NAME);
		String line;
		String fullDelimitedText = "";
		String[] output = null;
		
		if(!file.exists()) {
			String filePath = file.getAbsolutePath();
			System.out.println("The file: " + filePath + " does not exist!");
		}else {
			try {
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				
				line = bufferedReader.readLine();
				
				StringBuilder sb = new StringBuilder();
				
				while(line != null) {
					sb.append(line).append(CONCAT);
					line = bufferedReader.readLine();
				}
				
				//close 
				bufferedReader.close();
				fileReader.close();
				
				fullDelimitedText = sb.toString();
				output = fullDelimitedText.split(CONCAT);
				
				
			} catch (IOException ex) {
				System.out.println("Opps there has been an IO error!");
				ex.printStackTrace();
			} 
			
			
		}
		
		return output;
	}

}
