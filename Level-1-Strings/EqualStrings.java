// Import Scanner class from util package for user input
import java.util.Scanner;
// Create EqualStrings Class to check if strings are equal
public class EqualStrings {
	// Method to check if they are equal
	public static boolean isEqual(String firstString,String secondString){
		if(firstString.length()!=secondString.length())return false;
		else{
			for(int i=0;i<firstString.length();i++){
				if(firstString.charAt(i)!=secondString.charAt(i))return false;
			}
		}
		return true;
	}
    
	
	
	public static void main(String args[]){	
		
		 // Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the first string
		System.out.println("Enter First String");
		String firstString = scanner.nextLine();
		
		// Ask the user to enter the second string
		System.out.println("Enter Second String");
		String secondString = scanner.nextLine();
		
		//Method calling
		boolean result=isEqual(firstString,secondString);
		
		//Display result
		System.out.println("The result of checking whether the given strings are equal by a method is : "+ result);
		System.out.println("The result of checking whether the given strings are equal by a function is : "+ firstString.equals(secondString));
	
		// Close the scanner
		scanner.close();
	}
}