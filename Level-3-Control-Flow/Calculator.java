// Import Scanner class from util package for user input
import java.util.Scanner;
// Create Calculator Class to Implement a calculator using Switch case
public class Calculator {
    public static void main(String[] args) {
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Input:Ask the user to enter two number
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();
		
		// Ask the user to enter operation
        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();

        // Process: Perform operation based on the operator
        switch (operator) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
		// Close the scanner
        scanner.close();
    }
}
