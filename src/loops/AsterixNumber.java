package loops;

public class AsterixNumber {

	public static void main(String[] args) {
		/**
		 * Program for nested FOR loop 
		 * Outputs:
		 * *1,*2,*3...*10
		 * **1,**2,**3...**10
		 * ***1,***2,***3...***10
		 * ...
		 */
		
		// Init Number of *
		int asterix = 5;
		
		// Init max values
		int maxValues = 100; 
		
		for (int i = 1; i <= asterix; i++) {
			String asterixCombo = "*".repeat(i);
			for (int j = 1; j <= maxValues; j++) {
				if(j != maxValues) {
					System.out.print(asterixCombo+j+", ");
				}
				else {
					System.out.print(asterixCombo+j+"\n");
				}
			}
		}
		
	}

}
