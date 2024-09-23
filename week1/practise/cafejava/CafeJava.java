public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice=3.6;
        double lattePrice = 3.7;
        double cappuccinoPrice = 3.8;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4="Noah";


    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        
    
        System.out.println(readyMessage + " : " +  customer1);
        if(isReadyOrder4){
            System.out.println(customer4 + " : " + readyMessage + "  , And " + displayTotalMessage + " : " + cappuccinoPrice);
        }else{
            System.out.println(pendingMessage);
        }
        // This for Sam .
        double totalPriceSam=2*lattePrice;
        isReadyOrder2 = true;
        System.out.println(isReadyOrder2?customer2 + " : Your Total is $" +totalPriceSam : pendingMessage);

 // this for the Jimmy ;
        System.out.println("Jimmy you have been charged for cappuccino and the total is : "
                + cappuccinoPrice +
                "$ ,"
                + "and you have ordered the latte So Your New Total is " + (cappuccinoPrice+lattePrice) + "$" );
    }
}
