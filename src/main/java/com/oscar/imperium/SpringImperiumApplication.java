package com.oscar.imperium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringImperiumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringImperiumApplication.class, args);
	}

}
