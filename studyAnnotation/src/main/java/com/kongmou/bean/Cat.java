package com.kongmou.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Cat implements InitializingBean, DisposableBean {

	public Cat() {
		System.out.println("cat construct");
	}

	public void destroy() throws Exception {

		System.out.println("cat ... DisposableBean...");
	}

	public void afterPropertiesSet() throws Exception {

		System.out.println("cat ... InitializingBean ...");
	}

	// 对象创建并赋值之后调用
	@PostConstruct
	public void init() {
		System.out.println("cat....@PostConstruct...");
	}

	// 容器移除对象之前
	@PreDestroy
	public void detory() {
		System.out.println("cat....@PreDestroy...");
	}

	public void init2() {
		System.out.println("@Bean car ... init...");
	}

	public void detory2() {
		System.out.println("car ... detory...");
	}
}
