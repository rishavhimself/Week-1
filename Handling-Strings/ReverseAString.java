// Import Scanner class from util package for user input
import java.util.Scanner;
// Create ReverseAString Class to Reverse a string
public class ReverseAString {
	
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter a String");
		String string = scanner.nextLine();
		
		//Display Result
		for(int i=string.length()-1;i>=0;i--){
			System.out.print(string.charAt(i));
		}
		System.out.println();
		
		// Close the scanner
		scanner.close();
	}
}