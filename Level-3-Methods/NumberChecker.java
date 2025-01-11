// Import All class from util package
import java.util.*;
// Create NumberChecker Class to check the number on given conditions
public class NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int number) {
        if (number == 0) return false;
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) { // Ignore leading digit
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number using the digits array
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int number) {
        int[] digits = getDigitsArray(number);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int number) {
        int[] digits = getDigitsArray(number);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; // You can test with other numbers as well

        System.out.println("Count of digits: " + countDigits(number));

        System.out.println("Digits array: " + Arrays.toString(getDigitsArray(number)));

        System.out.println("Is Duck Number: " + isDuckNumber(number));

        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));

        int[] largestAndSecondLargest = findLargestAndSecondLargest(number);
        System.out.println("Largest: " + largestAndSecondLargest[0] + ", Second Largest: " + largestAndSecondLargest[1]);

        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(number);
        System.out.println("Smallest: " + smallestAndSecondSmallest[0] + ", Second Smallest: " + smallestAndSecondSmallest[1]);
    }
}
