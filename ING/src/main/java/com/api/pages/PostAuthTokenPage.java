package com.api.pages;

import org.json.simple.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostAuthTokenPage {
	
	static String token;
	Response res;
	public void launchUrl(){
		
		RestAssured.baseURI="http://localhost:8080";
		
	}

	public void getToken(){
		
		
		//RestAssured.basePath="/auth/login";
		RequestSpecification req=RestAssured.given();
		req.header("Content-Type","application/json");
		
		
		JSONObject json=new JSONObject();
		json.put("username", "test");
		json.put("password", "1234");
		
		req.body(json.toJSONString());
		
		res=req.post("/auth/login");
		
		
		
		System.out.println("Response is ::"+res.asString());
	}
	
	public void validateStatusCode(){
		
		Assert.assertEquals(res.statusCode(), 200);
	}
}
