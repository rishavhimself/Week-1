// Import Scanner class from util package for user input
import java.util.Scanner;
// Create LargestAndSecondLargest Class to find Largest and second largest digits
public class LargestAndSecondLargest {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        int number, index = 0;
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
		// Ask the user to enter the number
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;

            if (index == maxDigit) {
                break;
            }
        }

        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
		// Display the results
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
		// Close the scanner
		scanner.close();
	}
}
