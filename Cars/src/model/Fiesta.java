package model;

import interfaces.Sport;

public class Fiesta extends Ford implements Sport{

	public Fiesta(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyTurbo() {
		// TODO Auto-generated method stu
		System.out.println("Apply turbo in Fiesta");
	}
	
	@Override 
	public String toString () {
		return super.toString() + " Fiesta ";
	}

}
