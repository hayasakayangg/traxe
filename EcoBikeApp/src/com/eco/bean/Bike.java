package com.eco.bean;

public class Bike {
	private String idBike;
	private int typeBike;
	private int costBike;
    public Bike() {

    }
    public Bike(String idBike, int typeBike, int costBike) {
    	this.idBike = idBike;
    	this.typeBike = typeBike;
    	this.costBike = costBike;
    }
    public String getIdBike() {
		return idBike;
	}

	public void setIdBike(String idBike) {
		this.idBike = idBike;
	}
	public int getTypeBike() {
		return typeBike;
	}
	public void setTypeBike(int typeBike) {
		this.typeBike = typeBike;
	}
	public int getCostBike() {
		return costBike;
	}
	public void setCostBike(int costBike) {
		this.costBike = costBike;
	}
}

