package com.api.pages;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.List;

public class CountriesFurthestAheadOfUTC {
	
	static Response resp;
	public static void setUpBaseUrl(){
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI="https://restcountries.eu/";
		
	}
	
	public static void getOperation(){
		
		resp=given().when().get("rest/v2/all");
	
		System.out.println(resp.asString());
	}
	
	public void validateUtc(){
		
		JsonPath js=new JsonPath(resp.asString());
		
		
		List<List<String>> list=js.get("timezones");
		
	}
	

}
