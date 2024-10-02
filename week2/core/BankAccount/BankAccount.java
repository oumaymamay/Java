import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    
    // STATIC VARIABLES
    private static int accounts = 0;
    private static double totalMoney = 0.0;
    
    // CONSTRUCTOR
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = generateAccountNumber();
        accounts++;
    }
    
    // GETTERS
    public double getCheckingBalance() {
        return checkingBalance;
    }
    
    public double getSavingsBalance() {
        return savingsBalance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public static int getAccounts() {
        return accounts;
    }
    
    public static double getTotalMoney() {
        return totalMoney;
    }
    
    // METHODS
    
    // Deposit into checking or savings
    public void deposit(String accountType, double amount) {
        if (accountType.equalsIgnoreCase("checking")) {
            this.checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            this.savingsBalance += amount;
        }
        totalMoney += amount; // Increase total money
    }
    
    // Withdraw from checking or savings
    public void withdraw(String accountType, double amount) {
        if (accountType.equalsIgnoreCase("checking")) {
            if (this.checkingBalance >= amount) {
                this.checkingBalance -= amount;
                totalMoney -= amount; // Decrease total money
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (this.savingsBalance >= amount) {
                this.savingsBalance -= amount;
                totalMoney -= amount; // Decrease total money
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        }
    }
    
    // Get total balance of checking and savings for this account
    public double getBalance() {
        return this.checkingBalance + this.savingsBalance;
    }
    
    // PRIVATE METHOD to generate a random 10-digit account number
    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumber.append(random.nextInt(10));
        }
        return accountNumber.toString();
    }
}
