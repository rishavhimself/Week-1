// Import Scanner class from util package for user input
import java.util.Scanner;
// Create MultiplicationTableRange Class to display table of a given number in range(6,9)
public class MultiplicationTableRange {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter the number
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        // Define an array to store multiplication results
        int[] table = new int[4];

        // Process: Store results in the array
        for (int i = 6; i <= 9; i++) {
            table[i - 6] = number * i;
        }

        // Output: Print the table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 6]);
        }
		// Close the scanner
        scanner.close();
    }
}
