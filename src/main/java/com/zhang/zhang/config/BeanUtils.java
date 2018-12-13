package com.zhang.zhang.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanUtils implements ApplicationContextAware{
	
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		System.out.println("====>"+applicationContext);
		this.applicationContext = applicationContext;
		Object bean = applicationContext.getBean("bjUserService");
		System.out.println("bean=>"+ bean);
	}

}
