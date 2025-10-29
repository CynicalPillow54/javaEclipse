package loops;

public class OddNumberLoop {

	public static void main(String[] args) {
		/**
		 * Program that outputs only odd numbers between 10 - 40 (inclusive)
		 */

		//Loop
		for (int i = 10; i <=40; i++) {
			if (i % 2 != 0) {
				//Is odd
				System.out.println(i);
			}
		}
	}

}
