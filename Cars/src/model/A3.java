package model;

import interfaces.Sport;

public class A3 extends Audi implements Sport{

	public A3(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyTurbo() {
		// TODO Auto-generated method stub
		System.out.println("Turbo in a A3");
	}
	
	@Override 
	public String toString () {
		return super.toString() + " A3 ";
	}

}
