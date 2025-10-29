package loops;

public class EvenNumberLoop {

	public static void main(String[] args) {
		/**
		 * Program that outputs only the even numbers between 1-100
		 */
		
		// init for loop 
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				// Is even 
				System.out.println(i);
			}
		}

	}

}
