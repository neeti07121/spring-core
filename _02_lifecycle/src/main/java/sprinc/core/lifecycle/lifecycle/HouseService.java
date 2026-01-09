package sprinc.core.lifecycle.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class HouseService implements InitializingBean, DisposableBean {

	public HouseService() {
		System.out.println("Step 2: [House build] Constructor called...");
	}

	@PostConstruct
	public void postConstructInit() {
		System.out.println("Step 4a: [Cleaning House] @PostConstruct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Step 4b: [Decorating House] InitializingBean.afterPropertiesSet() ");
	}

	public void customInitMethod() {
		System.out.println("Step 4c: [Final touch] custom init method");
	}

	@PreDestroy
	public void preDestroyCleanup() {
		System.out.println("Step 7a: [Packing] @PreDestroy");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Step 7b: [Disconnect Utilities] DisposableBean.destroy()");
	}

	public void customDestroyMethod() {
		System.out.println("Step 7c: [House Torn down] custom Destroy method...");
	}

	public void live() {
		System.out.println("Step 6: [House being used]");
	}
}
