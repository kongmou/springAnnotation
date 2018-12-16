package com.kongmou.ext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kongmou.bean.Blue;

@Configuration
@ComponentScan({"com.kongmou.ext"})
public class ExtConfig {
	
	@Bean
	public Blue blue(){
		return new Blue();
	}

}
