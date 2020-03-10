package model;

public class Audi extends automobile {

	public Audi(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "This is a " + this.colour + " Audi ";
	}
}
