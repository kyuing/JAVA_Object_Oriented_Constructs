package Restaurant;

public class Tables {
	
	//private access attributes
	private int tableNum;
	private String tableSize;
	private Customers bookedBy;
	private boolean isAvailable;
	
	
	/**
	 * a specified constructor
	 * @param tableNum
	 * @param tableSize
	 */
	public Tables(int tableNum, String tableSize) {
		
		this.tableNum = tableNum;
		this.tableSize = tableSize;
		this.bookedBy = null;
		this.isAvailable = true;
	}
	
	/**
	 * 
	 * @param <instance>customer</instance> of Customer
	 * @return method-level boolean status
	 */
	public boolean hasBeenBooked(Customers customer) {
		
		if(this.isAvailable) {
			
			this.isAvailable = false;
			this.bookedBy = customer;
			return true;
		 
		}else {
			
			return false;
		}
	}
	
	/**
	 * boolean variable getter
	 * @return boolean isAvailable
	 */
	public boolean hasAvailable() {
		
		return this.isAvailable;
	}
	
	
	/**
	 * the instance customer getter
	 * @return <instance>customer</instance> of Customer
	 */
	public Customers getBookedBy() {
		return this.bookedBy;
	}
	
	/**
	 * tableNum getter
	 * @return this.tableNum;
	 */
	public int getTableNum() {
		
		return this.tableNum;
	}
	
	/**
	 * tableSize getter
	 * @return this.tableSize;
	 */
	public String getTableSize() {
		
		return this.tableSize;
	}
	
	/**
	 * getter toString()
	 * 
	 * @return tables available to book. Otherwise, @return the table & customer info booked.
	 */
	@Override
	public String toString() {
		
		if(this.isAvailable) {
			return "Table No " + this.tableNum + " is available to book";	
		}
		return "Table No " + this.tableNum + "(size: " + this.tableSize +  ") is booked by " + this.bookedBy.getFname() + ", " + this.bookedBy.getContact();
		
	}
	
	

}
