// Import Scanner class from util package for user input
import java.util.Scanner;
// Create FibonacciSequence Class to display Fibonacci Sequence
public class FibonacciSequence {
	
	public static void main(String args[]){
		
			// Create a Scanner object for taking input
			Scanner scanner =new Scanner(System.in);
		
			// Ask the user to enter the number of elements
			System.out.println("Enter number of elements");
			int number = scanner.nextInt();
		
		
			if(number==0)System.out.println("Invaild Input");
			else if(number==1)System.out.println(1);
			else if(number==2)System.out.println(1+" "+1);
			else{
			int firstNumber=1,secondNumber=1,i=3,temp;
			System.out.print(1+" "+1+" ");
			while(i<=number){
				temp=firstNumber+secondNumber;
				System.out.print(temp+" "); //Printing new elements
				firstNumber=secondNumber; //Updating prevoius elements	
				secondNumber=temp;
				i++;
			}
			// Close the scanner
			scanner.close();
			}
	}
	
}