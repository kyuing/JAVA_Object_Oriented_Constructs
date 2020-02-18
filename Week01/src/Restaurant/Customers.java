package Restaurant;

public class Customers {
	
	private String fname;
	private String contact;
	
	/**
	 * a specified constructor
	 * @param fname
	 * @param contact
	 */
	public Customers(String fname, String contact) {
		
		this.fname = fname;
		this.contact = contact;
	}
	
	//fname getter
	public String getFname() {
		
		return this.fname;
	}
	
	//contact getter
	public String getContact() {
		
		return this.contact;
	}
	

}
