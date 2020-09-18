package com.parking.space;

import java.util.ArrayList;
import java.util.Collections;

public abstract class ParkingSpace {

	ArrayList<Integer> emptyspace = new ArrayList<>();
	ArrayList<Integer> occupied = new ArrayList<>();
	Integer alreadyexecuted = 0;

	
	public void CreatingMethod(Integer slots) {

		
		if((alreadyexecuted)==0)   // if method is not executed at all 
		{
		for(int i=1 ; i<= slots; i++)
		{
		 emptyspace.add(i);
		}
		alreadyexecuted= 1;
		}
		else {  // if method is executed even once then don't do again
			System.out.print("Parking already created");
		}

	}
	
	public Integer park(String plate)   // parking given car no at the spot
	{
		
		int place = 0;
		if (emptyspace.size()==0)
		{
			System.out.println("Sorry, Parking lot is full");
		}
		else
		 { 
			
			Collections.sort(emptyspace);

			place= emptyspace.get(0);
			occupied.add(place);
			
			emptyspace.remove(0);
			

			} 
		

		return place;

	}

	public abstract void leave(Integer spot);

	
}
