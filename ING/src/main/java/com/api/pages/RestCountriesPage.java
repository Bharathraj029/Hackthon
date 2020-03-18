package com.api.pages;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestCountriesPage {
	
	
	static Response res;
	public void baseUrlCheck(){
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI="https://restcountries.eu/";
		
	}
	
	
	public void hittheUrl(){
		
		RestAssured.basePath="/rest/v2/name/india";
		/*RequestSpecification req=RestAssured.given();
		res=req.get();
		*/
		
		res = given().when().get();
		
		System.out.println(res.statusCode());
	}
	
	

}
