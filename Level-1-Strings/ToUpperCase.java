// Import Scanner class from util package for user input
import java.util.Scanner;
// Create ToUpperCase Class to change the case of given string
public class ToUpperCase {
	
	public static boolean isEqual(String firstString,String secondString){
		if(firstString.length()!=secondString.length())return false;
		else{
			for(int i=0;i<firstString.length();i++){
				if(firstString.charAt(i)!=secondString.charAt(i))return false;
			}
		}
		return true;
	}
    
	public static String genarateString(String string){
		String temp="";
		for(int i=0;i<string.length();i++){
			temp+=(char)((int)string.charAt(i)-32);
		}
		return temp;
	}
	
	public static void main(String args[]){	
		 // Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter String");
		String string = scanner.nextLine();
		
		//Calling methods
		String firstString=string.toUpperCase();
		String secondString=genarateString(string);
		boolean result=isEqual(firstString,secondString);
		
		// Display Result
		System.out.println("The result of checking whether the given strings are equal by a method is : "+ result);
		System.out.print(secondString);
	
		// Close the scanner
		scanner.close();
	}
}