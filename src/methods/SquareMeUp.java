package methods;

import java.util.Scanner;

/**
 * A simple console program that draws a square made of a user-specified character.
 * <p>
 * The program prompts the user for the length of the square's sides and the
 * character to use, then prints the square to the console using text-based graphics.
 * <p>
 * Example output:
 * <pre>
 * Enter the length of side: 4
 * Enter the character to build the box with: #
 * ####
 * #  #
 * #  #
 * ####
 * </pre>
 *
 * This class demonstrates use of loops, user input with {@link Scanner},
 * and simple string manipulation.
 */
public class SquareMeUp {

    /**
     * The entry point of the application.
     * <p>
     * This method:
     * <ul>
     *     <li>Displays a welcome message.</li>
     *     <li>Prompts the user for the side length and border character.</li>
     *     <li>Draws a hollow square using the specified parameters.</li>
     * </ul>
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Init Scanner
        Scanner keyboard = new Scanner(System.in);

        // Print Welcome Screen
        String welcome = """
                ░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░▒▓█▓▒░      ░▒▓██████▓▒░ ░▒▓██████▓▒░░▒▓██████████████▓▒░░▒▓████████▓▒░
                ░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░
                ░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░     ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░
                ░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░ ░▒▓█▓▒░     ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░
                ░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░     ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░
                ░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░     ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░
                 ░▒▓█████████████▓▒░░▒▓████████▓▒░▒▓████████▓▒░▒▓██████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓████████▓▒░
                """;
        System.out.println(welcome);
        System.out.println("---------------------------------------------------------------------------------------------------------");

        // Get user input
        System.out.print("Enter the length of side: ");
        int side = keyboard.nextInt();
        keyboard.nextLine(); // consume newline

        System.out.print("Enter the character to build the box with: ");
        char borderChar = keyboard.nextLine().charAt(0);

        // Draw top border
        drawHorizontal(side, borderChar);

        // Draw sides (excluding top and bottom)
        for (int j = 0; j < side - 2; j++) {
            drawSides(side, borderChar);
        }

        // Draw bottom border
        drawHorizontal(side, borderChar);

        // Close Scanner
        keyboard.close();
    }

    /**
     * Draws a horizontal border (top or bottom row) of the square.
     * <p>
     * This method prints a full line of the given character repeated {@code side} times.
     *
     * @param side       the number of characters to print (the square's width)
     * @param borderChar the character used to draw the border
     */
    public static void drawHorizontal(int side, char borderChar) {
        String horizontal = String.valueOf(borderChar).repeat(side);
        System.out.println(horizontal);
    }

    /**
     * Draws a single middle row of the square (with spaces in the middle and border characters on each side).
     *
     * @param side       the total width of the square
     * @param borderChar the character used for the left and right borders
     */
    public static void drawSides(int side, char borderChar) {
        String vertical = String.format("%s%s%s", borderChar, " ".repeat(side - 2), borderChar);
        System.out.println(vertical);
    }
}
