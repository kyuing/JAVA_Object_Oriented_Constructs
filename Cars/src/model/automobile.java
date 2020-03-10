package model;

public abstract class automobile {
	
	protected String colour;
	
	public automobile(String colour ) {
		this.colour  = colour;
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
}
