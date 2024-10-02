import java.util.ArrayList;

public class Order {
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items;

    // Constructor
    public Order(String name) {
        this.name = name;
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    // Method to add an item to the order
    public void addItem(Item item) {
        this.items.add(item);
        this.total += item.price;
    }

    // Method to mark order as ready
    public void markReady() {
        this.ready = true;
    }

    // Override toString() method to customize print output
    @Override
    public String toString() {
        return String.format("Order[name=%s, total=%.2f, ready=%s, items=%s]", 
                              this.name, this.total, this.ready, this.items);
    }
}
