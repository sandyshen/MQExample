package com.mqex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMQApplication {

	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { SpringBootMQApplication.class }, args);
	}
}