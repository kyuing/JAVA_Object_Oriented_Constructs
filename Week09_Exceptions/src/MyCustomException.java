
public class MyCustomException extends Exception {

	int id;
	
	public MyCustomException(int x) {
 
//		super(x);
		id = x;
   
	}


	public String toString() {

		return "CustomException: CANNOT DIVIDE NUMBERS BY " + id ;   
	}

}
