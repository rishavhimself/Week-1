// Import Scanner class from util package for user input
import java.util.Scanner;

// Create SumOfNaturalNumbers Class to compute the sum of given natural numbers
public class SumOfNaturalNumbers {
	
	// Creating sumOfNaturalNumbers method for computing the sum
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
		
		// Calling sumOfNaturalNumbers method and displaying result
        System.out.println("The sum of the first " + number + " natural numbers is " + sumOfNaturalNumbers(number));
        
		// Close the scanner
		scanner.close();
		
    }
}
