public class Item {
    String name;
    double price;

    // Constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Override toString() method to customize print output
    @Override
    public String toString() {
        return String.format("Item[name=%s, price=%.2f]", this.name, this.price);
    }
}
