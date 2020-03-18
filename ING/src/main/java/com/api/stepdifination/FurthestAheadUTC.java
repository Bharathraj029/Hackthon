package com.api.stepdifination;

import com.api.pages.CountriesFurthestAheadOfUTC;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FurthestAheadUTC {

	@Given("Get the BAse URL")
	public void get_the_BAse_URL() {

		CountriesFurthestAheadOfUTC.setUpBaseUrl();

	}

	@When("Hit the URL")
	public void hit_the_URL() {
		CountriesFurthestAheadOfUTC.getOperation();
	}

	@Then("validate the country name")
	public void validate_the_country_name() {

	}

}
