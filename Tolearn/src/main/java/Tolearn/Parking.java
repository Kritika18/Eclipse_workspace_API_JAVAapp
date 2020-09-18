package Tolearn;

import java.util.ArrayList;
import java.util.Collections;



public class Parking  {
	
	
	
		
	ArrayList<Integer> emptyspace = new ArrayList<>();
	 ArrayList<Integer> occupied = new ArrayList<>();

		 
		public void CreatingMethod(Integer slots) {
//			System.out.print("Enter no of slots you want for parking");
//			Scanner myObj = new Scanner(System.in); // Create a Scanner object
//
//			slots = myObj.nextS();
			
			 
			System.out.println("in create " + slots);
			for(int i=1 ; i<= slots; i++)
			{
			 emptyspace.add(i);
			}

		}

		public Integer set(String plate) {

			System.out.println(occupied.size());
			//System.out.println(slots + "in set");
			//int size = occupied.size();
			int place = 0;
			if (emptyspace.size()>0) { 
				
				
				 //lets make hashmap <plate, slot> parked at 
				// parkedat.put(plate,slot)
				
				Collections.sort(emptyspace);

				place= emptyspace.get(0);
				occupied.add(place);
				
				emptyspace.remove(0);
				//System.out.println(emptyspace);
				//System.out.println("plate"+plate + "at" +place+ "place");
				System.out.println("parked at "  + occupied);
				
				
				//if (emptyspace.isEmpty()) {
					//available.add(plate);

				} 
			else
			{
				System.out.println("parking full");
			}

			return place;

		}
		
		
//		public void spotis(Integer plate)
//		{
//			
//			System.out.print(occupied); 
//		}

		public  void showspots() {
			System.out.println("Parking is like this - " + occupied);

		}

		public void remove(Integer spot) {

			// int emptyit = getSpot(plate);
			 // 3

			
//			available.remove(empty); 
			
			//parkedat.remove(plate)
			 
			emptyspace.add(spot);
			occupied.remove(spot);
			Collections.sort(emptyspace);
			System.out.println(spot + " place is empty ");
//			available.remove(empty); 
			
			// remove plateno at this spot(empty)
			System.out.println("in remove method " + occupied);

			System.out.println("in remove method- new size of list " + occupied.size());

		}

		

			

		
	}



