//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        // Array of 10 first names
        String[] names = {"John", "Jane", "Michael", "Sarah", "William", "Jessica", "David", "Emily", "Daniel", "Sophia"};

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for an integer
            System.out.print("Enter an index (0-9) to display a name: ");
            int index = scanner.nextInt();

            // Display the name at the requested position
            System.out.println("Name at position " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Display an error message if the index is out of bounds
            System.out.println("Error: The number you entered is out of range. Please enter a number between 0 and 9.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
