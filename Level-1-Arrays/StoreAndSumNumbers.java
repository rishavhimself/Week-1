// Import Scanner class from util package for user input
import java.util.Scanner;
// Create StoreAndSumNumbers Class to compute sum of given natural numbers (10 max)
public class StoreAndSumNumbers {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Define an array to store up to 10 numbers and initialize variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (stop with 0 or a negative number):");

        // Input: Ask the user to enter the number
        while (true) {
            double input = scanner.nextDouble();
            if (input <= 0 || index == 10) {
                break;
            }
            numbers[index++] = input;
        }

        // Process: Calculate the sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Output: Display all numbers and the sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of numbers: " + total);
		
		// Close the scanner
        scanner.close();
    }
}
