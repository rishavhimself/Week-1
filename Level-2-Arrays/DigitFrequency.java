import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // Array to store frequency of digits (0-9)
        int[] frequency = new int[10];

        // Extract digits and calculate frequency
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Display frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
