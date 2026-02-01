package errorHandling;

import java.util.Scanner;

public class ErrorHandling {

//	public static void main(String[] args) {
//		int age = 0;
//		Scanner keyboard = new Scanner(System.in);
//		
//		System.out.print("Enter your age: ");
//		age = keyboard.nextInt();
//		
//		System.out.printf("%d That is quite old!", age);
//
//		keyboard.close();
//	}
	
	public static void main(String[] args) {
		int age = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		try {
			age = keyboard.nextInt();
			System.out.printf("%d That is quite old!", age);
		} catch (Exception ex) {
			System.out.println("Sorry there has been a problem!");
		}
		keyboard.close();
		
	}

}
