// Create ArrayIndexOutOfBoundsException Class to compute length of line
public class ArrayIndexOutOfBoundsException {
	// isEqual method to throw exception
	public static void isEqual(int [] array){
		for(int i=0;i<array.length+1;i++){
			System.out.println(array[i]);
		}
	}
    
	
	
	public static void main(String args[]){	
		int [] array={1,2,3,4,5,6};
		
		// Try Catch Block
		try{
			isEqual(array);
		}
		catch(Exception e){
			System.out.println("Exception Occured");
		}
	}
}