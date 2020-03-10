package model;

import interfaces.Family;
import interfaces.Luxury;

public class Focus extends Ford implements Family, Luxury{

	public Focus(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void chillChampagne() {
		// TODO Auto-generated method stub
		System.out.println("Champagne cold from Focus");
	}

	@Override
	public void copenExtraSit() {
		// TODO Auto-generated method stub
		System.out.println("Extra sit available in Focus");
	}
	
	@Override 
	public String toString () {
		return super.toString() + " Focus ";
	}

}
