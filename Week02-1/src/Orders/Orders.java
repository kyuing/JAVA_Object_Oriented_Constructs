package Orders;

public abstract class Orders {
	
//2 attr for each fo maincourse, drink and dessert	
	protected String[] order =  null;
	
	protected abstract String askCustomer();
	
	@Override
	public String toString() {
		
		return "place holder";
	}
}
