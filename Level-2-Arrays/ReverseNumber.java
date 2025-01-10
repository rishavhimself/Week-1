// Import Scanner class from util package for user input
import java.util.Scanner;
// Create ReverseNumber Class to reverse a given number
public class ReverseNumber {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        int number;
		// Ask the user to enter the number
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        int length = (int) Math.log10(number) + 1; // calculating number of digits
        int[] digits = new int[length];

		// Storing digits in an Array
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed Number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();
		
		// Close the scanner
		scanner.close();
    }
}
