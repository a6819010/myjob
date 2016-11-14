package com.hfyl.myjob.main;

import com.hfyl.myjob.util.PropertiesUtil;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.io.IOException;

@Configuration
@ComponentScan(basePackages="com.hfyl.*")
public class Main {

	public static void main(String[] args) throws IOException {
		PropertiesUtil.getProperties("properties/log4j.properties");
		new AnnotationConfigApplicationContext(Main.class);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
