package com.kongmou.tx;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Tx {
	@Test
	public void test01() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);

		StuService stuService = applicationContext.getBean(StuService.class);

		stuService.insertStu();
		applicationContext.close();
	}
}
