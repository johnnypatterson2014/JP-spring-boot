package com.calamansi.edu;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = Application.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
public class ApplicationITMock {

	@Autowired
	private MockMvc mvc;

	@Test
	public void givenX_whenGetX_thenStatus200() throws Exception {

		mvc.perform(get("/api/test"))
			.andExpectAll(status().isOk(), jsonPath("$.test").value("testing"));
	}
}
