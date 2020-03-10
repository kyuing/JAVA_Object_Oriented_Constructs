package model;

import interfaces.Luxury;

public class Corolla extends Toyota implements Luxury {

	public Corolla(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void chillChampagne() {
		// TODO Auto-generated method stub
		System.out.println("Cold champagne for the Corolla");
	}
	
	@Override 
	public String toString () {
		return super.toString() + " Corolla ";
	}
	
//	@Override
//	public void chillChampagne() {		another way to call the method and complement personalizando a la clase 
//		return super.toString() + " Corolla ";
//	}

}
