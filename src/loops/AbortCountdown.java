package loops;

public class AbortCountdown {

	public static void main(String[] args) {
		/**
		 * Output 1000 to 0 but aborts the sequence at 333 with "Launch aborted!"
		 */
		
		int countdown = 1000;
		
		while (countdown >= 0) {
			if (countdown != 333) {
				System.out.println(countdown);
			}
			else {
				System.out.println("Launch aborted!");
				break;
			}
			
			countdown--;
		}
	}

}
