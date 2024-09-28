import java.util.ArrayList;

public class TestPuzzleJava {
    public static void main(String[] args) {
        // Test for getTenRolls
        ArrayList<Integer> rolls = PuzzleJava.getTenRolls();
        System.out.println("Random Rolls: " + rolls);

        // Test for generateRandomLetter
        String randomLetter = PuzzleJava.generateRandomLetter();
        System.out.println("Random Letter: " + randomLetter);

        // Test for generatePassword
        String password = PuzzleJava.generatePassword();
        System.out.println("Generated Password: " + password);

        // Test for getNewPasswordSet
        String[] passwordSet = PuzzleJava.getNewPasswordSet(5); // Generating 5 passwords
        System.out.println("Password Set: ");
        for (String pass : passwordSet) {
            System.out.println(pass);
        }
    }
}

