package com.santander.examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.santander.examen"})
public class SantanderExamenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderExamenApplication.class, args);
	}

}
