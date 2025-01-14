// Import Scanner class from util package for user input
import java.util.Scanner;
// Create StringPalindromeCheck Class to check if the given String is Palindrome
public class StringPalindromeCheck {
	
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		 Scanner scanner =new Scanner(System.in);
		
		 // Ask the user to enter the string
		 System.out.println("Enter a String");
		 String string = scanner.nextLine();
		 boolean flag = true;
		
		 int start=0,end=string.length()-1;
		 while(start<=end){
				if(string.charAt(start)!=string.charAt(end)){ //Matching first and last elements
				flag=false;
				break;
				}
			
			    start++;end--;
			}
		
		 // Display Result
		 if(flag)System.out.println("The given string is palindrome");
		 else System.out.println("The given string is not palindrome");
		
		 // Close the scanner
		 scanner.close();
	}
}