public class CtoFTableDisplay {
    public static void main(String[] args) {
        // Create the table header
        System.out.printf("%-10s%-10s%n", "Celsius", "Fahrenheit");
        System.out.println("----------------------------");

        // Use a for loop to generate the table of Celsius to Fahrenheit conversions
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%-10d%-10.2f%n", celsius, fahrenheit);
        }
    }

    /**
     * Convert Celsius to Fahrenheit
     * @param celsius the temperature in Celsius
     * @return the equivalent temperature in Fahrenheit
     */
    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
