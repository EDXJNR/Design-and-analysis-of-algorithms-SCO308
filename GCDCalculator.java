import java.util.Scanner;

public class GCDCalculator {

    // Method to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two positive numbers
        System.out.print("Enter the first positive number (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the second positive number (n): ");
        int n = scanner.nextInt();

        // Check if inputs are positive
        if (m <= 0 || n <= 0) {
            System.out.println("Please enter positive numbers.");
        } else {
            // Calculate and display the GCD
            int gcd = calculateGCD(m, n);
            System.out.println("The GCD of " + m + " and " + n + " is: " + gcd);
        }

        scanner.close();
    }
}
