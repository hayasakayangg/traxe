package com.eco.bean;

import java.util.ArrayList;

public class Station {
    private String name;
    private String address;
    private ArrayList<Bike> bikes;
    private int slot;
    public Station() {
    	super();
    }
    
    public Station(String name, String address, int slot, ArrayList<Bike> bikes) {
    	super();
    	this.name = name;
    	this.address = address;
    	this.bikes = bikes;
    	this.slot = slot;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	public ArrayList<Bike> getBikes( ) {
		return bikes;
	}
	public void setBikes(ArrayList<Bike> bikes) {
		this.bikes = bikes;
	}
}   

