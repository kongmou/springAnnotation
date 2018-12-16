package com.kongmou.condiation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Environment environment = context.getEnvironment();
		String property = environment.getProperty("os.name");
		String[] activeProfiles = environment.getActiveProfiles();
		for (String fProperty : activeProfiles) {
			System.out.println(fProperty);
		}
		if (property.contains("Windows")) {
			return true;
		}
		return false;
	}

}
