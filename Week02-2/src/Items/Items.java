package Items;

public abstract class Items {

	//protected attributes
	protected String name;
	protected int price;
	protected int menuId;
	
	//name getter
	public String getName() {
		return name;
	}
	
	//name setter
	public void setName(String name) {
		this.name = name;
	}
	
	//price getter
	public int getPrice() {
		return price;
	}
	
	//price setter
	public void setPrice(int price) {
		this.price = price;
	}
	
	//menuId getter
	public int getMenuId() {
		
		return this.menuId;
	}

	
	//Override toString() method.
	@Override
	public String toString() {
		return "return something";
	}
	
}
