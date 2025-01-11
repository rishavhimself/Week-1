// Import Scanner class from util package for user input
import java.util.Scanner;
// Create NumberSignCheck Class to check the sign of given number
public class NumberSignCheck {
	// Creating a checkNumberSign method to indentify the sign of a number
    public static int checkNumberSign(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        
		// Ask the user to enter the number
		System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
		// Calling checkNumberSign method and displaying result
		System.out.println("The number is " + (checkNumberSign(number) == 1 ? "Positive" : checkNumberSign(number) == -1 ? "Negative" : "Zero"));
        
		// Close the scanner
		scanner.close();
    }
}