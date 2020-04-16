package com.amit.service;

public interface PaymentServiceLocator {
	
	public PaymentService getService(String serviceName);

}
