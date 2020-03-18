package com.api.pages;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GET_Emp_Pages {

	static Response res;

	public static void GetBaseURI() {
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "http://dummy.restapiexample.com";
	}

	public static void GetCountryAPIRequest() {
		RestAssured.basePath = "/api/v1/employees";
		res = given().when().get();

		System.out.println("Get Response for India :-" + res.asString());
	}

	public static void ValidateCountryAPIResponse() {
		JsonPath json = new JsonPath(res.asString());

		try {
			System.out.println("Started to validate the Indian langauge and calling code");
			Assert.assertEquals("Tiger Nixon", json.get("data[0].employee_name"));

			// System.out.println("Indian Langauge is ->>"+
			// json.get("[1].languages[0].name"));
			//
			// System.out.println("**************************");
			//
			// Assert.assertEquals("91", json.getString("[1].callingCodes[0]"));
			// System.out.println("India calling code is ->>"+
			// json.getString("[1].callingCodes[0]"));
			//
			// System.out.println("Successfully validated the Indian langauge as
			// Hindi and calling code as 91");
		}
		// }
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to validate the Indian langauge as Hindi and calling code as 91");
		}

	}
}
