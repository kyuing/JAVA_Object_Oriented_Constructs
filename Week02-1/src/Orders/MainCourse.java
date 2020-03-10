//package Orders;
//
//import java.util.Scanner;
//
//public class MainCourse extends Orders {
//
//	private String pasta="pasta", steak="steak";
//	
//	
//	public MainCourse() {
//		
//		this.order = askCustomer();
//		
//	}
//	
//	@Override
//	public String askCustomer() {
//		
//		String input="";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("What main course would you like?\n1: " + pasta + "\n2: " + steak);
//		try {
//			input = sc.next();
//			
//			if(input.equals("1")) {
//				
//				input = pasta;
//			}else {
//			
//				if(input.equals("2")) {
//				
//					input = steak;
//				}
//				
//			}
//			
//			
//		}catch(Exception e) {
//			System.out.println("invalid input");
//		}
//		
//		return input;
//		
//	}
//	
//}
