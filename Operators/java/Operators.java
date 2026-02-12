package Operators.java;

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a;
        System.out.println("c = a  : " + c);
        c += b;
        System.out.println("c += b : " + c);
        c -= b;
        System.out.println("c -= b : " + c);
        c *= b;
        System.out.println("c *= b : " + c);
        c /= b;
        System.out.println("c /= b : " + c);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int d = +a;
        int e = -b;
        System.out.println("+a = " + d);
        System.out.println("-b = " + e);
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b = " + max);
    }
}