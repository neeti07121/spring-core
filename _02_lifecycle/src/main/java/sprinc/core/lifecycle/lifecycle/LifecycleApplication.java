package sprinc.core.lifecycle.lifecycle;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LifecycleApplication {

	public static void main(String[] args) {
	//	var context = SpringApplication.run(LifecycleApplication.class, args);
	// or
		AnnotationConfigApplicationContext context =
		        new AnnotationConfigApplicationContext(App.class);
		HouseService house = context.getBean(HouseService.class);
		house.live();
		context.close();
	}
}
