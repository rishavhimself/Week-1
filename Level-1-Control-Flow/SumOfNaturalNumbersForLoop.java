// Import Scanner class from util package for user input
import java.util.Scanner;
// Create SumOfNaturalNumbersForLoop Class to compute sum of given natural numbers using for loop
public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // // Ask the user to enter a natural number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n >= 0) {
            // Compute the sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Compute the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i; // Add the current number to the sum
            }

            // Compare the two results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Verify both results
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is an error in the computations.");
            }
        } else {
            System.out.println("The entered number is not a natural number.");
        }
		 // Close the scanner
        scanner.close();
    }
}
