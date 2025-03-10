import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user for the year of birth (1950-2015)
        int year = SafeInput.getRangedInt(in, "Enter the year of your birth", 1950, 2015);

        // Prompt the user for the month of birth (1-12)
        int month = SafeInput.getRangedInt(in, "Enter the month of your birth", 1, 12);

        // Prompt the user for the day of birth based on the month
        int day = 0;
        switch (month) {
            case 2: // February (1-29)
                day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 29);
                break;
            case 4: case 6: case 9: case 11: // April, June, September, November (1-30)
                day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 30);
                break;
            default: // January, March, May, July, August, October, December (1-31)
                day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 31);
                break;
        }

        // Prompt the user for the hour of birth (1-24)
        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth", 1, 24);

        // Prompt the user for the minute of birth (1-59)
        int minute = SafeInput.getRangedInt(in, "Enter the minute of your birth", 1, 59);

        // Output the entered birth date and time
        System.out.println("You were born on: " + year + "-" + month + "-" + day + " at " + hour + ":" + minute);
    }
}
