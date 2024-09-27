import java.util.ArrayList;

public class CafeUtil {

    // Streak goal method
    public int getStreakGoal() {
        int totalPurchases = 0;
        for (int week = 1; week <= 10; week++) {
            totalPurchases += week;
        }
        return totalPurchases;
    }

    // Order total method
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    // Display menu method
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s\n", i, menuItems.get(i));
        }
    }

    // Add customer method
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!\n", userName);
        System.out.printf("There are %d people in front of you.\n", customers.size());
        customers.add(userName);
    }

    // Ninja Bonus 1: Print Price Chart
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int quantity = 1; quantity <= maxQuantity; quantity++) {
            double totalPrice = quantity * price;
            System.out.printf("%d - $%.2f\n", quantity, totalPrice);
        }
    }

    // Ninja Bonus 3: Overload displayMenu to include prices
    public void displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            System.out.println("Error: Mismatched menu items and prices.");
            return;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s -- $%.2f\n", i, menuItems.get(i), prices.get(i));
        }
    }

    // Ninja Bonus 4: Add customers from a list
    public void addCustomers(ArrayList<String> customers) {
        System.out.println("Enter customer names, type 'q' to quit:");
        while (true) {
            String name = System.console().readLine();
            if (name.equals("q")) {
                break;
            }
            customers.add(name);
        }
        System.out.println("Customer list updated!");
    }
}
