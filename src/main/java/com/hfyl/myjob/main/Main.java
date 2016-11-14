package com.hfyl.myjob.main;

import com.hfyl.myjob.util.Constants;
import com.youguu.core.logging.Log;
import com.youguu.core.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages="com.hfyl.*")
public class Main {
	private static Log logger = LogFactory.getLog(Constants.LOG_NAME);
	
	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(Main.class);
		logger.info("====================Main START END===========================");
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
