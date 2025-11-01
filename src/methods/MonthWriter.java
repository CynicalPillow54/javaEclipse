package methods;

import java.util.Scanner;

public class MonthWriter {
    /**
     * Main Method for ad-hoc testing
     * @param args Args
     */
    public static void main (String[] args){
        /*
        Program that takes a input for user and print out the corresponding month
         */

        // Init Scanner
        Scanner keyboard = new Scanner(System.in);

        // Get user input
        System.out.print("Please enter your month as numerals here: ");
        int userMonth = keyboard.nextInt();
        keyboard.nextLine();

        // Call method to print word
        String month = stringMonth(userMonth);

        System.out.println("Month: "+ month);

        // Close Scanner
        keyboard.close();
    }

    /**
     * Assigns string to given int month
     *
     * @param userMonth user input for moth
     * @return month
     */
    public static String stringMonth(int userMonth) {

        // Init month
        String month = "";

        // User switch statement
        switch(userMonth){
            case 1:
                month = "Jan";
                break;
            case 2:
                month = "Feb";
                break;
            case 3:
                month = "Mar";
                break;
            case 4:
                month = "Apr";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "Jun";
                break;
            case 7:
                month = "Jul";
                break;
            case 8:
                month = "Aug";
                break;
            case 9:
                month = "Sep";
                break;
            case 10:
                month = "Oct";
                break;
            case 11:
                month = "Nov";
                break;
            case 12:
                month = "Dec";
                break;
            default:
                month = "ERROR";
        }

        return month;
    }
}
