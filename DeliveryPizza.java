public class DeliveryPizza extends Pizza {
    private double deliveryFee;
    private String deliveryAddress;

    public DeliveryPizza(String[] toppings, String deliveryAddress, int numberOfToppings) {
        super(toppings, numberOfToppings);
        this.deliveryAddress = deliveryAddress;
        setDeliveryFee();
    }

    private void setDeliveryFee() {
        this.deliveryFee = getPrice() > 18 ? 3 : 5;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    @Override
    public String toString() {
        return super.toString() + " Delivery Address: " + deliveryAddress + ". Delivery Fee: $" + deliveryFee + ". Total Price: $" + (getPrice() + deliveryFee);
    }
}
