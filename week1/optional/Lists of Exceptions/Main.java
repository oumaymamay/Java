import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating the ArrayList
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        // Looping through the list and attempting to cast to Integer
        for (int i = 0; i < myList.size(); i++) {
            try {
                // Attempting to cast to Integer
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Casted value: " + castedValue);
            } catch (ClassCastException e) {
                // Handling the exception and printing out the error details
                System.out.println("Error at index " + i + ": " + myList.get(i) + " cannot be cast to Integer.");
                System.out.println("Exception message: " + e.getMessage());
            }
        }
        System.out.println("Program continues after exception handling.");
    }
}
