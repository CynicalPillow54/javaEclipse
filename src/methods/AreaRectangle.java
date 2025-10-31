package methods;

import java.util.Scanner;

public class AreaRectangle {
    public static void main (String[] args){
        /*
         * Program to calculate area of rectangle
         */
        // Init Scanner
        Scanner keyboard = new Scanner(System.in);

        // Get height and base
        System.out.println("Please enter the base and height of your rectangle.");
        System.out.print("Height: ");
        int height = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Base: ");
        int base = keyboard.nextInt();
        keyboard.nextLine();

        // call area method
        int area = areaRectangle(height, base);

        // Print area
        System.out.println("Area: " + area);

        // Close Scanner
        keyboard.close();
    }

    public static int areaRectangle(int height, int base) {
        /*
         * Given height and base returns int area
         */
        return height * base;
    }
}
