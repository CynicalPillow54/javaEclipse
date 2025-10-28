package revision;

import java.util.Scanner;

public class ifElseMasterGrading {

	public static void main(String[] args) {
		/**
		 * This function will:
		 * 1. Prompt the user for a file mark (1-100)
		 * 2. Assign the number into a suitable variable
		 * 3. use if - else statements to output the classification
		 * Outputs:
		 * 0-49 = Fail
		 * 50-59 = Pass
		 * 60-69 = Merit
		 * 70-100 = Distinction
		 * 
		 * Have error handling
		 */
		
		// assign Scanner to user Input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter mark...");
		int userMark = keyboard.nextInt();
		
		keyboard.close();
		
		if (userMark < 0 || userMark > 100) {
			System.out.println("Pleae enter value between 0 and 100!");
		}
		else {
			
			String classification = new String();
			
			if (userMark >= 0 && userMark <= 49) {
				classification = "Fail";
			}
			else if (userMark >= 50 && userMark <= 59) {
				classification = "Pass";
			}
			else if (userMark >= 60 && userMark <= 69) {
				classification = "Merit";
			}
			else if (userMark >= 70 && userMark <= 100) {
				classification = "Distinction";
			}
			
			System.out.println("Classification : " + classification);
		}
		

		
	}

}
