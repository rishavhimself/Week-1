// Import Scanner class from util package for user input
import java.util.Scanner;
// Create Division Class to find Quotient and Remainder
public class Division {
	
	// Creating findRemainderAndQuotient method to find Quotient and Remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the Dividend
        System.out.print("Enter a number: ");
        int dividend = scanner.nextInt();
		
		// Ask the user to enter the Divisor
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
		
		// Calling findRemainderAndQuotient method
        int[] quotientRemainder = findRemainderAndQuotient(dividend, divisor);
        
		// Displaying result
		System.out.println("Quotient: " + quotientRemainder[0] + ", Remainder: " + quotientRemainder[1]);
        
		// Close the scanner
		scanner.close();
    }
}