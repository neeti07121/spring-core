package main;

import org.springframework.stereotype.Component;

@Component
public class RazorpayPaymentService implements PaymentService{

	@Override
	public void pay() {
		System.out.println("Payment done via RazorPay...");
	}

}
