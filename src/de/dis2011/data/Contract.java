package de.dis2011.data;

import java.sql.Date;

public class Contract {
	private int id;
	private Date contractDate;
	private String place;
	private int personId;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getContractDate() {
		return contractDate;
	}
	
	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	
}
