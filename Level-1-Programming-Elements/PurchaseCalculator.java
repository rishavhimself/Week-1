// importing Scanner class from util package to take input from user 
import java.util.Scanner;
// creating class named PurchaseCalcualtor for calculationg the total cost
public class PurchaseCalculator {
    public static void main(String[] args) {
        // creating input object for taking input 
        Scanner scanner = new Scanner(System.in);

        // Prompt User for input of Price of one unit
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scanner.nextDouble();
		// Prompt User for input of quantity
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        // Calculation of total price
        double totalPrice = unitPrice * quantity;

        // Output the result
        System.out.println("The total purchase price is: INR "+ totalPrice+" if the quantity is"+ quantity+" and unit price is: INR"+unitPrice);


        // Close scanner
        scanner.close();
    }
}
