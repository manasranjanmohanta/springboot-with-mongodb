package com.example.springboot_mongodb;

import org.springframework.boot.SpringApplication;

public class TestSpringbootMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringbootMongodbApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
