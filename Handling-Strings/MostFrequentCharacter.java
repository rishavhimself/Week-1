// Import Scanner class from util package for user input
import java.util.Scanner;
// Create MostFrequentCharacter Class to find most frequent character
public class MostFrequentCharacter {
	
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter a String");
		String string = scanner.nextLine();
		
		// Unform the string
		string.toLowerCase();
		int frequency[]=new int[26];
		
		//computing the frequency of each character
		for(int i=0;i<string.length();i++){
			frequency[(int)string.charAt(i)-'a']+=1;
		}
		int maxFrequency=Integer.MIN_VALUE;
		for(int i=0;i<frequency.length;i++){
			maxFrequency=Math.max(maxFrequency,frequency[i]);
		}
		
		//Display Result
		for(int i=0;i<frequency.length;i++){
			if(frequency[i]==maxFrequency){
				System.out.println("Most Frequent Character : "+ ((char)(i+'a')) );
			}
		}
		
		// Close the scanner
		scanner.close();
	}
}
