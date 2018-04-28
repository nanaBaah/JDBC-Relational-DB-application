package de.dis2011.data;

public class House extends Estate {
	private int numberofFloors;
	private double price;
	private boolean garden;
	
	public int getNumberofFloors() {
		return numberofFloors;
	}
	
	public void setNumberofFloors(int numberofFloors) {
		this.numberofFloors = numberofFloors;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isGarden() {
		return garden;
	}
	
	public void setGarden(boolean garden) {
		this.garden = garden;
	}
	
}
