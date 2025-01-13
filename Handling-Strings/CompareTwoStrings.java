// Import Scanner class from util package for user input
import java.util.Scanner;
// Create CompareTwoStrings Class to compare two strings
public class CompareTwoStrings {
	
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		
		// Ask the user to enter the first string
		System.out.println("Enter the first String");
		String stringA = scanner.nextLine();
		
		// Ask the user to enter the second string
		System.out.println("Enter the second String");
		String stringB = scanner.nextLine();
		if(stringB.length()>stringA.length()){
			String temp = new String(stringA);
			stringA=stringB;
			stringB=temp;
		}
		
		String stringFirst ="", stringSecond="";
		int j=0;
		for(int i=0;i<stringA.length();i++){
			if(stringA.charAt(i)!=stringB.charAt(j)){
				if((int)stringA.charAt(i)>(int)stringB.charAt(j)){
					stringFirst=stringA;
					stringSecond=stringB;
					break;
				}else{
					stringFirst=stringB;
					stringSecond=stringA;
					break;
				}
			}
			if(j<stringB.length()-1)j++;
			else{
				stringFirst=stringB;
				stringSecond=stringA;
				break;
			}
		}
		
		//Display Result
		System.out.println(stringFirst+" comes before "+ stringSecond+" in lexicographical order");
	
		// Close the scanner
		scanner.close();
	}
}