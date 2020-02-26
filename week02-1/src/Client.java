

import Shape.Circle;
import Shape.Rectangle;
import Shape.Shape;

public class Client {

	public static void main(String[] args) {
		
		//create instances of Rectangle 
		Rectangle r1 = new Rectangle(); //with the default constructor
		Rectangle r2 = new Rectangle(5,8); //with one of the specified constructor
		Rectangle r3 = new Rectangle(5); //with one of the specified constructor
		Rectangle r4 = new Rectangle(); //with the default constructor
		r1.setColor("Black"); //set color for the instance r1
		
		r4.setColor("White"); //set color for the instance r4
		r4.setHeight(23); //set a new height to r4
		r4.setWidth(7); //set a new width to r4
		
		System.out.println("#r1\n" + r1 + "\n"); //print
		System.out.println("#r2\n" + r2 + "\n"); //print
		System.out.println("#r3\n" + r3 + "\n"); //print
		System.out.println("#r4\n" + r4 + "\n"); //print
		
		//create instances of Circle
		Circle c1 = new Circle(); //with the default constructor
		Circle c2 = new Circle(7); //with the specified constructor
		Circle c3 = new Circle(7); //with the specified constructor

		c1.setColor("Red"); //set color for the instance c1
		c3.setRadious(9); //set a new radious for the instance c3
		
		System.out.println("#c1\n" + c1 + "\n"); //print
		System.out.println("#c2\n" + c2 + "\n"); //print
		System.out.println("#c3\n" + c3 + "\n"); //print
		

		// Arrays can be initialized with the existing instance above
		// Or, it can be initialized as a new one. 
		System.out.println("-----------------Rectanhgle Arrays-------------------");		

		//create 1D array instances of Rectangle
		Rectangle[] arrayR = new Rectangle[5];
		
		//any instance that is rooting for Rectangle can be a value
		arrayR[0] = r3; //assign r3 to the selected index of the array 
		arrayR[1] = r2; //assign r2 to the selected index of the array
		arrayR[3] = r1; //assign r1 to the selected index of the array
		arrayR[4] = new Rectangle(2, 2); //assign a new height & width to the selected index of the array
		for (int i=0; i<arrayR.length; i++) {
			System.out.println("#Rectangle " + (i+1) + "\n" + arrayR[i] + "\n"); //print
		}
		
		System.out.println("-----------------Circle Arrays-------------------");
		//create 1D array instances of Circle
		Circle[] arrayC = new Circle[4];
		
		//any instance that is rooting for Circle can be a value
		arrayC[0] = c1; //assign c1 to the selected index of the array
		arrayC[1] = c3; //assign c3 to the selected index of the array
		arrayC[3] = c2; //assign c2 to the selected index of the array
		for (int i=0; i<arrayC.length; i++) {
			System.out.println("#Circle " + (i+1) + "\n" + arrayC[i] + "\n"); //print
		}
		
		System.out.println("-----------------Shape Arrays-------------------");
		//create 1D array instances of Shape
		Shape[] arrayS = new Shape[4];
		
		
		/* The abstract class Shape is the super class of 
		 * both Rectangle and Circle.
		 * That means, any existing instances of either one of the Rectangle and Circle, 
		 * or from both can be assigned as the value of the instances of the Shape  
		 * 
		 * still possible to instantiate Shape, Rectangle or Circle
		 */
		arrayS[0] = r1;
		arrayS[1] = r2;
		arrayS[2] = c1;
		
		for (int i=0; i<arrayS.length; i++) {
			
			if (i < 3) {
				System.out.println("#Shape " + (i+1) + "\n" + arrayS[i] + "\n"); //print
			}else {
				//3rd index of the array
				arrayS[i] = new Circle(99);
				System.out.println("#Shape " + (i+1) + "\n" + arrayS[i] + "\n"); //print

			}
			
		}
	}
}
