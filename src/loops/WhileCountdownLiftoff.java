package loops;

public class WhileCountdownLiftoff {

	public static void main(String[] args) {
		/**
		 * Create a liftoff sequence using a while loop 
		 */
		
		int countdown = 10;
		
		while(countdown >= 1) {
			System.out.print(countdown + ",");
			if(countdown == 1) {
				System.out.print("Liftoff!");
			}
			countdown--;
		}

	}

}
