package arrays;

public class Temperatures {

	public static void main(String[] args) {
		// Store temperatures in an float array and then output the average
		float[] temps = {3.4f, 4.2f, 9.0f, 2.2f, 4.5f, 6.4f, 3.1f};
		
		// Init total temp
		float totalTemp = 0;
		
		for ( int temp = 0; temp < temps.length; temp++) {
			totalTemp += temps[temp];
		}
		
		float average = totalTemp / temps.length;
		
		System.out.printf("Average temp: %.2f%n", average);

	}

}
