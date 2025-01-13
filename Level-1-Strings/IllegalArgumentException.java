// Create  IllegalArgumentException Class to compute length of line
public class  IllegalArgumentException {
	
	
	public static void main(String args[]){	

		//Try Catch Block
		String string="Hello World!";
		try{
			String subString= string.substring(3,0);
		}
		catch(Exception e){
		}
			System.out.println("Exception Occured");
	}
}