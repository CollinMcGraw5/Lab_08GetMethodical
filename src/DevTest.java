import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString method
        String nonEmptyString = SafeInput.getNonZeroLenString(in, "Enter a non-empty string");
        System.out.println("You entered: " + nonEmptyString);

        // Test getInt method
        int integerValue = SafeInput.getInt(in, "Enter any integer");
        System.out.println("You entered the integer: " + integerValue);

        // Test getDouble method
        double doubleValue = SafeInput.getDouble(in, "Enter any double value");
        System.out.println("You entered the double value: " + doubleValue);

        // Test getRangedInt method
        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer within the range", 10, 20);
        System.out.println("You entered the ranged integer: " + rangedInt);

        // Test getRangedDouble method
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double value within the range", 1.5, 9.5);
        System.out.println("You entered the ranged double value: " + rangedDouble);

        // Test getYNConfirm method
        boolean ynConfirm = SafeInput.getYNConfirm(in, "Do you agree?");
        System.out.println("You entered: " + (ynConfirm ? "Yes" : "No"));

        // Test getRegExString method
        String regexString = SafeInput.getRegExString(in, "Enter a string that matches the pattern [a-zA-Z]+", "[a-zA-Z]+");
        System.out.println("You entered a matching string: " + regexString);
    }
}
