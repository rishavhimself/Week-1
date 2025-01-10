// Import Scanner class from util package for user input
import java.util.Scanner;
// Create OddEvenArrays Class to display odd and even numbers separately
public class OddEvenArrays {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter a natural number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Not a natural number.");
            return;
        }

        // Define arrays for odd and even numbers
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;

        // Process: Separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        // Output: Print odd and even numbers
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
		// Close the scanner
        scanner.close();
    }
}
