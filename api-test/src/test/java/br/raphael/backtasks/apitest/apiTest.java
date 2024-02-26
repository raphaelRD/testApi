package br.raphael.backtasks.apitest;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

public class apiTest {
	
	@Test
	public void test() {
		RestAssured.given()
		.when()
			.get("http://localhost:8001/tasks-backend/todo")
		.then()
			.statusCode(200)
		;
	}
	
	@Test
	public void adicionar() {
		
		RestAssured
		.given()
			.body("\"tasks\": \"Teste via API\",\r\n"
					+ "\"dueDate\": \"2020-12-30\"")
		.when()
			.post("http://localhost:8001/tasks-backend/todo")
		.then()
			.statusCode(415)
		;
	}

}
