// importing Scanner class from util package to take input from user 
import java.util.Scanner;
// creating class named BasicCalculator for implementing a Calculator
public class BasicCalculator {
    public static void main(String[] args) {
		// creating input object for taking input 
        Scanner input = new Scanner(System.in);

        // Prompt User for input of two numbers
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : 0; // Avoid division by zero

        // Display the results
        System.out.println("The addition, subtraction, multiplication, and division values of the numbers " 
                + number1 + " and " + number2 + " are:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + (number2 != 0 ? division : "undefined (division by zero)"));
    }
}
