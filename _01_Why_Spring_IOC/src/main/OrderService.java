package main;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
	private final PaymentService paymentService;

	public OrderService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void placeOrder() {
		paymentService.pay();
	}

}
