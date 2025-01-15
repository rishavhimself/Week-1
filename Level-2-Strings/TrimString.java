// Import Scanner class from util package for user input
import java.util.Scanner;
// Create TrimString Class to find the length of string
public class TrimString {
	
	// Method to trim the given string
	public static String trimString(String string){
		StringBuilder stringBuilder = new StringBuilder();
		int startIndex=0, endIndex=0;
		
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)!=' '){
				startIndex=i;
				break;
			}
		}
		for(int i=string.length()-1;i>=0;i--){
			if(string.charAt(i)!=' '){
				endIndex=i;
				break;
			}
		}
		for(int i=startIndex;i<=endIndex;i++){
			stringBuilder.append(string.charAt(i));
		}
		return stringBuilder.toString();
	}
	
	public static void main(String args[]){
			
		// Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter String");
		String string = scanner.nextLine();
		
		// Method calling
		String newString= trimString(string);
		System.out.println("The trimmed String is : "+newString);
		
		// Close the scanner
		scanner.close();
	}
}