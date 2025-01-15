// Import Scanner class from util package for user input
import java.util.Scanner;
// Create StringSplit Class to split a sentence manually
public class StringSplit {
	
	public static boolean isEqual(String[] firstWords,String []secondWords){
		if(firstWords.length!=secondWords.length)return false;
		else{
			for(int i=0;i<firstWords.length;i++){
				if(!firstWords[i].equals(secondWords[i])){
					return false;
				}
			}
		}
		return true;
	}
	public static String[] genarateString(String string){
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
		
		//Method Calling
		String firstWords[]=string.split(" ");
		String secondWords[]=genarateString(string+" ");
		boolean result=isEqual(firstWords,secondWords);
		
		//Display Result
		System.out.println("The result of checking whether the given strings are equal by a method is : "+ result);
		
		// Close the scanner
		scanner.close();
	}
}