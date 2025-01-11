// Import Scanner class from util package for user input
import java.util.Scanner;
// Create SmallestAndLargest Class to find smallest and largest of given numbers
public class SmallestAndLargest {
	// Creating findSmallestAndLargest method for the same
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the numbers
        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
		
		// Calling findSmallestAndLargest method
        int[] result = findSmallestAndLargest(num1, num2, num3);
        
		// Displaying result
		System.out.println("The smallest is " + result[0] + " and the largest is " + result[1]);
        
		// Close the scanner
		scanner.close();
    }
}