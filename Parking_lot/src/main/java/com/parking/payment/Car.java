package com.parking.payment;

public class Car implements Payment {

	public void vehicle() {
		System.out.print("car");

	}

	public void rate(int n) { // calculate rates of parking
		int rate, no;
		if (n <= 2) {
			rate = 10; // declared common charge 10 for <2 hour
			System.out.println(rate);
		} else // for more than 2 hours
		{
			no = n - 2;
			rate = (10 + 10 * no);
			System.out.println(rate);
		}

	}

	// other methods may use in future
	public void rateabove() {

		System.out.print("+10 Rs");

	}

	public void discount() {

		System.out.print("Monday free ");

	}

	

}
