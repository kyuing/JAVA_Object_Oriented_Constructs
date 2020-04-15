import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TryCatch {

	private List<Integer> list;
	private static final int SIZE = 10;
	
	public TryCatch() {
		
		list = new ArrayList<>();
		
		for(int i = 0; i < SIZE; i++) {
			list.add(new Integer(i));
		}
		
		//choose one and comment out the other
		writer01();
//		writer02();
	}
	
	/**
	 * public void writer01(){}
	 * Technically, a particular part is surrounded with a try block.
	 * The following catch block catches and throw IOExceptions where the try block is surrounding.
	 * More details are inside the method
	 */
	public void writer01() {
		
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter("OutFile.txt"));

		} catch (IOException e) {
			System.out.println("Oops Something went wrong");
		} 
		
		/* # for loop works fine with no exception issue when the conditional number for the loop to run is equal to the size of the list,
		 *   which determines what number i consequently gets to at the end, 
		 *   but also means that i's behavior is dependent fully on the condition statement in the code block
		 *  
		 *   for(int i = 0; i < conditional number; i++)
		 *  
		 * # the rest of points to think of within this method;
		 *   1 the for-loop to write to a file with the PrintWrtier instance 'out' is outside of this try block. 
		 *   2 the instance of PrintWriter is not closed.         
		 *         
		 * # result 
		 *   - if the conditional number in the loop is smaller than the size of the list which is 10,  
		 *     - the program run with no being crashed and no any exception thrown.
		 *       since i which determines list's index at the end of the loop will never be Out Of Index.
		 *     - The PrinterWriter instance 'out' writes nothing to a file
		 *       since the PrintWriter instance 'out' is not closed  
		 *       
		 *   - if the conditional number is greater than the size of the list which is 10,
		 *     - IndexOutOfBoundsException is thrown and the program crashes
		 *       since the for-loop is out of try block that throw IOException only.
		 *     - The PrinterWriter instance 'out' writes nothing to a file
		 *       since the PrintWriter instance 'out' is not closed
		 *       (this actually doens't happen as the program crashes before) 
		 */
		for(int i = 0; i < 11; i++) {
			out.println("Value at: " + i + " = " + list.get(i)); 
		}
	}
	
	/**
	 * public void writer02(){}
	 * Literally, a particular part is surrounded with a try block.
	 * The following catch block catches and throw exceptions where the try block is surrounding.
	 * 
	 * Some changes applied are such as;
	 *  - using multiple appropriate exception types rather than using IOException
	 *  - putting the for-loop and code to close PrinterWriter into try block 
	 * 
	 * More details are inside the method
	 */ 
	public void writer02() {
		
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter("OutFile.txt"));
			
			/* # for loop works fine with no exception issue when the conditional number for the loop to run is equal to the size of the list,
			 *   which determines what number i consequently gets to at the end, 
			 *   but also means that i's behavior is dependent fully on the condition statement in the code block
			 *  
			 *   for(int i = 0; i < conditional number; i++)
			 *  
			 * # the rest of points to think of within this method;
			 *   1 the for-loop to write to a file with the PrintWrtier instance 'out' is inside this try block. 
			 *   2 the instance of PrintWriter is closed.         
			 *         
			 * # result 
			 *   - if the conditional number in the loop is smaller than the size of the list which is 10,  
			 *     - the program run with no being crashed and no any exception thrown.
			 *       since i which determines list's index at the end of the loop will never be Out Of Index.
			 *     - The PrinterWriter instance 'out' writes to a file within the possible indexes defined
			 *       since the PrintWriter instance 'out' is closed  
			 *       
			 *   - if the conditional number is greater than the size of the list which is 10,
			 *     - IndexOutOfBoundsException is thrown and the program does not crash
			 *       since the for-loop is inside try block that throw IOException and IndexOutOfBoundsException, Exception by the catch block each.
			 *       
			 *     - The PrinterWriter instance 'out' writes nothing to a file
			 *       - Because the for-loop and the code to close the PrintWriter instance 'out' are inside the try block
			 *       - so pointer moves out to the following catch blocks in order.
			 *       - IndexOutOfBoundsException is then thrown and the program finishes its execution at this point. 
			 *       - even though the PrintWriter instance 'out' is closed 
			 */
			for(int i = 0; i < 11; i++) {
				out.println("Value at: " + i + " = " + list.get(i)); 
			}		
			
			out.close(); //save output

		//these catch blocks can go all together to be 
		/*
		}catch (IOException | IndexOutOfBoundsException | Exception e ) {
			System.out.println("Some exceptions thrown");
		}*/
		
		} catch (IOException ioe) {
			System.out.println("IOException thrown");
		} catch (IndexOutOfBoundsException ioobe) {
			System.out.println("IndexOutOfBoundsException thrown");
		} catch (Exception e) {
			System.out.println("Exception thrown");
		}
	}
}
