import java.util.Scanner;

public class BigYPizzaOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to BigY Store Pizza Ordering System!");
        System.out.println("Please select your pizza size:");
        System.out.println("1. Small ($5)");
        System.out.println("2. Medium ($10)");
        System.out.println("3. Large ($15)");
        System.out.println("4. Super ($20)");

        System.out.print("Enter your choice (1-4): ");
        int sizeChoice = scanner.nextInt();
        double price = 0.0;
        switch (sizeChoice) {
            case 1: price = 5.0; break;
            case 2: price = 10.0; break;
            case 3: price = 15.0; break;
            case 4: price = 20.0; break;
            default: System.out.println("Invalid choice. Defaulting to Small.");
                price = 5.0;
        }

        System.out.println("You can add up to 3 toppings. Each topping is an additional $0.50.");
        System.out.println("Available toppings: Pepperoni, Mushrooms, Onions, Extra Cheese");
        System.out.println("Enter the number of toppings you want (0 to 3):");
        int toppingCount = scanner.nextInt();
        double toppingPrice = 0.0;

        if (toppingCount > 0 && toppingCount <= 3) {
            if (toppingCount == 1) {
                toppingPrice = 0.50;
            } else if (toppingCount == 2) {
                toppingPrice = 1.00;
            } else if (toppingCount == 3) {
                toppingPrice = 1.25;
            }
            System.out.println("For " + toppingCount + " topping(s), an additional $" + toppingPrice + " will be added.");
        } else {
            System.out.println("Invalid number of toppings. No additional toppings will be added.");
        }

        price += toppingPrice;

        System.out.println("Total price of your pizza order: $" + price);
        System.out.println("Thank you for ordering from BigY Store!");
    }
}
