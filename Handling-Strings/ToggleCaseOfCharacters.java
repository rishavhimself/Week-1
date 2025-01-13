// Import Scanner class from util package for user input
import java.util.Scanner;
// Create ToggleCaseOfCharacters Class to change case of characters
public class ToggleCaseOfCharacters{
	
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter a String");
		String string = scanner.nextLine();
		String newString="";
		
		//Changing the case of character
		for(int i=0;i<string.length();i++){
			Character character = string.charAt(i);
			if (Character.isUpperCase(character)){
				newString+=Character.toLowerCase(character);
			}else{
				newString+=Character.toUpperCase(character);
			}
		}
		
		//Display Result
		System.out.println(newString);

		// Close the scanner
		Scanner.close();
	}
}