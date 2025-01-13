// Create StringIndexOutOfBoundsException Class to compute length of line
public class StringIndexOutOfBoundsException {
	
	// Method to create exception
	public static void isEqual(String string){
		for(int i=0;i<string.length()+1;i++){
			System.out.print(string.charAt(i)+" ");
		}
	}
    
	
	
	public static void main(String args[]){	
		String string="HELLO WORLD!";
		
		//Try Catch Block
		try{
			isEqual(string);
		}
		catch(Exception e){
			System.out.println("Exception Occured");
		}
	}
}