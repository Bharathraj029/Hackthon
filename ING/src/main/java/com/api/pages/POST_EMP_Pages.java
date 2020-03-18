package com.api.pages;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_EMP_Pages {

	static Response res;

	public static void POSTBaseURI() {
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "http://dummy.restapiexample.com";

	}

	public static void POSTCountryAPIRequest() {
		
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		
		JSONObject obj=new JSONObject();
		obj.put("name", "test_sridhar_Bharat");
		obj.put("salary", "1234");
		obj.put("age", "1234");
		
		request.body(obj.toJSONString());

		res = request.post("/api/v1/create");

		System.out.println("Get Response for India :-" + res.asString());

	}

	public static void ValidateCountryAPIResponse() {
		JsonPath json = new JsonPath(res.asString());
		
		
		

		try {

			 String id = json.get("data.id").toString();
		//	int id2 = json2.get("id");
			System.out.println(id);

			//POST_EMP_Pages.POSTBaseURI();
			
			Response res1=GET_Emp_Invalid_pages.GetCreateCountryAPIRequest(Integer.valueOf(id));
			
			
		System.out.println(res1.body().asString());
		
		JsonPath json1 = new JsonPath(res1.asString());
		
		System.out.println(json1.get("data.id"));
		
		 
		
		//	int id2 = json2.get("data.id");
			//Assert.assertEquals(id, id2);

			//
			// Assert.assertEquals("Tiger Nixon",
			// json.get("data[0].employee_name"));
			// }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
