// Import Scanner class from util package for user input
import java.util.Scanner;
// Create CharactersInString Class to create array of characters
public class CharactersInString{
	// Method to check if both char arrays are equal
	public static boolean isEqual(char [] firstArray,char [] secondArray){
		if(firstArray.length!=secondArray.length)return false;
		else{
			for(int i=0;i<firstArray.length;i++){
				if(firstArray[i]!=secondArray[i])return false;
			}
		}
		return true;
	}
    // Method to generate CharArray
	public static char[] generateCharArray(String string){
		char [] temp= new char[string.length()];
		for(int i=0;i<string.length();i++){
			temp[i]=string.charAt(i);
		}
		return temp;
	}
	
	public static void main(String args[]){	
		
		 // Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter The String");
		String string = scanner.nextLine();
		
		//Method calling
		char[] firstArray=string.toCharArray();
		char[] secondArray=generateCharArray(string);
		boolean result=isEqual(firstArray,secondArray);
		
		//Display result
		System.out.println("The result of checking whether the given strings are equal by a method is : "+ result);
	
		// Close the scanner
		scanner.close();
	}
}