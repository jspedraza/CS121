import java.util.Scanner;

public class DemoPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] toppings = new String[10];
        int count = 0;
        String input;

        System.out.println("Enter up to 10 pizza toppings. Type 'QUIT' to finish:");
        while (count < 10 && !(input = scanner.nextLine()).equalsIgnoreCase("QUIT")) {
            toppings[count++] = input;
            if (count < 10) {
                System.out.println("Enter next topping or 'QUIT' to finish:");
            }
        }

        System.out.println("Is this pizza to be delivered? (yes/no):");
        boolean isDelivery = scanner.nextLine().trim().equalsIgnoreCase("yes");

        Pizza pizza;
        if (isDelivery) {
            System.out.println("Enter delivery address:");
            String address = scanner.nextLine();
            pizza = new DeliveryPizza(toppings, address, count);
        } else {
            pizza = new Pizza(toppings, count);
        }

        System.out.println(pizza.toString());
    }
}
