// Import Scanner class from util package for user input
import java.util.Scanner;
// Create LargestNumberCheck Class to get the largest number
public class LargestNumberCheck {

		// Create isLargest method to find largest
		public static int isLargest(int number1,int number2,int number3){
			if((number1 > number2 && number1 > number3))return number1;
			else if((number2 > number1 && number2 > number3)) return number2;
			else return number3;
		}
		public static void main(String[] args) {	
			// Create a Scanner object for taking input
			Scanner scanner = new Scanner(System.in);

			// Ask the user to enter three numbers
			System.out.print("Enter the first number: ");
			int number1 = scanner.nextInt();
			System.out.print("Enter the second number: ");
			int number2 = scanner.nextInt();
			System.out.print("Enter the third number: ");
			int number3 = scanner.nextInt();

			// Display the results
			System.out.println("The largest number is :" + isLargest(number1,number2,number3));

			// Close the scanner
			scanner.close();
	}
}
