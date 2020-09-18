package com.parking.payment;
// might use this class in future 
public class Bike implements Payment {

 
	
	
		public void vehicle() {
			System.out.print("car");
			
		}

		public void rate(int n ) {
		
			System.out.print("10 Rs for first 2 hours");
			if(n<=2)
			{
				int rate =10;
			}
			if(n>2)
			{
				int no = n-2;
				int rate = (10 + 5*no);
			}
		
			
		}

		public void rateabove() {
			
			System.out.print("+5 Rs");
			
		}
		
		public void discount() {
			
			
		System.out.print("Saturday free ");

			
		}
		
	}


