package com.chickweed.andriod.polarstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class PolarstarApplication {
	/*public static void main(String[] args) {
		SpringApplication.run(PolarstarApplication.class, args);
	}*/

	public static final String APPLICATION_LOCATIONS = "spring.config.location="
			+ "classpath:application.yml";

	public static void main(String[] args) {
		new SpringApplicationBuilder(PolarstarApplication.class)
				.properties(APPLICATION_LOCATIONS)
				.run(args);
	}
}
