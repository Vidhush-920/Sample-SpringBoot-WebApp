package com.trialapp.appone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.trialapp.appone.aorepository")
public class ApponeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApponeApplication.class, args);
	}

}
