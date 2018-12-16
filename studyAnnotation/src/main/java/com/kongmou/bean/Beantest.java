package com.kongmou.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kongmou.config.MainConfig;

public class Beantest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

		Person person = context.getBean(Person.class);
		System.out.println(person);

		String[] beanNames = context.getBeanNamesForType(Person.class);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}
}
