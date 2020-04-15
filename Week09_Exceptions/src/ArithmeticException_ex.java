
public class ArithmeticException_ex {

	public ArithmeticException_ex() {

		try {
			
			devide(7, 0);
			
		} catch (ArithmeticException ae) {
			
			System.out.println(ae.getMessage());
		}
	}

	/*
	 * 1 the method below is entirely surrounded with try block and throws ArithmeticException exceptions
	 * 2 On detecting any arithmetic exception inside the method, 
	 * 3 the method creates(throws) a new ArithmeticException with some action as parameter attached
	 * 4 the ArithmeticException created(thrown) is passed into catch block above
	 * 5 Inside the catch block, the reference of the ArithmeticException created(thrown) does predefined action.  
	 * 
	 */
	  
	public double devide(int a, int b) throws ArithmeticException {
		
		if (b == 0) { 
			throw new ArithmeticException("Can¡¯t divide by zero"); 
		}
		return (double) a / b;
	}
	
}
