package com.calamansi.edu.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.calamansi.edu.TestConfig;

@ExtendWith(SpringExtension.class)
@Import(TestConfig.class)
public class ExampleServiceTest {

	@Autowired 
	private ExampleService exampleService;
	
	@Test
	public void testing() {
		
		String myString = exampleService.getTestResponse();
		assertEquals(myString, "{ \"test\":\"testing\"}");
		
	}
}
