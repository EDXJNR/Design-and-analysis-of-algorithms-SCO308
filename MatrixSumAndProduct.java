
import java.util.Scanner;
public class MatrixSumAndProduct {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the Matrix: ");
        int n = scanner.nextInt();

        double[] X = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            X[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        double product = 1.0;

        for (int i = 0; i < n; i++) {
            sum += X[i];
            product *= X[i];
        }

        System.out.println("Sum of elements: " + sum);
        System.out.println("Product of elements: " + product);

        scanner.close();
    }
}