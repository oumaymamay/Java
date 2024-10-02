import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    // Add new item to the menu with index
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        newItem.setIndex(menu.size()); // Set the index based on the position in the menu
        menu.add(newItem);
    }

    // Display menu
    public void displayMenu() {
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }

    // Create new order based on user input
    public void newOrder() {
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        
        Order newOrder = new Order(name); // Create a new order

        displayMenu(); // Show menu to user

        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        while (!itemNumber.equals("q")) {
            try {
                int itemIndex = Integer.parseInt(itemNumber);
                Item item = menu.get(itemIndex);
                newOrder.addItem(item); // Add item to the order
                System.out.println(item.getName() + " added to your order.");
            } catch (Exception e) {
                System.out.println("Invalid item index. Please try again.");
            }
            
            System.out.println("Enter another item index or 'q' to quit:");
            itemNumber = System.console().readLine();
        }

        newOrder.display(); // Show the final order
        orders.add(newOrder); // Add to orders list
    }

    // Bonus: Add menu items by user input
    public void addMenuItemByInput() {
        System.out.println("Enter item name:");
        String name = System.console().readLine();

        System.out.println("Enter item price:");
        double price = Double.parseDouble(System.console().readLine());

        addMenuItem(name, price); // Add item to the menu
        System.out.println(name + " added to the menu.");
    }

    // Main method to run the program
    public static void main(String[] args) {
        CoffeeKiosk kiosk = new CoffeeKiosk();

        // Adding some default menu items for testing
        kiosk.addMenuItem("Banana", 2.00);
        kiosk.addMenuItem("Coffee", 1.50);
        kiosk.addMenuItem("Latte", 4.50);
        kiosk.addMenuItem("Cappuccino", 3.00);
        kiosk.addMenuItem("Muffin", 4.00);

        // Display menu and create a new order
        kiosk.displayMenu();
        kiosk.newOrder();
    }
}
