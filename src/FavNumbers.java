import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their favorite integer
        int favoriteInteger = SafeInput.getInt(in, "Enter your favorite integer");
        System.out.println("Your favorite integer is: " + favoriteInteger);

        // Prompt the user to enter their favorite double
        double favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("Your favorite double is: " + favoriteDouble);
    }
}
