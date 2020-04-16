package com.amit.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amit.service.PaymentServiceLocator;

@Configuration
public class ServiceLocatorConfig {
	
	@Bean
	public FactoryBean<?> getBean(){
		ServiceLocatorFactoryBean serviceLocatorFactory = new ServiceLocatorFactoryBean();
		serviceLocatorFactory.setServiceLocatorInterface(PaymentServiceLocator.class);	
		return serviceLocatorFactory;
		
	}
	
}
