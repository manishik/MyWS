package com.interview.manish.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.interview.manish.model.CreditCardDetails;
import com.interview.manish.service.CCService;

@RestController
@RequestMapping(path = "/validate")
public class CCCtrl {

	Logger logger = LoggerFactory.getLogger(CCCtrl.class);

	@Autowired
	CCService ccService;

	@RequestMapping(path = "/creditCard/{ccNumber}", method = RequestMethod.POST)
	public CreditCardDetails validateCC(@PathVariable("ccNumber") String ccNumber) {
		logger.info("Credit Card Number at Controller Layer = {}", ccNumber);
		return ccService.validateCC(ccNumber);
	}

}
