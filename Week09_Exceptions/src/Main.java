/* for-loop consists of statement 1,2 and 3. 
 * 
 * for (statement 1; statement 2; statement 3) {
 *     // code block to be executed
 * }
 * 
 * Statement 1 
 * - is executed (one time) before the execution of the code block.
 * - sets a variable before the loop starts (int i = 0).
 * 
 * Statement 2 
 * - defines the condition for executing the code block.
 * -  defines the condition for the loop to run
 * 
 * Statement 3 
 * - is executed (every time) after the code block has been executed.
 * - increases a value (i++) each time the code block in the loop has been executed
 * 
 * https://www.w3schools.com/java/java_for_loop.asp
 */
public class Main {

	public static void main(String[] args) throws MyCustomException {

//		new Fixable_Exception(); // is best practice

//		new TryCatch();	//handles a piece of code that can throw an exception
		
		/* handles a piece of code that can throw an exception but
		 * execute something that is in finally block whatever happens before 
		 */
//		new TryCatchFinally();
		
//		new Throws(); //method-level exception thrown
		
		/* method-level ArithmeticException thrown
		 * throw a new ArithmeticException(an action)
		 */ 
//		new ArithmeticException_ex(); 
		

		/** <class>ArithmeticExceptionWithCustomException</class> extends 
		 * <class>MyCustomException</class> that extends <class>Exception</class>
		 * 
		 * <method>devide(int, int)</method> invoked at the constructor of <class>ArithmeticExceptionWithCustomException</class>
		 * is surrounded with try block. 
		 * the following catch block catches MyCustomException; the instance of MyCustomException
		 * the action predefined at <class>MyCustomException</class> is completed by the instance(reference) of <class>MyCustomException</class>    
		 * 
		 * <method>devide(int, int)</method> in <class>ArithmeticExceptionWithCustomException</class>
		 * throws MyCustomException.
		 * 
		 * Inside the method, throw a new MyCustomException(an action) -the action in this case is a number as a parameter- 
		 * if an exception to be checked is found
		 * 
		 * 
		 * 
		 */
		new ArithmeticExceptionWithCustomException(0);

	}

}

