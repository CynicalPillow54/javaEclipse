package methods;

import java.util.Random;

public class RandomIntGenerator {

	public static void main(String[] args) {
		/*
		 * Program when Invoked will generate set of 10 random numbers between 1 and 100
		 */
		
		// init bounds 
		int origin = 1;
		int bound = 101;
		
		// init maxLoop
		int maxLoop = 10;
		
		randGenerator(origin, bound, maxLoop);

	}

	private static void randGenerator(int origin, int bound, int maxLoop) {
		/*
		 * Will output to the console a list of random ints
		 */
		
		// init Random 
		Random rand = new Random();
		
		System.out.printf("Generating %d random integers in range %d..%d%n", maxLoop, origin, bound-1);
		
		for (int i = 0; i < maxLoop; i++) {
			int randInt = rand.nextInt(origin, bound);
			System.out.printf("Generated : %3d%n", randInt);
		}
		
		System.out.println("Done");
	}

}
