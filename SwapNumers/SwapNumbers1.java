package SwapNumers;

import java.util.Scanner;

public class SwapNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping without temporary variable
        num1 = num1 + num2;  // Step 1
        num2 = num1 - num2;  // Step 2
        num1 = num1 - num2;  // Step 3

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        scanner.close();
    }
}