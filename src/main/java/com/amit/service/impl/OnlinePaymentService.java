package com.amit.service.impl;

import org.springframework.stereotype.Service;

import com.amit.service.PaymentService;

@Service("online")
class OnlinePaymentService implements PaymentService{

	@Override
	public String pay(String paymentRequest) {
		return "Payment done using Online Banking";
	}
	
}