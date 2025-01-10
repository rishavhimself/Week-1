// Import Scanner class from util package for user input
import java.util*;
// Create EmployeeBonus Class to compute bonus of employees
public class EmployeeBonus {
    public static void main(String[] args) {
		 // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		// Creating Require Aarrys
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
			// Ask the user to enter salary
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = scanner.nextDouble();
            while (salary[i] <= 0) {
                System.out.print("Invalid salary. Please enter a positive number: ");
                salary[i] = scanner.nextDouble();
            }
			// Ask the user to enter years
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = scanner.nextDouble();
            while (yearsOfService[i] < 0) {
                System.out.print("Invalid years of service. Please enter a valid number: ");
                yearsOfService[i] = scanner.nextDouble();
            }

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
