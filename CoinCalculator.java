import java.util.Scanner;

public class CoinCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for amount in dollars
        System.out.println("Enter an amount in dollars (e.g., 4.55):");
        double amount = scanner.nextDouble();

        // Convert dollars to cents to simplify calculations
        int totalCents = (int) Math.round(amount * 100);

        // Calculate number of quarters, dimes, and nickels
        int quarters = totalCents / 25;
        totalCents %= 25;

        int dimes = totalCents / 10;
        totalCents %= 10;

        int nickels = totalCents / 5;
        totalCents %= 5; // This line is not necessary for the current requirements but can be useful for future extensions, such as including pennies in the calculation.

        // Display the results
        System.out.println("To make $" + amount + ", you will need:");
        System.out.println(quarters + " quarter(s)");
        System.out.println(dimes + " dime(s)");
        System.out.println(nickels + " nickel(s)");

        scanner.close();
    }
}
