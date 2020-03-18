package com.api.stepdifination;

import org.junit.Before;

import com.api.pages.PostAuthTokenPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostAuthToken {
	
	PostAuthTokenPage postGav=new PostAuthTokenPage();
	
	
	
	//PostAuthTokenPage postGav;
	@Given("Hit the Auth url")
	public void hit_the_Auth_url() {
		
		postGav.launchUrl();
	
	}

	@When("get the auth token")
	public void get_the_auth_token() {
		postGav.getToken();
	}

	@Then("validate the token")
	public void validate_the_token() {
	
		postGav.validateStatusCode();
	}

}
