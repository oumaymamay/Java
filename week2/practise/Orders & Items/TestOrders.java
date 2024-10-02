public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.0);
        Item item3 = new Item("drip coffee", 2.5);
        Item item4 = new Item("cappuccino", 4.5);

        // Order variables -- order1, order2, etc.
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Application Simulations

        // Print order1
        System.out.println(order1);
        System.out.println(order1.total);

        // Add item1 (mocha) to order2 and increment total
        order2.addItem(item1);
        System.out.println(order2);

        // Noah ordered a cappuccino
        order3.addItem(item4);
        System.out.println(order3);

        // Sam added a latte
        order4.addItem(item2);
        System.out.println(order4);

        // Cindhuri’s order is now ready
        order1.markReady();
        System.out.println(order1);

        // Sam ordered more drinks - 2 lattes
        order4.addItem(item2);
        order4.addItem(item2);
        System.out.println(order4);

        // Jimmy’s order is now ready
        order2.markReady();
        System.out.println(order2);
    }
}

