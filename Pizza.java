public class Pizza {
    private String[] toppings = new String[10];
    private double price;
    private String description = "";

    public Pizza(String[] toppings, int numberOfToppings) {
        System.arraycopy(toppings, 0, this.toppings, 0, numberOfToppings);
        for (int i = 0; i < numberOfToppings; i++) {
            this.description += toppings[i];
            if (i < numberOfToppings - 1) {
                this.description += ", ";
            }
        }
        this.price = 14 + (2 * numberOfToppings);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza with toppings: " + description + ". Price: $" + price;
    }
}
