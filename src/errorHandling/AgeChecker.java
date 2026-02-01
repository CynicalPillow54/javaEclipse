package errorHandling;


import java.util.Scanner;
import java.util.InputMismatchException;

public class AgeChecker {

	public static void main(String[] args) {
		int age = ageRequest();
		System.out.println("You are " + age + " years old.");
		
		if (age > 60) {
			System.out.println("That's so old!");
		}

	}

	private static int ageRequest() {
		Scanner keyboard = new Scanner(System.in);
		int age = 0;
		boolean validInput = false;
		
		while(!validInput) {
			try {
				System.out.print("Please enter your age: ");
				age = keyboard.nextInt();
				validInput = true;
			} catch (InputMismatchException ex) {
				System.out.println("Invalid Input. Please input a valid age (a number).");
				System.out.println(ex.getMessage());
				System.out.println(ex.toString());
				keyboard.nextLine();
			} catch (Exception ex) {
				System.out.println("Oops! Something went wrong.");
				System.out.println(ex.getMessage());
				System.out.println(ex.toString());
				keyboard.nextLine();
			}
		}
		keyboard.close();
		
		return age ;
	}

}
