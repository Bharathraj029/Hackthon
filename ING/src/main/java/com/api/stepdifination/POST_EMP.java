package com.api.stepdifination;

import com.api.pages.POST_EMP_Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class POST_EMP {
	
	
	@Given("^POST Base URI for POST$") 
	public void post_Base_URI_for_POST() {
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI = "http://dummy.restapiexample.com";
		}
		
		
	}
	

	@When("^Send the POST request$")
	
	public void send_the_POST_request() {
	   
		POST_EMP_Pages.POSTCountryAPIRequest();
	}

	@Then("^Validate the response status code$")
	public void validate_the_response_status_code() {
		
		POST_EMP_Pages.ValidateCountryAPIResponse();
	    
	}

//	@Then("Validate using GET Method")
//	public void validate_using_GET_Method() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}



}
