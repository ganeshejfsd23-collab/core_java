package FibonacciSeries.java;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Loop to generate Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");  // Print current term

            // Update values for next term
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}