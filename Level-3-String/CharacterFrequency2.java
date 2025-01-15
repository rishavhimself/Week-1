// Import Scanner class from util package for user input
import java.util.Scanner;
// Create CharacterFrequency2 Class find Frequency of Characters
public class CharacterFrequency2 {

    // Method to find the frequency of characters in a string using nested loops
    public static String[][] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); // Convert the string to a character array
        int[] frequency = new int[characters.length]; // Array to store the frequency of each character

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') { // Skip already counted characters
                frequency[i] = 1; // Initialize frequency to 1

                // Inner loop to check for duplicates
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        characters[j] = '0'; // Mark duplicate characters as '0'
                    }
                }
            }
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (char c : characters) {
            if (c != '0') {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index][0] = String.valueOf(characters[i]); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }

        return result;
    }

    // Method to display the character frequency table
    public static void displayCharacterFrequency(String[][] frequencies) {
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println("---------------------");

        for (String[] row : frequencies) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }
    }

    // Main method to take user input and display character frequencies
    public static void main(String[] args) {
        
		// Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the character frequencies
        String[][] frequencies = findCharacterFrequency(text);

        // Display the results
        displayCharacterFrequency(frequencies);

		// Close the scanner
        scanner.close();
    }
}
