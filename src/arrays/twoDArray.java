package arrays;

import java.util.Arrays;

public class twoDArray {

	public static void main(String[] args) {
        int[][] twoDArray = new int[4][3];
        int multiplier = 2;

        for (int row = 0; row < twoDArray.length; row++){
            for (int cell = 0; cell < twoDArray[row].length; cell++){
                twoDArray[row][cell] = twoDArray[row][cell] + multiplier;
                multiplier += 2;
            }
            System.out.println(Arrays.toString(twoDArray[row]));
            
        }
        
        int total = 0;
        
        // total of all 
        for (int row = 0; row < twoDArray.length; row++) {
        	for (int cell = 0; cell < twoDArray[row].length; cell++) {
        		total += twoDArray[row][cell];
        	}
        }
        
        System.out.println("Total: " + total);
        
        float average = total / (twoDArray.length * twoDArray[0].length);
        System.out.printf("Average: %.2f%n", average);
	}

}
