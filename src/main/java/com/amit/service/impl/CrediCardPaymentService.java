package com.amit.service.impl;

import org.springframework.stereotype.Service;

import com.amit.service.PaymentService;

@Service("card")
class CardPaymentService implements PaymentService{

	@Override
	public String pay(String paymentRequest) {
		return "Payment done using Card";
	}
    
}