// Import Scanner class from util package for user input
import java.util.Scanner;
// Create CharacterFrequency Class to find Character Frequency
public class CharacterFrequency {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        StringBuilder uniqueCharacters = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the uniqueCharacters string
            for (int j = 0; j < uniqueCharacters.length(); j++) {
                if (uniqueCharacters.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueCharacters.append(currentChar);
            }
        }

        return uniqueCharacters.toString().toCharArray();
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters (ASCII values)

        // Loop through the text to count frequencies
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c]++;
        }

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueCharacters.length][2];

        for (int i = 0; i < uniqueCharacters.length; i++) {
            char uniqueChar = uniqueCharacters[i];
            result[i][0] = String.valueOf(uniqueChar); // Character
            result[i][1] = String.valueOf(frequency[uniqueChar]); // Frequency
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
