package com.restassured;

import org.junit.Assert;
import org.junit.Test;

import groovy.time.BaseDuration.From;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetTest {

	@Test
	public void getResponseCodeValidate() {

		Response res = given().when().get("http://dummy.restapiexample.com/api/v1/employees");
		// res.then().log().all();

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		// RestAssured.baseURI="https://restcountries.eu/rest/v2/name";
		RequestSpecification request = RestAssured.given();

		Response resp = request.get("/employees"); // resp.then().log().all();

		// Response resp=request.get("/india");
		// Assert.assertEquals(resp.getStatusCode(), 200);

		System.out.println(resp.body().asString());

		ArrayList<String> allData = resp.jsonPath().get("data");

		for (int i = 0; i < allData.size(); i++) {

			Map<String, String> res1 = resp.jsonPath().get("data[" + i + "]");

			for (Map.Entry<String, String> entry : res1.entrySet()) {

				//System.out.println("Key is ::" + entry.getKey() + "value is ::" + entry.getValue());

			}
			
			//Code to display only id
			String list=resp.jsonPath().get("data[" + i + "].id");
			System.out.println("id is ::"+list);
		}
		
				
		/*JsonPath json=new JsonPath(resp.asString());
	ArrayList<String> li=	json.get("data..id");
	
	System.out.println(li);*/

	}

}
