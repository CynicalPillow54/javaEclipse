package methods;

public class IntegerMultipleEvaluator {

	public static void main(String[] args) {
		/*
		 * Program where given two ints it will evaluate if the second is a multiple of the first
		 */

		// Init ints 
		int num1 = 2;
		int num2 = 12;
		
		isMultiple(num1, num2);
	}

	private static void isMultiple(int num1, int num2) {
		/*
		 * will evualte if num2 is multiple of num1
		 */
		
		if (num2 % num1 != 0) {
			// Not multiple
			System.out.println("Not multiple");
		}
		else {
			// Multiple
			System.out.println("Multiple");
		}
		
	}

}
