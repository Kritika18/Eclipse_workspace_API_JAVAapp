package com.parking.model;

import java.util.Scanner;


public class SaveCarData  {
	
	private String plateNo;
	private String color;
	private Integer time;
	private Integer spot;
	private String vehicle;
	
	
	
	public SaveCarData(String a, int c) {
		// TODO Auto-generated constructor stub
		 plateNo = a;
	        //color = b;
	        spot = c;
	}
	
	public SaveCarData() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
        String s = + spot + "        " + plateNo + " ";
                
        return s;
    }
	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getPlateNo() {
		return plateNo;
	}
	
	public String setPlateNo(String plateNo) {
		return this.plateNo = plateNo;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	
	public void setSpot(Integer spot) {
		 this.spot = spot;
	}
	
	

	public Integer getSpot() {
		
	  	return spot ;
	}
	
	
	
	
	
    

}
