package com.calamansi.edu.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

	public String getTestResponse() {
		return "{ \"test\":\"testing\"}";
	}

}
