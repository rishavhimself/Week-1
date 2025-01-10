// Import Scanner class from util package for user input
import java.util.Scanner;
// Create MultiplesOfNumber Class to display the multiple of given number
public class MultiplesOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Loop from 100 to 1
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {  // Check if i is a multiple of the number
                System.out.println(i);  // Print the multiple
            }
        }
		
		// Close the scanner
		scanner.close();
    }
}
