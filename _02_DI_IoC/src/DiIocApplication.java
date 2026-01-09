package com.DI_IOC.DI_IOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiIocApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DiIocApplication.class, args);

		OrderService os = context.getBean(OrderService.class);
		os.process();
	}
}
/*
 * Output paid...
 */
