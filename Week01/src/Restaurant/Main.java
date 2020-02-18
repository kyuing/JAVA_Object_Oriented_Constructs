package Restaurant;

/**
 * 
 * @author Q
 *
 */
public class Main {
	
	public Main() {
	
		//instances of Customers
		Customers c01 = new Customers("John", "0831231234");
		Customers c02 = new Customers("Tom", "0831235678");
		Customers c03 = new Customers("Kim", "0833334444");
		Customers c04 = new Customers("Greg", "0835556666");
		Customers c05 = new Customers("Michael", "0835558888");
		
		Tables[] tables = new Tables[10]; //init ten 1D array instance of Tables 
		for(int i=0; i<10; i++) {
			//init tables
			if(i<3) {
			    //table number, small size
				tables[i] = new Tables(i+1, "S");
			}else if(i<8) {
				//table number, medium size
				tables[i] = new Tables(i+1, "M");
			}else {
				//table number, Large size
				tables[i] = new Tables(i+1, "L");
			}	
		}
		
		//print the tables initialized
		for(int i=0; i<10; i++) {

			System.out.println(tables[i]);

		}

		System.out.println();
		tables[0].hasBeenBooked(c01); //c01 books table 1 
		tables[6].hasBeenBooked(c02); //c01 books table 7
		tables[9].hasBeenBooked(c05); //c01 books table 10
		
		//now, print the latest changes(state)) of the tables
		for(int i=0; i<10; i++) {
			System.out.println(tables[i]);

		}
		
		
	}
	
	public static void main(String[]  args) {
		//invoke constructor
		new Main();
	}

}
