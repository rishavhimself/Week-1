// Import Scanner class from util package for user input
import java.util.Scanner;
// Create CountVowelsNConsonats Class to compute number of vowels and consonants
public class CountVowelsNConsonats {
	
    public static void main(String args[]){	
		
		 // Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		
		//Counting vowels and consonants
		int count_Consonats=0,count_Vowel=0;
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u') count_Vowel++;
			else count_Consonats++;
		}
		
		//Display Result
		System.out.println("Number of Vowels in given string is :"+count_Vowel+" \nNumber of Consonats ingiven string is : "+count_Consonats);
		
		// Close the scanner
		scanner.close();
	}
}