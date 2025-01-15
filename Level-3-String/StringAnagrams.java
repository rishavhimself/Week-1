// Import Scanner class from util package for user input
import java.util.*;
// Create StringAnagrams Class to check word anagrams
public class StringAnagrams {
	
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		
		// Ask the user to enter the first string
		System.out.println("Enter First String");
		String stringFirst = scanner.nextLine();
		
		// Ask the user to enter the second string
		System.out.println("Enter Second String");
		String stringSecond = scanner.nextLine();
		
		char firstArray[]=stringFirst.toCharArray();
		char secondArray[]=stringSecond.toCharArray();
		Arrays.sort(firstArray); Arrays.sort(secondArray);
		boolean flag=true;
		if(firstArray.length!=secondArray.length)flag=false;
		else{
			for(int i=0;i<firstArray.length;i++){
				if(firstArray[i]!=secondArray[i]){
					flag=false;
					break;
				}
			}
		}
		
		//Display Result
		if(flag)System.out.println("Given Strings are Anagrams");
		else System.out.println("Given Strings are not Anagrams");
		
		// Close the scanner
		scanner.close();
	}
}