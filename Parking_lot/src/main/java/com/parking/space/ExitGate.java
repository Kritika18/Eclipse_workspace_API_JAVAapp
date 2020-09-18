package com.parking.space;

import java.util.Collections;

public class ExitGate extends ParkingSpace{

	@Override
	public
	void leave(Integer spot) {  //removing car from parking 
		
		if(occupied.isEmpty())   // if occupied list empty parking empty
		{
			
			System.out.print("No Car at Parking");
		}
		else {
				// empty the given spot from the occupied parking 
				emptyspace.add(spot);
				occupied.remove(spot);
				Collections.sort(emptyspace);
		}		
	}

	
}
