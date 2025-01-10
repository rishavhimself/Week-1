// Import Scanner class from util package for user input
import java.util.Scanner;
// Create FactorsFinder Class to get all the factor of a given number
public class FactorsFinder
 {

    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
           if(number%i==0){
			   factors[index++]=i; // Storing the factors in the array
		   }
        }

        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
		
		// Close the scanner
		scanner.close();
    }
}
