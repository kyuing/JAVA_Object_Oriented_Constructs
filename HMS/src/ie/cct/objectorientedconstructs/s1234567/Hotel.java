package ie.cct.objectorientedconstructs.s1234567;

import java.util.List;

import ie.cct.objectorientedconstructs.interfaces.HotelInterface;
import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class Hotel implements HotelInterface {

	private List<RoomInterface> rooms;
	private String name;
	
	@Override
	public List<RoomInterface> getRooms() {
		// TODO Auto-generated method stub
		return this.rooms;
	}

	@Override
	public void setRooms(List<RoomInterface> rooms) {
		// TODO Auto-generated method stub
		this.rooms = rooms;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {

		this.name = name;
		
	}

	@Override
	public boolean checkAvailability(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRoomAvailable(String month, int day, String type, int lengthOfStay) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getNumberOfRooms() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean bookRoom(String month, int day, String type, int lengthOfStay) {
		
		if (getRoomAvailable(month, day, type, lengthOfStay) <= 0) {
		
			return false;
		}
		return true;
		
	}

}
