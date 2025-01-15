// Import util package 
import java.util.*;
// Create WordsLength Class to find the length of string
public class WordsLength {
		
		public static int lengthOfString(String string){
			Integer count=0;
			int i=0;
			char temp;
			try{
				while(true){
				temp=string.charAt(i);
				count++;
				i++;
				}
			}catch(Exception e){
				return count;
			}
		}
		
		public static String[] genarateWords(String string){
		int j=0;int count=0;
		for(int i=0;i<string.length();i++){ // counting number of words
			if(string.charAt(i)==' ')count++; 
		}
		String temp="";		
		String words[] = new String[count];
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)==(' ')){ // check if the word is completed
				words[j]=temp; // adding word in an array
				j++;
				temp="";
			}
			else {
				temp+=string.charAt(i); // adding all letters of a word
			}
		}
		return words;
	}
		
		public static void main(String args[]){
		// Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter String");
		String string = scanner.nextLine();
		
		// Getting length of String
		int length=lengthOfString(string);
		
		// Getting words from the string
		String [] words = genarateWords(string+" "); //Adding 1 space at the last to ensure we get the last word
		String [][]wordsWithLength=new String[2][words.length];
	
		// Filling 2D Array
		for(int i=0;i<words.length;i++){
			wordsWithLength[0][i]=words[i];
		}
		for(int i=0;i<words.length;i++){
			wordsWithLength[1][i]= Integer.toString(lengthOfString(wordsWithLength[0][i]));
		}
		
		//Display result
		for(int i=0;i<words.length;i++){
			System.out.println("The word "+wordsWithLength[0][i]+" has size "+wordsWithLength[1][i]);
		}
		
		// Close the scanner
		scanner.close();
	}
}