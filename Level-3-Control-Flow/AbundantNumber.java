// Import Scanner class from util package for user input
import java.util.Scanner;
// Create AbundantNumber Class to check if sum of all the divisors of the given number is greater than the number itself
public class AbundantNumber {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter number
        System.out.print("Enter an integer to check if it's an Abundant number: ");
        int number = scanner.nextInt();

        int sum = 0; // Initialize sum to store the sum of divisors

        // Process: Find all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a divisor
                sum += i; // Add the divisor to the sum
            }
        }

        // Output: Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }
		// Close the scanner
        scanner.close();
    }
}
