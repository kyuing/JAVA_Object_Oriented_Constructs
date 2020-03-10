package model;

public class Toyota extends automobile {

	public Toyota(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "This is a " + this.colour + " Toyota ";
	}
}
