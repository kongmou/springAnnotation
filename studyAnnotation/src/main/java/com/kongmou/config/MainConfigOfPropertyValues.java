package com.kongmou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.kongmou.bean.Person;

//使用@Value赋值； 
//1、基本数值 
//2、可以写SpEL； #{}
//3、可以写${}；取出配置文件【properties】中的值（在运行环境变量里面的值）

//使用@PropertySource读取外部配置文件中的k/v保存到运行的环境变量中;加载完外部的配置文件以后使用${}取出配置文件的值
@PropertySource(value = { "classpath:/person.properties" })
@Configuration
public class MainConfigOfPropertyValues {

	@Bean
	public Person person() {
		return new Person();
	}

}
