package Shape;

//public class Rectangle extends Shape
public class Rectangle extends Shape {

	//private-level attributes
	private double height, width;
	
	
	/**
	 * default constructor
	 */
	public Rectangle() {

		//init the attributes by default
		this.width = 15;
		this.height = 30;
		//calcArea(); //another possible approach to get the area calculated.
		
		//init the attributes that are usable by extending the super class(the abstract class)
		this.area = calcArea(); 
		this.color = null;
		this.isFilled = false; //no color in any shape has been filled. set the boolean variable to be false by default.
	}
	
	/**
	 * specified constructor
	 * @param height
	 * @param width
	 */
	public Rectangle(double height, double width) {
	
		this.height = height;
		this.width = width;
		//calcArea(); //another possible approach to get the area calculated.
		
		//init the attributes that are usable by extending the super class(the abstract class)
		this.area = calcArea();
		this.color = null;
		this.isFilled = false; //no color in any shape has been filled. set the boolean variable to be false by default.
	}
	
	/**
	 * specified constructor if height and width has the same integer value
	 * @param size
	 */
	public Rectangle(double size) {
		
		this.height = size;
		this.width = size;
		//calcArea(); //another possible approach to get the area calculated.
		
		//init the attributes that are usable by extending the super class(the abstract class)
		this.area = calcArea();
		this.color = null;
		this.isFilled = false; //no color in any shape has been filled. set the boolean variable to be false by default.
	}
	
	/**
	 * height getter
	 * @return this.height
	 */
	public double getHeight() {
		
		return this.height;
	}
	
	/**
	 * width getter
	 * @return this.width
	 */
	public double getWidth() {
		
		return this.width;
	}
	
	/* boolean method that also works as a setter 
	 * that leaves a room for height to be able to change by an input
	 * if the input > 0
	 */
	public boolean setHeight(double height) {
		
		if(height > 0) {
		
			this.height = height; //init 
//			calcArea();
			this.area = calcArea();
			return true;
		}
		return false;
	}
	
	//boolean method that works as a setter
	public boolean setWidth(double width) {
		
		if(width > 0) {
			
			this.width = width; //init it
			
			//calcArea(); //another possible approach to get the area calculated.
			this.area = calcArea(); //init this.area by calling calcArea() 
			return true; //method-level return
		}
		return false; //method-level return
	}
	
	//return the value of the area calculated.
	//Overridden method from the abstract class
	@Override
	protected double calcArea() {
		
		//Area = with * height
		return this.width * this.height;
	}
	
	/********************************************* 
	 //another possible approach; not in use
     private void calcArea() {
	   this.area = this.width * this.height;
	 }                                         
	 **********************************************/
		
	//overridden toString() method; 
	//is bound to the abstract class Shape but not 100%
	@Override
	public String toString() {
		
		
		String toReturn = "Width: " + this.width + "\nHeight: " + this.height + "\nArea: " + this.area; 
		
		if (this.isFilled) {
			//if color is filled in any instance of Rectangle return the following.
			toReturn += "\nColor: " + this.color;
		}
		return toReturn;
	}
}
