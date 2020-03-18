package com.api.stepdifination;

import com.api.pages.RestCountriesPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RestCountiesSd {
	
	RestCountriesPage cnt=new RestCountriesPage();
	
	@Given("Hit the Url")
	public void hit_the_Url() {
		
		cnt.baseUrlCheck();
		
	    
	}

	@When("Get the response")
	public void get_the_response() {
	   
		cnt.hittheUrl();
	}

	@Then("validate the response")
	public void validate_the_response() {
		
	}
	    
		

}
