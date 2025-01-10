// Import Scanner class from util package for user input
import java.util.Scanner;
// Create FactorialForLoop Class to compute factorialusing for loop
public class FactorialForLoop {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            int factorial = 1; // Initialize factorial to 1

            // Compute the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply the current number
            }

            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }
		 // Close the scanner
        scanner.close();
    }
}
