public class TestOrders {
    public static void main(String[] args) {
        // Create items
        Item mocha = new Item("Mocha", 3.50);
        Item latte = new Item("Latte", 4.00);
        Item dripCoffee = new Item("Drip Coffee", 2.50);
        Item cappuccino = new Item("Cappuccino", 3.75);

        // Create orders (2 guests and 3 named)
        Order order1 = new Order("");
        Order order2 = new Order("");
        Order order3 = new Order("Jimmy");
        Order order4 = new Order("Noah");
        Order order5 = new Order("Sam");

        // Add items to orders
        order1.addItem(mocha);
        order1.addItem(latte);

        order2.addItem(dripCoffee);
        order2.addItem(cappuccino);

        order3.addItem(latte);
        order3.addItem(mocha);

        order4.addItem(cappuccino);
        order4.addItem(dripCoffee);

        order5.addItem(dripCoffee);
        order5.addItem(cappuccino);

        // Test getStatusMessage method
        order1.setReady(true);
        System.out.println(order1.getStatusMessage()); // Expected: "Your order is ready."
        System.out.println(order2.getStatusMessage()); // Expected: "Thank you for waiting. Your order will be ready soon."

        // Test getOrderTotal method
        System.out.println("Order 1 Total: $" + order1.getOrderTotal()); // Expected: $7.50
        System.out.println("Order 2 Total: $" + order2.getOrderTotal()); // Expected: $6.25

        // Display all orders
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}


