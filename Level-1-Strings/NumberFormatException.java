// Import Scanner class from util package for user input
import java.util.Scanner;
// Create NumberFormatException Class to show NumberFormatException
public class NumberFormatException {
	// Method to create NumberFormatException
	public static int convertIntoInteger(String string){
		int number = Integer.parseInt(string);
		return number;
	}
    
	
	
	public static void main(String args[]){	
		
		 // Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter The String");
		String string = scanner.nextLine();
		
		//Method calling
		int number = convertIntoInteger(string);
		
		//Display result
		System.out.println("The number is : "+ number);
	
		// Close the scanner
		scanner.close();
	}
}