// Create  NullPointerException Class to compute length of line
public class  NullPointerException {
	
	// Method to create exception
	public static void generateException(String secondString){
		
	}
	
	public static void main(String args[]){	
		
		//Try catch block
		String secondString = null;
		try{
			generateException(secondString);
		}
		catch(Exception e){
		}
			System.out.println("Exception Occured");
	}
}