package ie.cct.objectorientedconstructs.s1234567;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Room implements RoomInterface {

	private String type;
	private int id;
	private double rate;
	private Map<String, boolean[]> availability;
		
	public Room(String type, double rate, int id) {
	
		this.type = type;
		this.rate = rate;
		this.id = id;
		this.availability = new HashMap<String, boolean[]>();
		createAvailability(); //createAvailability()
	}
	
	private void createAvailability() {
		
		this.availability.put("January", new boolean[31]);
		Arrays.fill(this.availability.get("January"), true);
		
		this.availability.put("Febrary", new boolean[28]);
		Arrays.fill(this.availability.get("Febrary"), true);
		
		this.availability.put("March", new boolean[31]);
		Arrays.fill(this.availability.get("March"), true);
		
		this.availability.put("April", new boolean[30]);
		Arrays.fill(this.availability.get("April"), true);
		
		this.availability.put("May", new boolean[31]);
		Arrays.fill(this.availability.get("April"), true);
		this.availability.put("June", new boolean[30]);
		Arrays.fill(this.availability.get("April"), true);
		this.availability.put("August", new boolean[31]);
		Arrays.fill(this.availability.get("April"), true);
		this.availability.put("September", new boolean[30]);
		Arrays.fill(this.availability.get("April"), true);
		this.availability.put("October", new boolean[31]);
		Arrays.fill(this.availability.get("April"), true);
		this.availability.put("November", new boolean[30]);
		Arrays.fill(this.availability.get("April"), true);
		this.availability.put("December", new boolean[31]);
		Arrays.fill(this.availability.get("April"), true);
		
	}
	
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
		return this.availability;
	}

	@Override
	public void setAvailability(Map<String, boolean[]> availability) {
		// TODO Auto-generated method stub
		this.availability = availability; 
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public boolean isAvailable(String month, int day) {

		boolean[] monthAvailability = this.availability.get(month);
		boolean dayAvailability = monthAvailability[day-1];
		
		//return this.availability.get(month)[day-1];
		//return monthAvailability.get(month)[day-1];
		//return !dayAvailability;
		return dayAvailability;
	}

	@Override
	public boolean book(String month, int day) {


		if(isAvailable(month, day) {
			this.availability.get(month)[day-1] = false;
			return true;
		}
		return false;
	}

}
