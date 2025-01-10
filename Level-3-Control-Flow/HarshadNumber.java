// Import Scanner class from util package for user input
import java.util.Scanner;
// Create HarshadNumber Class to check if the number is divisible by the sum of its digit
public class HarshadNumber {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter number
        System.out.print("Enter an integer to check if it's a Harshad number: ");
        int number = scanner.nextInt();

        int sum = 0; // Initialize sum to store the sum of digits
        int originalNumber = number; // Store the original number

        // Process: Extract digits and calculate their sum
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            originalNumber /= 10; // Remove the last digit
        }

        // Output: Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
		// Close the scanner
        scanner.close();
    }
}
