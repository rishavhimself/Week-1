// Import Scanner class from util package for user input
import java.util.Scanner;

class calculator {


		public static void add(int a, int b){  
			System.out.println(a+b);
		}

		public static void sub(int a, int b){
			System.out.println(b-a);
		}

		public static void multiply(int a, int b){
			System.out.println(a*b);
		}

		public static void divide(int a, int b){
			System.out.println(b/a);
		}
		public static void main(String[] args) {
	   
			// Create a Scanner object for taking input
			Scanner scanner=new Scanner(System.in);
	   
			// Ask the user to enter the numbers
			System.out.println("Enter the numbers ");
			int number1=scanner.nextInt();
			int number2=scanner.nextInt();
	   
			// Ask the user to enter the  operator
			char operator=scanner.next().charAt(0);
			if(operator=='+')add(number1,number2);
			else if(operator=='-')sub(number1,number2);
			else if(operator=='*')multiply(number1,number2);
			else if(operator=='/')divide(number1,number2);
	   
			//Closing Scanner 
			scanner.close();
   }
}
