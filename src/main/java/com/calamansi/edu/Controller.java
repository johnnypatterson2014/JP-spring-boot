package com.calamansi.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calamansi.edu.service.ExampleService;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	private ExampleService exampleService;
	
	@GetMapping("/test")
	String getTest() {
		String testing = exampleService.getTestResponse();
		return testing;
	}
}
