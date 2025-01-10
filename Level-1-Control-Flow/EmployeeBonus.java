// Import Scanner class from util package for user input
import java.util.Scanner;
// Create EmployeeBonus Class to compute bonus of an employee
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter salary and years of service
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            // Calculate the bonus (5% of salary)
            double bonus = salary * 0.05;
            System.out.println("Your bonus amount is: " + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
        }
		 // Close the scanner
        scanner.close();
    }
}
