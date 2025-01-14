// Import Scanner class from util package for user input
import java.util.Scanner;
// Create GCDAndLCMCalculator Class to compute  GCD And LCM
public class GCDAndLCMCalculator {
	
	// Creating findGCD method for the same
    public static int findGCD(int number1,int number2) {
		for(int i=Math.min(number1,number2);i>1;i--){
			if(number1%i==0&&number2%i==0)return i;
		}
        return 1;
    }
	
	// Creating findLCM method for the same
    public static int findLCM(int number1,int number2) {
		for(int i=Math.min(number1,number2);i<number1*number2;i++){
			if(number1%i==0&&number2%i==0)return i;
		}
        return number1*number2;
    }

    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the number1
        System.out.print("Enter the number1: ");
        int number1 = scanner.nextInt();
		
		// Ask the user to enter the number2
        System.out.print("Enter the number2: ");
        int number2 = scanner.nextInt();
		
		// Calling findGCD method
        int gcd = findGCD(number1,number2);

		// Calling findLCM method
		int lcm = findLCM(number1,number2);
		
		// Displaying result
		System.out.println("The GCD is : " + gcd+" and LCM is : "+lcm);
        
		// Close the scanner
		scanner.close();
    }
}