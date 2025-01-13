// Import Scanner class from util package for user input
import java.util.Scanner;
// Create LongestWordInSentence Class to find longest word
public class LongestWordInSentence {
	
	public static void main(String args[]){
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		
		// Ask the user to enter the sentence
		System.out.println("Enter a Sentence");
		String string = scanner.nextLine();
		
		//Array of words
		String words[] = string.split(" ");
		String maxString="";
		int count , maxCount=Integer.MIN_VALUE;
		for(int i=0;i<words.length;i++){
			String subString = words[i];
			count=subString.length();
			maxCount=Math.max(maxCount,count);
			if(count==maxCount)maxString=subString;
		}
		
		//Display Result
		System.out.println("The longest word is : "+ maxString);
		
		// Close the scanner
		scanner.close();
	}
}