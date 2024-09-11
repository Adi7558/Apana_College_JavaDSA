import java.util.Scanner;

public class FibonacciRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a positive integer for the Fibonacci sequence: ");
        int n = scanner.nextInt();

        // Check if the input is valid
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }

        // Calculate and display the Fibonacci number using recursion
        System.out.println("Fibonacci number (recursive) at position " + n + " is: " + fibonacciRecursive(n));
    }

    // Recursive method to calculate Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}

Output:


Enter a positive integer for the Fibonacci sequence: 10
Fibonacci number (recursive) at position 10 is: 55