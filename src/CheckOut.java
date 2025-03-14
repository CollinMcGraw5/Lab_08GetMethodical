import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems;

        do {
            // Prompt the user for the price of their item
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            totalCost += itemPrice;

            // Ask the user if they have more items
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
        } while (moreItems);

        // Display the total cost of the item(s)
        System.out.printf("The total cost of your items is: $%.2f\n", totalCost);
    }
}
