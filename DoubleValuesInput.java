import java.util.Scanner;

public class DoubleValuesInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        double[] values = new double[20]; // Array to store up to 20 double values
        int count = 0; // Counter for the number of inputs

        System.out.println("Enter up to 20 double values. Enter a non-numeric value to stop.");

        // Loop to get the double values from the user
        while (count < 20) {
            System.out.print("Enter double value #" + (count + 1) + ": ");
            if (scanner.hasNextDouble()) {
                values[count] = scanner.nextDouble(); // Store the entered double value
                count++;
            } else {
                System.out.println("Non-numeric value entered. Stopping input.");
                break; // Exit loop if a non-numeric value is entered
            }
        }

        scanner.close(); // Close the scanner

        // Display the entered values
        System.out.println("You entered the following values:");
        for (int i = 0; i < count; i++) {
            System.out.println("Value #" + (i + 1) + ": " + values[i]);
        }
    }
}
