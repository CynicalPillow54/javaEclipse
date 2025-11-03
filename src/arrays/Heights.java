package arrays;

import java.util.Arrays;

public class Heights {

	public static void main(String[] args) {
		/*
		 * Program that stores heights. 
		 * Output:
		 *  - Calculate average, and print 
		 *  - Sort then print tallest and shortest heights
		 */
		
		float[] heights = {1.4f, 1.9f, 1.31f, 1.2f};
		
		float averageHeight = 0;
		
		float sumHeight = 0;
		
		for (int i = 0; i < heights.length; i++) {
			sumHeight += heights[i];
		}
		
		averageHeight = sumHeight / heights.length;
		
		Arrays.sort(heights);
		
		float tallest = heights[heights.length - 1];
		float shortest = heights[0];
		
		System.out.printf("Average height is: %.2f, tallest height: %.2f, shortest height: %.2f%n", averageHeight, tallest, shortest);
		
	}

}
