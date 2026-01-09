package sprinc.core.lifecycle.lifecycle;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	// Will not ask for override
	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) {
		System.out.println("Step 3: 🧪 [Inspector Comes Before Init] Bean: " + name);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) {
		System.out.println("Step 5: 🛠️ [Inspector Approves After Init] Bean: " + name);
		return bean;
	}
}

/*
 * 
 * public interface BeanPostProcessor {
 * 
 * / default @Nullable Object postProcessBeforeInitialization(Object bean,
 * String beanName) throws BeansException { return bean; }
 * 
 * 
 * default @Nullable Object postProcessAfterInitialization(Object bean, String
 * beanName) throws BeansException { return bean; }
 * 
 * }
 */
