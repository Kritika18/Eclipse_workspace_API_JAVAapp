// ignore this class as of now

package Tolearn;

import parking_lot.model.SaveCarData;

public class Ticket extends SaveCarData{
	
	public void showticket(Integer plate)
	{  
		System.out.print("plate is" + getPlateNo() );
		System.out.print("spot is" + getSpot(plate) );
		
		
		
	}

	
	
	
	
	

}
