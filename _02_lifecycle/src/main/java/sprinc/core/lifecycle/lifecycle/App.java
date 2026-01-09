package sprinc.core.lifecycle.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("sprinc.core.lifecycle.lifecycle")
public class App {

	@Bean(initMethod="customInitMethod", destroyMethod="customDestroyMethod")
	public HouseService houseService() {
		return new HouseService();
	}
	
	@Bean
	public MyBeanPostProcessor bpp() {
		return new MyBeanPostProcessor();
	}
}
