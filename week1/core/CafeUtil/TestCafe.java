import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil appTest = new CafeUtil();

        // Test getStreakGoal
        System.out.println("----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

        // Test getOrderTotal
        System.out.println("----- Order Total Test -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: $%.2f \n\n", appTest.getOrderTotal(lineItems));

        // Test displayMenu
        System.out.println("----- Display Menu Test -----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Drip Coffee");
        menu.add("Cappuccino");
        menu.add("Latte");
        menu.add("Mocha");
        appTest.displayMenu(menu);

        // Test addCustomer
        System.out.println("\n----- Add Customer Test -----");
        ArrayList<String> customers = new ArrayList<String>();
        appTest.addCustomer(customers);
        System.out.println(customers);

        // Ninja Bonus 1: Test printPriceChart
        System.out.println("\n----- Price Chart Test -----");
        appTest.printPriceChart("Columbian Coffee Grounds", 15.0, 3);

        // Ninja Bonus 2: Format prices as currency (done in printPriceChart method using %.2f format)

        // Ninja Bonus 3: Test overloaded displayMenu method
        System.out.println("\n----- Overloaded Display Menu Test -----");
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(1.5);
        prices.add(3.5);
        prices.add(4.5);
        prices.add(4.0);
        appTest.displayMenu(menu, prices);

        // Ninja Bonus 4: Test addCustomers method
        System.out.println("\n----- Add Multiple Customers Test -----");
        appTest.addCustomers(customers);
        System.out.println(customers);
    }
}
