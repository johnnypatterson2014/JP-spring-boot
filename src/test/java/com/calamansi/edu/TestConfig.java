package com.calamansi.edu;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.calamansi.edu.service.ExampleService;

@TestConfiguration
public class TestConfig {

	@Bean
	public ExampleService exampleService() {
		return new ExampleService();
	}
}
