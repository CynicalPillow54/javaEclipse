package loops;

public class WhileLoop {

	public static void main(String[] args) {
		/**
		 * 1. Declare vars sum and num of type int
		 * 2. assign 1 to num 
		 * 3. assign 0 to sum 
		 * 4. add var num to sum -> assign result to sum 
		 * 5. print "The sum is: sum"
		 * 
		 * use while loop from sum of integers from 1 to 10 
		 * loop should terminate when num = 11
		 */
		
		int sum = 0;
		int num = 1;
		
		while (num <= 10) {
			System.out.println(num);
			sum = sum + num;
			System.out.println("The sum is : " + sum);
			num++;
		}

	}

}
