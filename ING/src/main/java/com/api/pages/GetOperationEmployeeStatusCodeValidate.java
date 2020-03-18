package com.api.pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.junit.Assert;



public class GetOperationEmployeeStatusCodeValidate {
	
	
	static Response response;
	public static void setUpUrl(){
		
		//RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI="http://dummy.restapiexample.com/";
	
	}
	
	public static void hitTheUrl(){
		
		RestAssured.basePath="/api/v1/employees";
		response=given().when().get();
		

		System.out.println(response.asString());
		
	}
	
	
	public static void validateResponseStatus(){
		
		
		Assert.assertEquals(response.statusCode(), 20);
		
	}

}
