package Shape;

//public class Circle extends Shape
public class Circle extends Shape {

	//private attributes
	private int radious;
	private final double pi = 3.14;
	
	/**
	 * default constructor
	 */
	public Circle() {
		
		//init the attributes by default
		this.radious = 10;
		
		//init the attributes that are usable by extending the super class(the abstract class)
		this.area = calcArea();
		this.color = null;
		this.isFilled = false; //no color in any shape has been filled. set the boolean variable to be false by default.		
	}
	
	/**
	 * specified constructor
	 * @param radious
	 */
	public Circle(int radious) {
		
		
		this.radious = radious; //init
		
		//init the attributes that are usable by extending the super class(the abstract class)
		this.area = calcArea();
		this.color = null;
		this.isFilled = false; //no color in any shape has been filled. set the boolean variable to be false by default.
	}
	
	//return the value of the area calculated.
	//Overridden method from the abstract class
	@Override
	protected double calcArea() {
		
		//Area = pi * radious^ 
		return this.pi * Math.pow(this.radious, 2); //return this.pi * this.radious * this.radious;
	}

	/* not in use
	 * public int getRadious() { return radious; }
	 */

	/* boolean method that also works as a setter 
	 * that leaves a room for height to be able to change by an input
	 * if the input > 0
	 */
	public boolean setRadious(int radious) {
		
		if(radious > 0) {
			
			this.radious = radious;
			this.area = calcArea();
			return true;
		}
		return false;
	}
	
	//overridden toString() method; 
	//is bound to the abstract class Shape but not 100%
	@Override
	public String toString() {
		
		String toReturn = "Radious: " + this.radious + "\nArea: " + this.area; 
		
		if (this.isFilled) {
			//if color is filled in any instance of Circle return the following.
			toReturn += "\nColor: " + this.color;
		}
		return toReturn;
	}
	
}
