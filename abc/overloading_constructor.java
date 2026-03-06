package abc;

class BankAccount {

    int accountNumber;
    String accountHolder;
    double balance;

    // Default Constructor
    BankAccount() {
        accountNumber = 0;
        accountHolder = "Unknown";
        balance = 0.0;
    }

    // Constructor with 2 parameters
    BankAccount(int accNo, String name) {
        accountNumber = accNo;
        accountHolder = name;
        balance = 0.0;
    }

    // Constructor with 3 parameters
    BankAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolder = name;
        balance = bal;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Using default constructor
        BankAccount a1 = new BankAccount();

        // Using constructor with 2 parameters
        BankAccount a2 = new BankAccount(101, "Ganesh");

        // Using constructor with 3 parameters
        BankAccount a3 = new BankAccount(102, "Ravi", 50000);

        a1.display();
        a2.display();
        a3.display();
    }
}
