package Shape;

public abstract class Shape {

	/* protected attributes.
	 * any sub classes that extend this Shape class within the same package
	 * can use the attributes below
	 */
	protected double area;
	protected  String color;
	protected  boolean isFilled;

	/**
	 * protected abstract double calcArea();
	 *  here is no code and is overridable. 
	 * @return the value of Area
	 */
	protected abstract double calcArea();
	
	/**
	 * a basic <method>toString()</method> template 
	 * for any instance of <object>Shape</object> 
	 * to output any local-level string info 
	 */
	@Override
	public String toString() {
		return "This is a shape";
	}

	/**
	 * boolean isFilled getter
	 * @return <boolean>isFilled</boolean>
	 */
	public boolean isFilled() {
		return isFilled;
	}

	/**
	 * color getter
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	//color setter
	public void setColor(String color) {
		
		this.isFilled = true; //update this.isFilled's state to be true 
		this.color = color;	//init color
		
	}
}
