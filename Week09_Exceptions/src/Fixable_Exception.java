
public class Fixable_Exception {

	/*
	 * Exception types in approach. 
	 * 
	 * # Checked exception 
	 * These are conditions that can cause a program to fail in certain circumstances that we can foresee and
	 * should do everything to deal with & recover from (egnon-existent file).
	 * 
	 * # Runtime exception These are internal to the program, again, however we
	 * cannot predict these. Usually they are due to a bug in the code that gets
	 * past the compiler. We don¡¯t wrap these in a try-catch, instead, fix the bug!
	 * 
	 */
	public Fixable_Exception() {

		String[] name = { "Amilcar", "Lizy", "Kathleen", "Graham" }; //.length == 4

		/*
		 * the code commented out below will throw ArrayIndexOutOfBoundsException and the program crashes and
		 * will print out possible values within possible indexes
		 */

//		for(int i = 0; i < 123 ; i++) { 
//			System.out.println(name[i]); 
//		} 

		/* we could use exception handling solution. 
		 * but this is what programmer can detect in advance.
		 * 
		 */
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

	}
}
