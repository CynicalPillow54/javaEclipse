package arrays;

import java.util.Arrays;

public class EvenArray {

	public static void main(String[] args) {
		/*
		 * Array that will be populated with all even nums from 1 - 100
		 * Output:
		 * Array
		 * Total of all even nums
		 */

		// method loop to populate array 
		int[] evenArray = popArray();
		
		// method add to totalEven
		int totalEven = calcTotalEven(evenArray);
		
		// Print array and int totalEven
		System.out.println(Arrays.toString(evenArray));
		System.out.println("Total Even nums: " + totalEven);
	}

	private static int calcTotalEven(int[] evenArray) {
		int totalEven = 0;
		for (int i = 0; i < evenArray.length; i++) {
			totalEven += evenArray[i];
		}
		return totalEven;
	}

	private static int[] popArray() {
		int[] tempArray = new int[50];
		int counter = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				//Even
				tempArray[counter] = i;
				counter++;
			}

		}
		return tempArray;
	}

}
