// Import Scanner class from util package for user input
import java.util.Scanner;
// Create SubString Class to create sub String
public class SubString {
	public static String generateSubString(String string, int start, int end){
		String temp="";
		for(int i=start;i<end;i++){
			temp+=string.charAt(i);
		}
		return temp;
	}
	
	
	
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
		
		// Ask the user to enter the string
		System.out.println("Enter String");
		String string = scanner.nextLine();
		
		// Ask the user to enter the start index
		System.out.println("Enter Start Index");
		int start = scanner.nextInt();
		
		// Ask the user to enter the end index
		System.out.println("Enter End Index");
		int end= scanner.nextInt();
		
		//Method calling
		String firstSubString = generateSubString(string, start, end);
		String secondSubString = string.substring(start,end);
		boolean result=isEqual(firstSubString,secondSubString);
		
		//Display result
		System.out.println("The result of checking whether the two sub strings are equal by a method is : "+ result);
	
		// Close the scanner
		scanner.close();
	}
}
