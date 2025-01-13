// Import Scanner class from util package for user input
import java.util.Scanner;
// Create ReplaceWord Class to replace words
public class ReplaceWord {
	
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		
		// Ask the user to enter the sentence
		System.out.println("Enter a Sentence");
		String sentence = scanner.nextLine();
		
		// Ask the user to enter the word to be replaced
		System.out.println("Enter word to be replaced");
		String oldWord = scanner.next();
		
		// Ask the user to enter the new word
		System.out.println("Enter new word");
		String newWord = scanner.next();
		
		//Replacing Word
		String newSentence= sentence.replace(oldWord,newWord);
		
		//Display Result
		System.out.print("New Sentence is : "+ newSentence);
		
		// Close the scanner
		scanner.close();
	}
}
