package encapsulation;

class BankAccount {
    // Private fields (data hiding)
    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getters and setters (controlled access)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Business logic methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create object with encapsulated fields
        BankAccount account = new BankAccount(101, "Ganesh Ej", 5000);

        // Access data through getters
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());

        // Modify data through setters and methods
        account.setAccountHolder("Ganesh E");
        account.deposit(2000);
        account.withdraw(3000);

        // Final balance check
        System.out.println("Updated Balance: " + account.getBalance());
    }
}