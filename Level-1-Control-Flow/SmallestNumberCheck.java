// Import Scanner class from util package for user input
import java.util.Scanner;
// Create SmallestNumberCheck Class to get the smallest number
public class SmallestNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Check if the first number is smaller than the other two
        boolean isSmallest = (number1 < number2 && number1 < number3);

        // Display the result
        System.out.println("Is the first number the smallest? " + isSmallest);

        // Close the scanner
        scanner.close();
    }
}

