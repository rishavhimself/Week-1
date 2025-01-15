// Import util package 
import java.util.*;
// Create ShortestAndLongest Class to find Shortest and Longest words
public class ShortestAndLongest{
		
		public static int lengthOfString(String string){
			Integer count=0;
			int i=0;
			char temp;
			try{
				while(true){
				temp=string.charAt(i);
				count++;
				i++;
				}
			}catch(Exception e){
				return count;
			}
		}
		
		public static String[] genarateWords(String string){
		int j=0;int count=0;
		for(int i=0;i<string.length();i++){ // counting number of words
			if(string.charAt(i)==' ')count++; 
		}
		String temp="";		
		String words[] = new String[count];
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)==(' ')){ // check if the word is completed
				words[j]=temp; // adding word in an array
				j++;
				temp="";
			}
			else {
				temp+=string.charAt(i); // adding all letters of a word
			}
		}
		return words;
		}
		
		public static String [] findShortestAndLongestWords(String [][] wordsWithLength, int length){
			String shortestAndLongestWords[]=new String [2];
			Integer min = Integer.MAX_VALUE;
			Integer max= Integer.MIN_VALUE;
			for(int i=0;i<length;i++){
				Integer tempNumber=Integer.parseInt(wordsWithLength[1][i]);
				if(tempNumber<min){
					min=tempNumber;
					shortestAndLongestWords[0]=wordsWithLength[0][i];
					
				}
				if(tempNumber>max){
					max=tempNumber;
					shortestAndLongestWords[1]=wordsWithLength[0][i];
				}
			}
			return shortestAndLongestWords;
		}
		
		public static void main(String args[]){
		// Create a Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter the string
		System.out.println("Enter String");
		String string = scanner.nextLine();
		
		//Calculating length of string
		int length=lengthOfString(string);
		
		// generate words from string
		String [] words = genarateWords(string+" ");
		String [][]wordsWithLength=new String[2][words.length];
	
		// Filling 2D Array
		for(int i=0;i<words.length;i++){
			wordsWithLength[0][i]=words[i];
		}
		for(int i=0;i<words.length;i++){
			wordsWithLength[1][i]= Integer.toString(lengthOfString(wordsWithLength[0][i]));
		}
		
		// shortestAndLongestWords method call
		String[] shortestAndLongestWords= findShortestAndLongestWords(wordsWithLength,words.length);
		
		
		//Display result
		System.out.println("The Shortest Word is :"+shortestAndLongestWords[0]);
		System.out.println("The Longest Word is :"+shortestAndLongestWords[1]);
	
		// Close the scanner
		scanner.close();
	}
}