// Import Scanner class from util package for user input
import java.util.Scanner;
// Create SubString Class to compute length of line
public class SubString {
	public static String generateSubString(String string, int start, int end){
		String temp="";
		for(int i=start;i<end;i++){
			temp+=string.charAt(i);
		}
		return temp;
	}
	
	
	
	public static boolean isEqual(String firstString,String secondString){
		if(firstString.length()!=secondString.length())return false;
		else{
			for(int i=0;i<firstString.length();i++){
				if(firstString.charAt(i)!=secondString.charAt(i))return false;
			}
		}
		return true;
	}
    
	
	
	public static void main(String args[]){	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter String");
		String string = scanner.nextLine();
		System.out.println("Enter Start Index");
		int start = scanner.nextInt();
		System.out.println("Enter End Index");
		int end= scanner.nextInt();
		
		String firstSubString = generateSubString(string, start, end);
		String secondSubString = string.substring(start,end);
		boolean result=isEqual(firstSubString,secondSubString);
		
		System.out.println("The result of checking whether the two sub strings are equal by a method is : "+ result);
	}
}