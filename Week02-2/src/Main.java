import java.util.ArrayList;
import java.util.Scanner;

import Items.Dessert;
import Items.Drink;
import Items.Items;
import Items.MainCourse;

/**
 * a simple example on how to abstract out.
 * 
 * @author Q
 *
 */
public class Main {

	ArrayList<Items> order = new ArrayList<Items>();
//	Items[] order;
	Items[] mainCourse;
	Items[] dessert;
	Items[] drink;
	Scanner sc = new Scanner(System.in);
	
	public Main() {
		
		menu();
		takeOrder();
		
	}
	
	public void menu() {
		
		
		mainCourse = new MainCourse[4];
		dessert = new Dessert[4];
		drink = new Drink[4];
		
		mainCourse[0] = new MainCourse(1, "pasta", 10);
		mainCourse[1] = new MainCourse(2, "steak", 11);
		mainCourse[2] = new MainCourse(3, "salmon", 12);
		mainCourse[3] = new MainCourse(4, "pizza", 13);
		
		dessert[0] = new Dessert("brownie", 4);
		dessert[1] = new Dessert("puff", 5);
		dessert[2] = new Dessert("tart", 6);
		dessert[3] = new Dessert("donut", 7);

		drink[0] = new Drink("irish coffee", 8);
		drink[1] = new Drink("heineken", 7);
		drink[2] = new Drink("sparkling water", 6);
		drink[3] = new Drink("still water", 5);
		
	}
	
	public void takeOrder() {
		
		
		System.out.println("What menu would you like to see?\n1: MainCourse \n2: Dessert \n3: Drink");
		
		int type = sc.nextInt();
		
		if(type == 1) {
			
			displayMenu(mainCourse);
			System.out.println("Enter a number you'd like to order please.");
			
			int type02 = sc.nextInt();
			
			if(type02 == 1) {
				
				//maybe, create one more class for order instance? and modify toString() method
				order.add(mainCourse[0]);
//				order.add(mainCourse[1]); 
			     System.out.println(order.get(0));
//			     System.out.println(order.get(1));
			}else if(type02 == 2) {
				order.add(mainCourse[1]);     
			     System.out.println(order.get(0));
			}else if(type02 == 3) {
				order.add(mainCourse[2]);     
			     System.out.println(order.get(0));
			}else if(type02 == 4) {
				order.add(mainCourse[3]);     
			     System.out.println(order.get(0));
			}			
			
		}else if(type == 2) {
			
			displayMenu(dessert);
			
		}else {
			
			if(type == 3) {
			
				displayMenu(drink);
			}
		}
	}
	
	public void displayMenu(Items[] item) {
				
		for(int i=0; i<item.length; i++) {
			
			System.out.println(item[i]);		
		}
		
	}
	
	public void displayOrder(Items[] item) {
		
		for(int i=0; i<item.length; i++) {
			
			System.out.println(item[i]);		
		}
		
	}
	
	public static void main(String[] args) {

		new Main();

	}


}
