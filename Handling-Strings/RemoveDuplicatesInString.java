// Import Scanner class from util package for user input
import java.util.*;
// Create RemoveDuplicatesInString Class to remove duplicates 
public class RemoveDuplicatesInString {
	
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter a String");
		String string = scanner.nextLine();
		string.toLowerCase();
		
		//implementing HashSet as it doesn't allow duplicates
		HashSet <Character> hashset = new HashSet<>();
		for(int i=0;i<string.length();i++){
			hashset.add(string.charAt(i));
		}
		
		//Display Result
		for(char character : hashset)
		System.out.print(character+" ");
		
		// Close the scanner
		scanner.close();
	}
}