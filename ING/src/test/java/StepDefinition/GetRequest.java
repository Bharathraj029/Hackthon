package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetRequest {
	
	@Given("set the url for API")
	public void set_the_url_for_API() {
		System.out.println("Given method");
	   
	}

	@When("hit the url and get the response")
	public void hit_the_url_and_get_the_response() {
	   
		System.out.println("When method");
	}

	@Then("validate the response code")
	public void validate_the_response_code() {
		System.out.println("Then method");
	   
	}



}
