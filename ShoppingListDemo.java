import java.util.ArrayList;
import java.util.List;

// Represents a grocery item with a name and price.
class Item {
    private String name;
    private double price; // Price per unit
    private int bulkQuantity;
    private double bulkPrice;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.bulkQuantity = 0; // Default no bulk
        this.bulkPrice = 0;
    }

    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceForQuantity(int quantity) {
        if (bulkQuantity > 0 && quantity >= bulkQuantity) {
            int bulkSets = quantity / bulkQuantity;
            int remainingItems = quantity % bulkQuantity;
            return (bulkSets * bulkPrice) + (remainingItems * price);
        } else {
            return quantity * price;
        }
    }
}

// Represents an order for a specific item in a specific quantity.
class ItemOrder {
    private Item item;
    private int quantity;

    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getOrderTotal() {
        return item.getPriceForQuantity(quantity);
    }
}

// Represents a shopping cart containing item orders.
class ShoppingCart {
    private List<ItemOrder> orders;

    public ShoppingCart() {
        orders = new ArrayList<>();
    }

    public void addItemOrder(ItemOrder order) {
        orders.add(order);
    }

    public void removeItemOrder(ItemOrder order) {
        orders.remove(order);
    }

    public ItemOrder findItemOrder(String itemName) {
        for (ItemOrder order : orders) {
            if (order.getItem().getName().equals(itemName)) {
                return order;
            }
        }
        return null;
    }

    public double getTotalPrice() {
        double total = 0;
        for (ItemOrder order : orders) {
            total += order.getOrderTotal();
        }
        return total;
    }
}

public class ShoppingListDemo {
    public static void main(String[] args) {
        Item tissues = new Item("Tissues", 3, 2, 4);
        ItemOrder order1 = new ItemOrder(tissues, 5); // 2+2+1 boxes of tissues = $4+$4+$3

        ShoppingCart cart = new ShoppingCart();
        cart.addItemOrder(order1);

        System.out.println("Total price in cart: $" + cart.getTotalPrice());
    }
}
