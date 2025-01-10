// Import Scanner class from util package for user input
import java.util.Scanner;
// Create MultiplicationTable Class to display the table
public class MultiplicationTable {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number for the multiplication table: ");
        int number = scanner.nextInt();

        // Generate the multiplication table for 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
		 // Close the scanner
        scanner.close();
    }
}
