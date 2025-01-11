// Import Scanner class from util package for user input
import java.util.Scanner;
// Create SimpleInterest Class to compute Simple Interest on given principal
public class SimpleInterest {
	
	// Creating calculateSimpleInterest method to compute Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
	
		// Ask the user to enter the Principal	
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
		
		// Ask the user to enter the Rate
        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();
		
		// Ask the user to enter the Time
        System.out.print("Enter Time: ");
        double time = scanner.nextDouble();
		
		// Calling calculateSimpleInterest method and displaying result
        System.out.println("The Simple Interest is " + calculateSimpleInterest(principal, rate, time));
        
		// Close the scanner
		scanner.close();
    }
}