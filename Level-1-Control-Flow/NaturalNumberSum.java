// Import Scanner class from util package for user input
import java.util.Scanner;
// Create NaturalNumberSum Class to compute sum of given naturals numbers
public class NaturalNumberSum {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a natural number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            // Compute the sum using the formula
            int formulaSum = number * (number + 1) / 2;

            // Compute the sum using a while loop
            int loopSum = 0;
            int counter = 1;
            while (counter <= number) {
                loopSum += counter; // Add the current number to the sum
                counter++; // Increment the counter
            }

            // Compare the two results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            // Check if both results are equal
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
