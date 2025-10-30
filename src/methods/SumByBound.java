package methods;

import java.util.Scanner;

public class SumByBound {
    public static void main (String[] args){
        /*
         * Get user input and then sunm all numbers from 1 to input and provide sum and average
         */

        // Init Scanner
        Scanner keyboard = new Scanner(System.in);

        // Get User upper bound
        System.out.print("Please input your upper bound: ");
        int upperBound = keyboard.nextInt();
        keyboard.nextLine();

        sum(upperBound);

        average(upperBound);

        // Close Scanner
        keyboard.close();
    }

    private static void sum(int upperBound) {
        int i = 1;
        int summing = 0;
        while (i <= upperBound){

            summing = summing + i;
            i++;
        }
        System.out.println("Sum = " + summing);
    }

    private static void average(int upperBound) {
        int j = 1;
        int summing = 0;
        while (j <= upperBound){

            summing = summing + j;
            j++;
        }
        float averaging = (float) summing / upperBound;
        System.out.println("Average = " + averaging);
    }
}
