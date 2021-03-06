package ie.cct.objectorientedconstructs;

import ie.cct.objectorientedconstructs.interfaces.HotelInterface;
import ie.cct.objectorientedconstructs.interfaces.HotelManagementSystemInterface;
import ie.cct.objectorientedconstructs.s1234567.HotelManagementSystem;

public class SampleInteraction {
	//testtesttest
//	HotelManagementSystemInterface hm;
//	static HotelInterface h = new mespil();
	
	
	public static void main(String[] args) {
    
		// create a new hotel management system
		HotelManagementSystemInterface hm = new HotelManagementSystem();
        // build the hotel from the text file

		HotelInterface h = hm.setupHotel("mespil.txt");
        // try some bookings
		
		h.checkAvailability("January", day, type, lengthOfStay)
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("January", 1, "Double", 5);
		h.bookRoom("February", 3, "Single", 10);
		h.bookRoom("February", 10, "Penthouse", 12);
		
        // see the calendar for January for single rooms
		System.out.println(hm.getCalendar("January", h));
		
		
	}
}
