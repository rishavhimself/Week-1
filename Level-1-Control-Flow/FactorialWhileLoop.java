// Import Scanner class from util package for user input
import java.util.Scanner;
// Create FactorialWhileLoop Class to compute factorial using while loop
public class FactorialWhileLoop {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            int factorial = 1; // Initialize factorial to 1
            int counter = 1;

            // Compute the factorial using a while loop
            while (counter <= number) {
                factorial *= counter; // Multiply the current counter
                counter++; // Increment the counter
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
