public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        
        // Deposit Test
        account1.deposit("checking", 500);
        System.out.println("Account 1 Checking Balance: $" + account1.getCheckingBalance());
        
        account2.deposit("savings", 1000);
        System.out.println("Account 2 Savings Balance: $" + account2.getSavingsBalance());
        
        account3.deposit("checking", 300);
        account3.deposit("savings", 700);
        System.out.println("Account 3 Total Balance: $" + account3.getBalance());
        
        // Withdrawal Test
        account1.withdraw("checking", 100);
        System.out.println("Account 1 Checking Balance After Withdrawal: $" + account1.getCheckingBalance());
        
        account2.withdraw("savings", 500);
        System.out.println("Account 2 Savings Balance After Withdrawal: $" + account2.getSavingsBalance());
        
        account3.withdraw("checking", 500);  // Test insufficient funds
        System.out.println("Account 3 Checking Balance After Withdrawal: $" + account3.getCheckingBalance());
        
        // Static Test (print the number of bank accounts and the total money in all accounts)
        System.out.println("Number of Bank Accounts: " + BankAccount.getAccounts());
        System.out.println("Total Money in Bank: $" + BankAccount.getTotalMoney());
        
        // Print account numbers to verify randomness
        System.out.println("Account 1 Number: " + account1.getAccountNumber());
        System.out.println("Account 2 Number: " + account2.getAccountNumber());
        System.out.println("Account 3 Number: " + account3.getAccountNumber());
    }
}
