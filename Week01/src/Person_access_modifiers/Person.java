package Person_access_modifiers;

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
			
		System.out.println(getFname() + " is walking");
	}
	
	
	//-----------------------only see the values of the attributes-------------------
	
	//a getter for first name
	public String getFname() {
		
		return this.fname;
	}
	
	
	//a getter for last name
	public String getLname() {
			
		return this.lname;
	}
	

	//a getter for sex
	public String getSex() {
		
		return this.sex;
	}
	
	//a getter for age
	public int getAge() {
		
		return this.age;
	}
	
	//a setter for age
	public void setAge(int age) {
		
		this.age = age;
	}


}
