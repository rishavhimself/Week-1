// Import Scanner class from util package for user input
import java.util.Scanner;
// Create NaturalNumberSum Class to find sum of given natural numbers
public class NaturalNumberSum {

    // sumRecursive method to find the sum of n natural numbers using recursion
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // sumFormula method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Compute sum using recursion
        int sumRecursive = sumRecursive(n);

        // Compute sum using formula
        int sumFormula = sumFormula(n);

        // Display the results
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare the results
        if (sumRecursive == sumFormula) {
            System.out.println("The results match. Both computations are correct.");
        } else {
            System.out.println("The results do not match. There is an error in the computations.");
        }

		// Close the scanner
        scanner.close();
    }
}
