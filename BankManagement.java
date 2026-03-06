// Parent Class
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void createAccount(String name, int accNo, double bal) {
        accountHolder = name;
        accountNumber = accNo;
        balance = bal;
    }

    void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Child Class 1
class SavingsAccount extends BankAccount {

    void addInterest() {
        double interest = balance * 0.05;
        balance = balance + interest;
        System.out.println("Interest Added: " + interest);
    }
}

// Child Class 2
class CurrentAccount extends BankAccount {

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw Successful: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

// Main Class
public class BankManagement {
    public static void main(String[] args) {

        // Savings Account Object
        SavingsAccount sa = new SavingsAccount();
        sa.createAccount("Ganesh", 1001, 5000);
        sa.displayAccount();
        sa.addInterest();

        System.out.println("----------------------");

        // Current Account Object
        CurrentAccount ca = new CurrentAccount();
        ca.createAccount("Einstein", 1002, 8000);
        ca.displayAccount();
        ca.withdraw(2000);
    }
}
