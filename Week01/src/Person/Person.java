package Person;

public class Person {
	
	//private access attributes
	private String fname;
	private String lname;
	private String sex;
	private int age;
	
	
	/**
	 * 
	 * @param fname
	 * @param lname
	 * @param sex
	 * @param age
	 */
	public Person(String fname, String lname, String sex, int age) {
		
		this.fname = fname;
		this.lname = lname;
		this.sex = sex;
		this.age = age;
	}
	
	
	//introduce()
	public void introduce() {
		
		System.out.println("Name: " + this.fname + " " + this.lname);
	}
	
	//introduce()
	public void walk() {
			
		System.out.println(fname + " is walking");
	}
	
	

}
