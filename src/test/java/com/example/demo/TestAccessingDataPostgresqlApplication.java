package com.example.demo;

import org.springframework.boot.SpringApplication;

public class TestAccessingDataPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.from(AccessingDataApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
