package Person;

public class Main {
	
	
	public Main() {
		
		Person kyu = new Person("Kyu", "Han", "M", 19); //create an instance of the object Person
		Person just = new Person("justin", "case", "F", 20);//create an instance of the object Person
		
		kyu.introduce();
		kyu.walk();

		System.out.println();
		just.introduce();
		
		
	}
	
	public static void main(String[] args) {
		//invoke constructor
		new Main();
	}

}
