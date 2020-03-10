package Person_access_modifiers;

public class Main {
	
	
	public Main() {
		
		Person kyu = new Person("Kyu", "Han", "M", 19); //create an instance of the object Person
		Person just = new Person("justin", "case", "F", 20);//create an instance of the object Person
		
		kyu.introduce();
		System.out.println("Sex: " + kyu.getSex() + "\nAge: " + kyu.getAge());
		kyu.walk();

		System.out.println();
		just.introduce();
		System.out.println("Sex: " + just.getSex() + "\nAge: " + just.getAge());
		
		System.out.println();
		just.introduce();
		System.out.println("Sex: " + just.getSex() + "\nAge: " + just.getAge());
		
		System.out.println();
		just.introduce();
		just.setAge(77); //change just's age by using setter()
		System.out.println("Sex: " + just.getSex() + "\nAge: " + just.getAge());
		
		
	}
	
	public static void main(String[] args) {
		
		new Main();
	}

}
