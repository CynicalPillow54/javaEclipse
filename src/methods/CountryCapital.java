package methods;

import java.util.Scanner;

/**
 * Class that prompts the user for a number to choose a country and then maps the choice to a country and also prints the country's capital city.
 */
public class CountryCapital {

    /**
     * Main method used for ad-hoc testing
     * @param args command line args
     */
    public static void main (String[] args){
        // For a G8 country input print the correct capital

        // Init Scanner
        Scanner keyboard = new Scanner(System.in);

        // Let user choose country
        System.out.println("*** G8 Capital Printer ***");
        System.out.println("Please choose your country from this list:");
        System.out.println("--------------------------------------------");
        System.out.printf("[1]%-15s | [2]%-15s %n", "Canada", "France");
        System.out.printf("[3]%-15s | [4]%-15s %n", "Germany", "Italy");
        System.out.printf("[5]%-15s | [6]%-15s %n", "Japan", "Russia");
        System.out.printf("[7]%-15s | [8]%-15s %n", "United Kingdom", "United States");
        System.out.println("--------------------------------------------");
        System.out.print("Please input your choice and press return: ");
        int userChoice = keyboard.nextInt();
        keyboard.nextLine();

        // Match user choice to Country
        String country = matchCountry(userChoice);

        // Match country to capital
        String capital = matchCapital(country);

        // Print both
        System.out.println("--------------------------------------------");
        System.out.printf("%-15s | %15s %n", "Country", "Capital");
        System.out.printf("%-15s | %15s %n", country, capital);


        // Close Scanner
        keyboard.close();
    }

    /**
     * Assigns capital when given country name
     * @param country country name
     * @return capital
     */
    private static String matchCapital(String country) {
        String capital;
        if (country.equals("Canada")){
            capital = "Ottawa";
        } else if (country.equals("France")) {
            capital = "Paris";
        } else if (country.equals("Germany")) {
            capital = "Berlin";
        } else if (country.equals("Italy")) {
            capital = "Rome";
        } else if (country.equals("Japan")) {
            capital = "Tokyo";
        } else if (country.equals("Russia")) {
            capital = "Moscow";
        } else if (country.equals("United Kingdom")) {
            capital = "London";
        } else if (country.equals("United States")) {
            capital = "Washington DC";
        }
        else {
            capital = "ERROR";
        }
        return capital;
    }

    /**
     * Assigns country when given an int 1 - 8 (Inclusive)
     * @param userChoice The choice of the user between 1 and
     * @return country
     */
    private static String matchCountry(int userChoice) {
        String country;
        switch(userChoice){
            case 1:
                country = "Canada";
                break;
            case 2:
                country = "France";
                break;
            case 3:
                country = "Germany";
                break;
            case 4:
                country = "Italy";
                break;
            case 5:
                country = "Japan";
                break;
            case 6:
                country = "Russia";
                break;
            case 7:
                country = "United Kingdom";
                break;
            case 8:
                country = "United States";
                break;
            default:
                country = "ERROR";

        }
        return country;
    }
}
