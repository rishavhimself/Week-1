// Import Scanner class from Util package for taking input from user
import java.util.Scanner;
// Create a Class named as IncomeCalculator for computing total income
public class IncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the salary
        System.out.println("Enter the salary in INR:");
        double salary = scanner.nextDouble();

        // Ask the user to enter the bonus
        System.out.println("Enter the bonus in INR:");
        double bonus = scanner.nextDouble();

        // Calculate the total income
        double totalIncome = salary + bonus;

        // Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome + ".");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}