package com.interview.manish.model;

import org.springframework.stereotype.Component;

@Component
public class CreditCardDetails {

	private String fName;
	private String lName;
	private long ccNumber;
	private String message;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public long getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(long ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
