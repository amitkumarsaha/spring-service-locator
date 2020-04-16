package com.amit.controller;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amit.service.PaymentService;
import com.amit.service.PaymentServiceLocator;

@RestController
public class PaymentController {
	
	private static final String SERVICE_NOT_FOUND = "Service not found - Please verify the query parameter: mode";
	
	@Autowired
	private PaymentServiceLocator paymentServiceLocator;

	@GetMapping("/pay")
	public String pay(@RequestParam(required = false) String mode) {
		
		String response = null;
		
		try {
			PaymentService paymentService = paymentServiceLocator.getService(mode);
			response = paymentService.pay(mode);
		}
		catch(NoSuchBeanDefinitionException e) {
			response = SERVICE_NOT_FOUND;
		}
		
		return response;
	}
	
}
