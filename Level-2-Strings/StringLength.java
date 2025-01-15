// Import Scanner class from util package for user input
import java.util.Scanner;
// Create StringLength Class to find the length of string
public class StringLength {
	public static void main(String args[]){
		
		// Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter String");
		String string = scanner.nextLine();
		int count=0,i=0;
		char temp;
		try{
			while(true){
				temp=string.charAt(i);
				count++;
				i++;
			}
		}catch(Exception e){
			System.out.println("The Length of the string is :"+count);
		}
		
		// Close the scanner
		scanner.close();
	}
}