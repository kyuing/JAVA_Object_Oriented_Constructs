package ie.cct.objectorientedconstructs.s1234567;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ie.cct.objectorientedconstructs.interfaces.HotelInterface;
import ie.cct.objectorientedconstructs.interfaces.HotelManagementSystemInterface;
import ie.cct.objectorientedconstructs.interfaces.RoomInterface;

public class HotelManagementSystem implements HotelManagementSystemInterface {

	String roomType;
//	HotelInterface[] hotel = new HotelInterface[10];
	Hotel mespil;

	List<RoomInterface> rooms = new ArrayList<RoomInterface>();
	Room[] Single;
	Room[] Double;
	Room[] Penthouse;


	String fileSetUp, name;

	public HotelManagementSystem() {

	}


	@Override
	public String getCalendar(String month, HotelInterface hotel) {
		// TODO Auto-generated method stub
		this.mespil = (Hotel) hotel;

		return month + ", " + hotel.getName();
	}

	@Override
	public HotelInterface setupHotel(String file) {

		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader(file));
			// C:\Users\HP\Eclipse_Semester04_Y02\HMS

//			br = new BufferedReader(new FileReader("C:\\Users\\HP\\Eclipse_Semester04_Y02\\HMS\\Mespil.txt"));
//			br = new BufferedReader(new FileReader("../../../../Mespil.txt"));
//			br = new BufferedReader(new FileReader(new File("../Mespil.txt")));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			fileSetUp = br.readLine();
			mespil.setName(fileSetUp);
			fileSetUp = br.readLine();

			String[] line = fileSetUp.split(":");
			String type = line[0];
			int rate = Integer.parseInt(line[1]);
			int numOfRooms = Integer.parseInt(line[2]);

			Single = new Room[numOfRooms]; 
			for(int i=0; i<Single.length; i++) { 
				
				
				Single[i] = new Room(i+1); 
				Single[i].setType(type); 
				Single[i].setRate(rate);
				rooms.add(Single[i]);
				mespil.setRooms(rooms);
				//Single[i].setAvailability(Single[i].getType(), ); }
			}
			 
			  
		  for(int i=0; i<Single.length; i++) {
		  
			  System.out.println(Single[i].getId() + ", " + 
			  Single[i].getType() + ", " +
			  Single[i].getRate());
		      // Single[i].setAvailability(Single[i].getType(), );
			  
		  }
//		  mespil.getRooms().forEach(System.out::println);
//		  System.out.println(mespil.getRooms().toString());
//		  System.out.println(Arrays.toString(mespil.getRooms().toArray()));
			 

		} catch (IOException e) {
			System.out.println("error found while reading txt file");
		}

		return this.mespil;
	}

}
