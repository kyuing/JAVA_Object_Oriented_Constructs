
public class ArithmeticExceptionWithCustomException extends MyCustomException{

	
	public ArithmeticExceptionWithCustomException(int x) {

		super(x);

		try {
			
			devide(7, x);
		} catch (MyCustomException e) {

			System.out.println(e.toString());
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
	  
	public double devide(int a, int b) throws MyCustomException {
		
		if (b == 0) { 
//			throw new ArithmeticException("Can¡¯t divide by zero"); 
			throw new MyCustomException(b);
		}
		return (double) a / b;
	}
	
}
