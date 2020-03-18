package com.api.stepdifination;



import com.api.pages.GetOperationEmployeeStatusCodeValidate;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetEmployeeResponse {
	
	@Given("set the base url")
	public void set_the_base_url() {
		
		GetOperationEmployeeStatusCodeValidate.setUpUrl();
	  
	}

	@When("hit the url")
	public void hit_the_url() {
		GetOperationEmployeeStatusCodeValidate.hitTheUrl();
	    
	}

	@Then("validate the response code")
	public void validate_the_response_code() {
		GetOperationEmployeeStatusCodeValidate.validateResponseStatus();
	   
	}


}
