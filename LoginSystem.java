package login.java;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        // Stored username and password
        String storedUsername = "admin";
        String storedPassword = "12345";
        Scanner sc = new Scanner(System.in);
        int attempts = 0; // counter variable
        boolean success = false;
        // Allow up to 3 attempts
        while (attempts < 3 && !success) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            // Check credentials using logical AND
            if (username.equals(storedUsername) && password.equals(storedPassword)) {
                System.out.println("Login successful!");
                success = true; // mark success
            } else {
                attempts++; // increment counter
                if (attempts < 3) {
                    System.out.println("Incorrect credentials. Try again.");
                }
            }
        }
        // If failed 3 times
        if (!success) {
            System.out.println("Account locked due to 3 failed attempts.");
        }
        sc.close();
    }
}
