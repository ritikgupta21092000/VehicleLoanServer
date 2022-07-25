package com.lti.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Sales {
	int salesId;
	
	@ManyToOne
	@JoinColumn(name="vehicleId")
	Vehicles vehicles;
	
	@OneToOne
	@JoinColumn(name="loanId")
	LoanDetails loanDetails;
	
	@ManyToOne
	@JoinColumn(name="applicantId")
	PersonalDetails personalDetails;
	
	public int getSalesId() {
		return salesId;
	}

	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}

	public Vehicles getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicles vehicles) {
		this.vehicles = vehicles;
	}

	public LoanDetails getLoanDetails() {
		return loanDetails;
	}

	public void setLoanDetails(LoanDetails loanDetails) {
		this.loanDetails = loanDetails;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}
	
}
