package loops;

public class ForLoopCountdownLiftoff {

	public static void main(String[] args) {
		/**
		 * Output this:
		 * 1,2,34,5,6,7,8,9,10
		 */
		
		//Create for loop
		for (int i = 10; i >= 1; i--) {
			if(i == 1) {
			System.out.print(i+",Liftoff!");
			}
			else {
				System.out.print(i+",");
			}
		}
	}

}
