package de.dis2011.data;

import java.sql.Date;
import java.sql.Time;

public class TenancyContract extends Contract {
	
	private Date startDate;
	private Time duration;
	private double additionalCost;
	private int apartmentId;
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Time getDuration() {
		return duration;
	}
	
	public void setDuration(Time duration) {
		this.duration = duration;
	}

	public double getAdditionalCost() {
		return additionalCost;
	}

	public void setAdditionalCost(double additionalCost) {
		this.additionalCost = additionalCost;
	}

	public int getApartmentId() {
		return apartmentId;
	}

	public void setApartmentId(int apartmentId) {
		this.apartmentId = apartmentId;
	}
	
}
