// Import Scanner class from util package for user input
import java.util.Scanner;
// Create LargestDigitsDynamicArray Class to find largest digit and second largest digit
public class LargestDigitsDynamicArray {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        while (number <= 0) {
            System.out.print("Invalid input. Please enter a positive number: ");
            number = scanner.nextInt();
        }

        // Initialize variables
        int maxDigit = 10; // Initial size of the array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                // Increase the size of the array by 10
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }

            digits[index] = number % 10; // Get the last digit
            number /= 10;               // Remove the last digit
            index++;
        }

        // Initialize variables for largest and second largest digits
        int largest = -1, secondLargest = -1;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i];     // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
		
		// Close the scanner
		scanner.close();
    }
}
