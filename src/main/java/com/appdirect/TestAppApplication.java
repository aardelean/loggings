package com.appdirect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.appdirect.logs.LogRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = LogRepository.class)
public class TestAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestAppApplication.class, args);
	}
}
