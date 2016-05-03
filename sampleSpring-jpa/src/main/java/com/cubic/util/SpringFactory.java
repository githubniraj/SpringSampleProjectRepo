package com.cubic.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class SpringFactory {

	private static final SpringFactory instance = new SpringFactory();

	private ApplicationContext applicationContext = null;
	String[] configs={"SpringJPA.xml","SpringJPA2.xml"};

	private SpringFactory() {
		applicationContext = new ClassPathXmlApplicationContext(configs);
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static SpringFactory getInstance() {
		return instance;
	}

	public <T> T getBean(Class<T> className) {
		return applicationContext.getBean(className);
	}

	public <T> T getBean(String name, Class<T> className) {
		return applicationContext.getBean(name, className);
	}

	public Object getBean(String name) {
		return applicationContext.getBean(name);
	}

	
	
}
