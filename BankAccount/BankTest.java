public class BankTest {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        System.out.println("Account 1 Number: " + account1.getAccountNumber());
        account1.deposit(200.50, "checking");
        account1.deposit(500.75, "savings");
        account1.getBalance();

        System.out.println("\nAccount 2 Number: " + account2.getAccountNumber());
        account2.deposit(1200.00, "checking");
        account2.withdraw(150, "checking");
        account2.getBalance();

        System.out.println("\nAccount 3 Number: " + account3.getAccountNumber());
        account3.deposit(50, "savings");
        account3.withdraw(100, "savings");  // Should display insufficient funds message
        account3.getBalance();

        System.out.println("\nTotal Accounts: " + BankAccount.getAccounts());
        System.out.println("Total Money in Bank: $" + BankAccount.getTotalMoney());
    }
}
