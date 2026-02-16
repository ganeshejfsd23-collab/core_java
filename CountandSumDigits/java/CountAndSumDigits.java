package CountandSumDigits.java;
import java.util.Scanner;

public class CountAndSumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int sum = 0;
        int temp = num;  // Preserve original number

        // Loop to count digits and calculate sum
        while (temp != 0) {
            int digit = temp % 10;   // Extract last digit
            sum += digit;            // Add digit to sum
            count++;                 // Increase digit count
            temp = temp / 10;        // Remove last digit
        }

        // Output results
        System.out.println("Number of digits in " + num + " = " + count);
        System.out.println("Sum of digits in " + num + " = " + sum);

        sc.close();
    }
}