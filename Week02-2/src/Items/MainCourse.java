package Items;

public class MainCourse extends Items {
	
	public MainCourse(int menuId, String name, int price) {
		
		this.name = name;
		this.price = price;
		this.menuId = menuId;
		
	}

	
	//Override toString() method.
	@Override
	public String toString() {
		
		return this.menuId + " " + name + ", £" + price + "\n";
	}
}
