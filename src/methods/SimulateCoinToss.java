package methods;

import java.util.Scanner;
import java.util.Random;

/**
 * Simulates a coin toss when the user chooses heads or tails.
 */
public class SimulateCoinToss {

    /**
     * Main method that request a user input for coin toss choice and prints outcome
     * @param args command line args
     */
    public static void main (String[] args){
        // Init Scanner
        Scanner keyboard = new Scanner(System.in);

        // Init Random
        Random rand = new Random();

        // Print intro and prompt user
        System.out.println("Tossing Coin...");
        System.out.print("Make you choice [1] Heads or [2] for tails: ");

        // assign userCall
        int userCall = keyboard.nextInt();
        keyboard.nextLine();

        // Validate input
        if (userCall == 1 || userCall == 2){
            // Call method - pass random + userCall
            String outcome = coinToss(rand, userCall);

            // Display to user
            System.out.println(outcome);
        }
        else{
            // Display error
            System.out.println("ERROR");
        }

        // Close Scanner
        keyboard.close();
    }

    /**
     * Provides string for coin toss outcome
     * @param rand Random class to simulate boolean coin toss
     * @param userCall user choice
     * @return outcome
     */
    public static String coinToss(Random rand, int userCall) {
        // heads = true || tails = false
        boolean coin = rand.nextBoolean();
        String outcome;

        // map userCall to bool
        boolean userBool;
        if (userCall == 1){
            userBool = true;
        }
        else{
            userBool = false;
        }

        // Check coin and userBool
        if (userBool == coin){
            outcome = "You got it!";
        }
        else{
            outcome = "You didnt get it :(";
        }

        return outcome;
    }
}
