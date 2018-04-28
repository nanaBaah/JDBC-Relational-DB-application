package de.dis2011.data;

public class PurchaseContract extends Contract {
	private int numberOfInstallment;
	private double interestRate;
	private int houseId;
	
	public int getNumberOfInstallment() {
		return numberOfInstallment;
	}
	
	public void setNumberOfInstallment(int numberOfInstallment) {
		this.numberOfInstallment = numberOfInstallment;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	
	
}
