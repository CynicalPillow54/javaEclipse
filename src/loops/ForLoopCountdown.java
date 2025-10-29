package loops;

public class ForLoopCountdown {

	public static void main(String[] args) {
		/**
		 * Output this:
		 * 1,2,34,5,6,7,8,9,10
		 */
		
		//Create for loop
		for (int i = 1; i <= 10; i++) {
			if(i == 10) {
			System.out.print(i);
			}
			else {
				System.out.print(i+",");
			}
		}
	}

}
