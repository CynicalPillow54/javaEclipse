package methods;

import java.util.Scanner;

public class AverageAsDouble {
    /**
     * Main method for ad-hoc testing
     * @param args command line args
     */
    public static void main (String[] args){
        // Takes 3 int inputs and returns a double average

        // Init Scanner
        Scanner keyboard = new Scanner(System.in);

        // Get user inputs:
        System.out.println("Please enter 3 inputs to calculate average.");
        int userInt1 = getUserInput(keyboard);
        int userInt2 = getUserInput(keyboard);
        int userInt3 = getUserInput(keyboard);

        // Get average
        System.out.println("Calculating average...");
        double average = calcAvg(userInt1, userInt2, userInt3);

        // Print Average
        System.out.printf("Average is: %.2f%n", average);


        // Close Scanner
        keyboard.close();
    }

    /**
     * Gets average of 3 ints in a double
     * @param userInt1 User Input 1
     * @param userInt2 User Input 2
     * @param userInt3 User Input 3
     * @return average
     */
    public static double calcAvg(int userInt1, int userInt2, int userInt3) {
        double average = (double) (userInt1 + userInt2 + userInt3)/3;
        return average;
    }

    /**
     * Gets the user input
     * @param keyboard Scanner to get user input
     * @return output
     */
    public static int getUserInput(Scanner keyboard) {
        System.out.print("Please enter you number: ");
        int output = keyboard.nextInt();
        keyboard.nextLine();
        return output;
    }
}
