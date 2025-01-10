// Import Scanner class from util package for user input
import java.util.Scanner;
// Create SumUntilZeroOrNegative Class to compute sum of number until zero or a negative number is given as input
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Initialize the total sum
        double total = 0.0;

        // Infinite loop for taking user input
        while (true) {
			// Ask the user to enter a number
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double userInput = scanner.nextDouble();

            // Break the loop if the user enters 0 or a negative number
            if (userInput <= 0) {
                break;
            }

            total += userInput; // Add the user input to the total
        }

        // Print the total sum
        System.out.println("The total sum is: " + total);
		 // Close the scanner
        scanner.close();
    }
}
