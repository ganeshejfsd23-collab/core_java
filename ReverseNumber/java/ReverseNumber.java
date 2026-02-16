package ReverseNumber.java;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;

        // Loop to reverse the number
        while (num != 0) {
            int digit = num % 10;          // Extract last digit
            reversed = reversed * 10 + digit; // Build reversed number
            num = num / 10;                // Remove last digit
        }

        // Output result
        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}