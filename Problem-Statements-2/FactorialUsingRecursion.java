// Import Scanner class from util package for user input
import java.util.Scanner;
// Create FactorialUsingRecursion Class to compute Factorial of given number Using Recursion 
public class FactorialUsingRecursion {
	
	// Creating findFactorial method for the same
    public static int findFactorial(int number) {
		if(number==0||number==1)return 1;
        return number*findFactorial(number-1);
    }

    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the number
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
		
		// Calling findFactorial method
        int factorial = findFactorial(number);
        
		// Displaying result
		System.out.println("The Factorial is : " + factorial);
        
		// Close the scanner
		scanner.close();
    }
}