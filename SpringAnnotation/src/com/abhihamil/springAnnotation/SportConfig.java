package com.abhihamil.springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.abhihamil.springAnnotation")
@PropertySource("classpath:sports.properties")
public class SportConfig {
	// define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	// define bean for swim coach and inject fortune service dependency
	@Bean 
	public Coach swinCoach(){
		return new SwimCoach(sadFortuneService());

	}




}
