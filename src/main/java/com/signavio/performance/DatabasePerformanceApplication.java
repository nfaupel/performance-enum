package com.signavio.performance;

import io.sniffy.boot.EnableSniffy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSniffy
@EnableAutoConfiguration
@SpringBootApplication
public class DatabasePerformanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabasePerformanceApplication.class, args);
	}
	
}
