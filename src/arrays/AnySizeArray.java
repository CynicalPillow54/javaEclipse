package arrays;

import java.util.Arrays;

public class AnySizeArray {

	public static void main(String[] args) {
		// method that will output the contents of an array of ints (of any size) to screen.  
		
		// Init array
		int[] myArray = {1, 2, 3, 4, 5};
		
		printArray(myArray);

	}

	private static void printArray(int[] myArray) {
		System.out.println(Arrays.toString(myArray));
		
	}

}
