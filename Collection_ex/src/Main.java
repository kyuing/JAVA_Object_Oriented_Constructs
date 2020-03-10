import java.util.List;
import java.util.Map;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
			
	}
	
	public Main() {
//		sets();
//		lists();
//		deque();
		maps();
	}
	
	// Maps are sets of key-value pairs
	public void maps() {
		
		Map<String, Person> myMap = new HashMap<String, Person>();
		
		myMap.put("Amilcar", new Person("Amilcar"));
		myMap.put("Amilcar", new Person("Valentina"));
		myMap.put("Jonathan", new Person("Jonathan"));
		myMap.put("Mario", new Person("Mario"));
		
		myMap.remove("Mario");
		
		Person test = new Person("Jean");
		myMap.put("Jean", test);
		myMap.put("Grey", test);
		
		
		System.out.println(myMap);
	}
	
	// Deques are double ended queues. 
	// The order is important and we only
	// have access to the first and last element 
	// of the queue
	public void deque() {
	
		Deque<Person> myDeque = new ArrayDeque<Person>();
		
		myDeque.add(new Person("Amilcar"));
		myDeque.add(new Person("Greg"));
		myDeque.add(new Person("Graham"));
		myDeque.add(new Person("Kathleen"));
		myDeque.remove();
		myDeque.addFirst(new Person("Lais"));
		
		System.out.println(myDeque);
	}
	
	// The order is very important in the list
	// but there is no gaps in the structure
	public void lists() {
		List<Person> myListofPeople = new ArrayList<Person>();
		
		System.out.println(myListofPeople.add(new Person("Amilcar")));
		System.out.println(myListofPeople.add(new Person("Greg")));
		System.out.println(myListofPeople.add(new Person("Graham")));
		System.out.println(myListofPeople.add(new Person("John")));
		
		Person p = new Person("Kathleen");
		myListofPeople.add(p);
		myListofPeople.add(p);
				
		System.out.println(myListofPeople);
		myListofPeople.remove(2);
		System.out.println(myListofPeople.get(2));
		
		myListofPeople.size();
		
	}
	
	// The order is irrelevant for sets, however,
	// it is very important that there is no duplicate
	// entries.
	public void sets() {
	Set<String> mySet = new HashSet<String>();
		
		System.out.println(mySet.add("Amilcar"));
		System.out.println(mySet.add("Valentina"));
		System.out.println(mySet.add("Mario"));
		System.out.println(mySet.add("Priscila"));
		System.out.println(mySet.add("Amilcar"));
		System.out.println(mySet.add("Valentina"));
		System.out.println(mySet.add("Mario"));
		System.out.println(mySet.add("Priscila"));
		
		System.out.println(mySet);
		
		Set<Person> myPeople = new HashSet<Person>();
		
		System.out.println(myPeople.add(new Person("Amilcar")));
		System.out.println(myPeople.add(new Person("Amilcar")));
		System.out.println(myPeople.add(new Person("Valentina")));
		System.out.println(myPeople.add(new Person("Valentina")));
		
		Person test = new Person("Jeronimo");
		System.out.println(myPeople.add(test));
		System.out.println(myPeople.add(test));
		
		System.out.println(myPeople);
	}

}
