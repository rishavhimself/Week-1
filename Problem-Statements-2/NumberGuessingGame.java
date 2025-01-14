// Import util package
import java.util.*;
// Create NumberGuessingGame Class to play a number guessing game
public class NumberGuessingGame {
	
	public static void main(String args[]){
		
		 // Create a Scanner object for taking input
		Scanner scanner =new Scanner(System.in);
		String input="";
		Random random =new Random();
		int number = random.nextInt(100);//Generating Number
		int max,min;
		//number=random.nextInt(number);
		while(!input.equals("correct")){
			System.out.println("Your number is : "+number);			
			System.out.println();
			
			// Ask the user to enter the review
			System.out.println("Enter the review :(High, Low, Correct)");
			input = scanner.next();
			input=input.toLowerCase();
			System.out.println();
			if(input.equals("low")){
				min=0;max=number;
				number=random.nextInt(max-min+1)+min;
			} else{
				min=number;max=100;
				number=random.nextInt(max-min+1)+min;
			}
			
		}
		// Display result
		System.out.println("Guessed Your Number ! ");
	
		//Closing Scanner
		scanner.close();
	}
}