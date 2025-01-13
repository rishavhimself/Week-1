// Import Scanner class from util package for user input
import java.util.Scanner;
// Create SubstringOccurrences Class to count substring occurrence
public class SubstringOccurrences {
	
	
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter a String");
		String string = scanner.nextLine();
		
		// Ask the user to enter the subString
		System.out.println("Enter the Substring");
		String subString = scanner.nextLine();
		boolean flag = true;
		int count=0;
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)==subString.charAt(0)){
				for(int j=0;j<subString.length();j++){
					if(i+j>string.length()-1)break;
					if(string.charAt(i+j)!=subString.charAt(j)) {
						flag=false;
						break;
					}
				}
				if(flag)count++;
			}
			flag=true;
		}
		
		//Display Result
		System.out.print("The frequency of given substirng is : "+ count);
		
		// Close the scanner
		scanner.close();
	}
}