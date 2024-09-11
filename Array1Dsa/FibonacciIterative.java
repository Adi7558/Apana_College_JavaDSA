import java.util.Scanner;

public class FibonacciIterative {

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

        // Calculate and display the Fibonacci number using iteration
        System.out.println("Fibonacci number (iterative) at position " + n + " is: " + fibonacciIterative(n));
    }

    // Iterative method to calculate Fibonacci number
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}


output:

Enter a positive integer for the Fibonacci sequence: 10
Fibonacci number (iterative) at position 10 is: 55