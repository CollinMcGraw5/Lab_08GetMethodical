import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SafeInput {
    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return an integer input by the user
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retValue = 0;
        boolean validInput = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // Clear invalid input
            }
            pipe.nextLine(); // Clear the newline character
        } while (!validInput);

        return retValue;
    }

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a double value input by the user
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retValue = 0;
        boolean validInput = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a double value.");
                pipe.next(); // Clear invalid input
            }
            pipe.nextLine(); // Clear the newline character
        } while (!validInput);

        return retValue;
    }

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low the low value for the input range
     * @param high the high value for the input range
     * @return an integer input by the user within the specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retValue = 0;
        boolean validInput = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                if (retValue >= low && retValue <= high) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter an integer within the range [" + low + " - " + high + "].");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // Clear invalid input
            }
            pipe.nextLine(); // Clear the newline character
        } while (!validInput);

        return retValue;
    }

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low the low value for the input range
     * @param high the high value for the input range
     * @return a double value input by the user within the specified range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retValue = 0;
        boolean validInput = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                if (retValue >= low && retValue <= high) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a double value within the range [" + low + " - " + high + "].");
                }
            } else {
                System.out.println("Invalid input. Please enter a double value.");
                pipe.next(); // Clear invalid input
            }
            pipe.nextLine(); // Clear the newline character
        } while (!validInput);

        return retValue;
    }

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a boolean value, true for yes and false for no
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        boolean validInput = false;

        do {
            System.out.print(prompt + " [Y/N]: ");
            response = pipe.nextLine().trim().toUpperCase();
            if (response.equals("Y") || response.equals("N")) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter 'Y' for yes or 'N' for no.");
            }
        } while (!validInput);

        return response.equals("Y");
    }

    /**
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param regEx the regular expression pattern to match
     * @return a String response that matches the regular expression pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retString = "";
        boolean validInput = false;

        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine();
            if (retString.matches(regEx)) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a string that matches the pattern: " + regEx);
            }
        } while (!validInput);

        return retString;
    }

    /**
     * @param msg the message to be centered in the pretty header
     */
    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int starsWidth = 3;
        int msgWidth = msg.length();
        int padding = (totalWidth - msgWidth - (2 * starsWidth)) / 2;

        // Print the top row of asterisks
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the middle row with the centered message
        System.out.print("***");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Print the bottom row of asterisks
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
