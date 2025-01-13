// Import Scanner class from util package for user input
import java.util.Scanner;
// Create MostFrequentCharacter Class to remove given character
public class MostFrequentCharacter {
	
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter a String");
		String string = scanner.nextLine();
		System.out.println("Enter character to Remove");
		char character = scanner.next().charAt(0);
		
		//Display Result
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)!=character)System.out.print(string.charAt(i));
		}
		System.out.println();
		
		// Close the scanner
		scanner.close();
		
		
	}
}
