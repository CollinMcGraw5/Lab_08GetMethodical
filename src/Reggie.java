import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user for a SSN
        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: ###-##-####)", ssnPattern);
        System.out.println("Your SSN: " + ssn);

        // Prompt the user for a UC Student M number
        String mNumberPattern = "^(M|m)\\d{5}$";
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (format: M#####)", mNumberPattern);
        System.out.println("Your UC Student M number: " + mNumber);

        // Prompt the user for a menu choice
        String menuChoicePattern = "^[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (O, S, V, Q)", menuChoicePattern);
        System.out.println("Your menu choice: " + menuChoice);
    }
}
