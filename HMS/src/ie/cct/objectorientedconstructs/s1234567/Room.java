package ie.cct.objectorientedconstructs.s1234567;

import java.util.Map;

import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Room implements RoomInterface {

	private String type;
	private int id;
	private double rate;
		
	public Room(int id) {
		//specified constructor
		this.id = id;
	}
	
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		this.type = type;
	}

	@Override
	public double getRate() {
		// TODO Auto-generated method stub
		return this.rate;
	}

	@Override
	public void setRate(double rate) {

		this.rate = rate;
	}

	@Override
	public Map<String, boolean[]> getAvailability() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAvailability(Map<String, boolean[]> availability) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public boolean isAvailable(String month, int day) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean book(String month, int day) {
		// TODO Auto-generated method stub
		return false;
	}

}
