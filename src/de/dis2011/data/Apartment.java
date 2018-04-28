package de.dis2011.data;

public class Apartment extends Estate {
	
	private int floor;
	private double rent;
	private int room;
	private boolean balcony;
	private boolean kitchen;
	
	public int getFloor() {
		return floor;
	}
	
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public double getRent() {
		return rent;
	}
	
	public void setRent(double rent) {
		this.rent = rent;
	}
	
	public int getRoom() {
		return room;
	}
	
	public void setRoom(int room) {
		this.room = room;
	}
	
	public boolean isBalcony() {
		return balcony;
	}
	
	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}
	
	public boolean isKitchen() {
		return kitchen;
	}
	
	public void setKitchen(boolean kitchen) {
		this.kitchen = kitchen;
	}
	
}
