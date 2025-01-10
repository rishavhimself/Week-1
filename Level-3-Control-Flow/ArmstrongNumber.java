// Import Scanner class from util package for user input
import java.util.Scanner;
// Create ArmstrongNumber Class to check if the given number is armstrong
public class ArmstrongNumber {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter number
        System.out.print("Enter an integer to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        int originalNumber = number; // Store the original number for comparison
        int sum = 0; // Initialize sum to store the sum of cubes of digits

        // Process: Extract digits and compute the sum of their cubes
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            sum += Math.pow(digit, 3); // Add the cube of the digit to the sum
            originalNumber /= 10; // Remove the last digit
        }

        // Output: Compare the sum with the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
		// Close the scanner
        scanner.close();
    }
}
