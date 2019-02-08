package com.interview.manish.service;

import org.springframework.stereotype.Service;

import com.interview.manish.model.CreditCardDetails;

@Service
public class CCService {

	public CreditCardDetails validateCC(String ccNo) {
		CreditCardDetails ccDetails = new CreditCardDetails();
		if (ccNo.matches("[0-9]+") && ccNo.length() <= 16) {
			ccDetails.setMessage("Valid Credit Card");
			ccDetails.setCcNumber(Long.parseLong(ccNo));
			return ccDetails;
		}
		ccDetails.setMessage("Invalid Credit Card");
		return ccDetails;
	}

}
