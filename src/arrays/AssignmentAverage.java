package arrays;

public class AssignmentAverage {
	
	public static void main(String[] args) {
	// TODO javadoc	

		// Init arrays
		int[] assignmentArray1 = {24, 42, 29, 66, 77};
		int[] assignmnetArray2 = {79, 68, 31, 22, 42};
		
		// Average mark of each assignment float (1 decimal point)
		float averageAssignment1 = getAverage(assignmentArray1);
		float averageAssignment2 = getAverage(assignmnetArray2);
		
		// Print results
		System.out.printf("Assignment 1 average: %.1f%n", averageAssignment1);
		System.out.printf("Assignment 2 average: %.1f%n", averageAssignment2);
		
		// Overall average 
		float overallAverage = (averageAssignment1 + averageAssignment2) / 2;
		System.out.printf("Overall average: %.2f%n", overallAverage);
		
		
		// assignement with best average
		if (averageAssignment1 > averageAssignment2) {
			// Assignement 1 is better
			System.out.println("Assignment 1 has best average: " + averageAssignment1);
			
		}
		else {
			// Assignment 2 is better
			System.out.println("Assignment 2 has best average: " + averageAssignment2);
		}
	}

	private static float getAverage(int[] array) {
		float average = 0;
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		average = total / array.length;
		return average;
	}

}
