// Import Scanner class from util package for user input
import java.util.Scanner;
// Create HandshakesByMethods Class to find number of hand shakes
public class HandshakesByMethods {
	
	//Creating calculateHandshakes method to compute the total number of handshakes 
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
		
		// Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the number of students
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();
		
		// Calling calculateHandshakes method and displaying result
        System.out.println("The maximum number of handshakes is " + calculateHandshakes(students));
        
		// Close the scanner
		scanner.close();
    }
}