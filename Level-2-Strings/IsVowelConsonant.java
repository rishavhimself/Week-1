// Import Scanner class from util package for user input
import java.util.Scanner;
// Create IsVowelConsonat Class to check if the character is vowel or consonant
public class IsVowelConsonat {
	
    public static void main(String args[]){	
		
		 // Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		string=string.toLowerCase();
		
		//Displaying vowels and consonants
		int count_Consonats=0,count_Vowel=0;
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||
			string.charAt(i)=='o'||string.charAt(i)=='u') System.out.println(string.charAt(i)+" is Vowel");
			else if(string.charAt(i)>='a'&&string.charAt(i)<='z') System.out.println(string.charAt(i)+" is a Consonat");
			else System.out.println(string.charAt(i)+ " is not a letter");
		}
	
		
		// Close the scanner
		scanner.close();
	}
}