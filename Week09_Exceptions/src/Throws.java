import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Throws {

	private List<Integer> list;
	private static final int SIZE = 10;
	private PrintWriter out;
	
	public Throws() {
		list = new ArrayList<>();
		
		
		for(int i = 0; i < SIZE; i++) {
			list.add(new Integer(i));
		}
	
		//the method invoked is entirely surrounded with try block and throws exceptions
		try {
			
			writer04();
			
		} catch (IOException | IndexOutOfBoundsException e) {
			//e is not passing any particular custom message 
			//since no new IndexOutOfBoundsException is created inside the method.  
			System.out.println("Some exception thrown");
			
		}finally {
			out.close(); //save output whatsoever happens before.
		}

	}
	
	/**
	 * @throws IOException
	 * @throws IndexOutOfBoundsException
	 */
	public void writer04() throws IOException, IndexOutOfBoundsException {
		
		out = null;
		out = new PrintWriter(new FileWriter("OutFile.txt"));
 
		/* # for loop works fine with no exception issue when the conditional number for the loop to run is equal to the size of the list,
		 *   which determines what number i consequently gets to at the end, 
		 *   but also means that i's behavior is dependent fully on the condition statement in the code block
		 *  
		 *   for(int i = 0; i < conditional number; i++)         
		 *         
		 * - if the conditional number is smaller than the size of the list which is 10,  
		 *   - the program run with no being crashed and no any exception thrown.  
		 *   - The PrinterWriter instance 'out' writes to a file within the possible indexes defined
		 *   - because i which determines list's index at the end of the loop will never be Out Of Index.
		 * 
		 * - if the conditional number is greater than the size of the list which is 10,
		 *   - IndexOutOfBoundsException is thrown
		 *   - The PrinterWriter instance 'out' STILL writes to a file within the possible indexes defined. 
		 */
		for(int i = 0; i < 12; i++) {
			
			out.println("Value at: " + i + " = " + list.get(i));
		}
		
		//if closing PR instance here, writing to a file is failed and IndexOutOfBoundsException is thrown only
		//out.close();
		
	}	
}
