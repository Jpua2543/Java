import java.util.Random;

public class BankAccount {
    
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney;
    private String accountNumber;
    
    // CONSTRUCTOR
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accounts++;
        this.accountNumber = generateAccountNumber();
    }
    
    // Private method to generate a random ten digit account number
    private String generateAccountNumber() {
        Random rand = new Random();
        String accountNum = "";
        for (int i = 0; i < 10; i++) {
            accountNum += rand.nextInt(10);
        }
        return accountNum;
    }
    
    // GETTERS
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }
    
    public String getAccountNumber() {
        return this.accountNumber;
    }

    // METHODS
    public void deposit(double amount, String accountType) {
        if(accountType.equals("checking")) {
            this.checkingBalance += amount;
        } else if(accountType.equals("savings")) {
            this.savingsBalance += amount;
        }
        totalMoney += amount;
    }

    public void withdraw(double amount, String accountType) {
        if(accountType.equals("checking")) {
            if(this.checkingBalance >= amount) {
                this.checkingBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in checking!");
            }
        } else if(accountType.equals("savings")) {
            if(this.savingsBalance >= amount) {
                this.savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in savings!");
            }
        }
    }

    public void getBalance() {
        System.out.println("Checking Balance: " + this.checkingBalance);
        System.out.println("Savings Balance: " + this.savingsBalance);
    }
}
