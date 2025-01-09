// Import Scanner class from util package for user input
import java.util.Scanner; 
// Create a Class named as SimpleInterestCalculator to compute Simple Interest 
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the principal amount
        System.out.println("Enter the Principal amount:");
        double principal = scanner.nextDouble();

        // Ask the user to enter the rate of interest
        System.out.println("Enter the Rate of Interest (in %):");
        double rate = scanner.nextDouble();

        // Ask the user to enter the time period
        System.out.println("Enter the Time (in years):");
        double time = scanner.nextDouble();

        // Calculate the Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + ".");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
