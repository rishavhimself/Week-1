// Import Scanner class from util package for user input
import java.util.Scanner;
// Create MultiplicationTable Class to display table of given number
public class MultiplicationTable {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter the number
        System.out.print("Enter a number to find its multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store multiplication results
        int[] table = new int[10];

        // Process: Store results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Output: Print the table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
		// Close the scanner
        scanner.close();
    }
}
