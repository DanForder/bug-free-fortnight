package com.example.names;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
public class NamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamesApplication.class, args);
	}

}
