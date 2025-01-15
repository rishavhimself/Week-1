// Import util package
import java.util.*;
// Create FirstCharacter Class to find the first non repaeting character 
public class FirstCharacter {
	
	public static boolean checkUnique(char [] newString, char character){
		boolean result;
		for(int i=0;i<newString.length;i++){
			if(newString[i]==character)return true;
		}
		
		return false;
	}
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter a String");
		String string = scanner.nextLine();
		string = string.toLowerCase();
		
		char [] oldString = string.toCharArray();
		char [] newString=new char [oldString.length];
		int j=0;
		Arrays.sort(oldString);
		for(int i=0;i<oldString.length-1;i++){
			if(oldString[i]!=oldString[i+1]){
				newString[j]=oldString[i];
				j++;
			}
		}
		
		char toCheckValue;
		boolean test;
		for(int i=0;i<string.length();i++){
			toCheckValue=string.charAt(i);
			test= checkUnique(newString,toCheckValue);
			if(test){
				System.out.println(string.charAt(i));
				break;
			}
		}
		
		// Close the scanner
		scanner.close();
	}
}