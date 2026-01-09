package com.DI_IOC.DI_IOC;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	private PaymentService paymentService;

	public OrderService(PaymentService ps) {
		this.paymentService = ps;
	}
	
	public void process() {
		System.out.println(paymentService.pay());
	}

}
