package StepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleTestData {
	
	@Given("Launch the Browser")
	public void launch_the_Browser() {
	System.out.println("Launch the browser");   
	}
	

//	@When("Enter the username and password")
//	public void enter_the_and(DataTable dt) {
//		
//	List<Map<String,String>>	list=dt.asMaps(String.class,String.class);
//		
//	   System.out.println("Username ::"+list.get(0).get("username"));
//	   System.out.println("password::;"+list.get(0).get("password"));
//	}
	
	@When("^Enter the \"(.*)\" and \"(.*)\"$")
	
	public void enter_the_and(String username, String password) {
		
		System.out.println(username+password);
		
		
	}
	

	@Then("Validate login page")
	public void validate_login_page() {
	    System.out.println("Login page");
	}


}
