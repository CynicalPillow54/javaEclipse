package methods;

import java.util.Scanner;

public class NumberInWord {
    public static void main (String[] args){
        /*
         * Gets input from user -> int and prints the word
         * 1 - 9 else print Other
         */

        // Init Scanner
        Scanner keyboard = new Scanner(System.in);

        // Print request and assign int
        System.out.print("Please input your number: ");
        int userNum = keyboard.nextInt();
        keyboard.nextLine();

        // Get method from user
        System.out.println("Choose method IF[1] or Switch[2]");
        System.out.print("Input your choice: ");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        if (choice == 1){
            // use if method
            printNumberInWordIf(userNum);
        }
        else{
            // use switch method
            printNumberInWordSwitch(userNum);
        }

        // Close Scanner
        keyboard.close();
    }


    private static void printNumberInWordIf(int userNum) {
        // Use nested if
        if (userNum == 1){
            System.out.println("ONE");
        }
        else if(userNum == 2){
            System.out.println("TWO");
        }
        else if (userNum == 3) {
            System.out.println("THREE");
        }
        else if (userNum == 4){
            System.out.println("FOUR");
        }
        else if (userNum == 5){
            System.out.println("FIVE");
        }
        else if (userNum == 6){
            System.out.println("SIX");
        }
        else if (userNum == 7){
            System.out.println("SEVEN");
        }
        else if (userNum == 8){
            System.out.println("EIGHT");
        }
        else if (userNum == 9){
            System.out.println("NINE");
        }
        else{
            System.out.println("OTHER");
        }
    }


    private static void printNumberInWordSwitch(int userNum) {
        switch (userNum){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;

        }
    }
}
