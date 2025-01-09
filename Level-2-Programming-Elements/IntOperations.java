// Import Scanner class from Util package for taking input from user
import java.util.Scanner; 
// Create a Class named as IntOperartions for getting desired results
public class IntOperations {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the values for a, b, and c
        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();

        System.out.println("Enter the value of c:");
        int c = scanner.nextInt();

        // Perform the integer operations
        int result1 = a + b * c; // Multiplication has higher precedence than addition
        int result2 = a * b + c; // Multiplication has higher precedence than addition
        int result3 = c + a / b; // Division has higher precedence than addition
        int result4 = a % b + c; // Modulus has higher precedence than addition

        // Display the results
        System.out.println("The results of Int Operations are " + result1+","+result2+","+result3+" and "+result4);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
