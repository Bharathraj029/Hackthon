package StepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UiStepDefnition {
	@Given("Login to ing.com.au")
	public void login_to_ing_com_au() {
		
		System.out.println("Login page");
	   
	}

	@When("Enter the username and Password")
	public void enter_the_username_and_Password(DataTable dt) {
		
	List<Map<String,String>> list=	dt.asMaps(String.class,String.class);
	for(int i=0;i<list.size();i++){
		System.out.println("Username  is ::"+list.get(i).get("username"));
		System.out.println("Password is ::"+list.get(i).get("password"));	
	}
	
	  
	}

	@When("Fill the form details")
	public void fill_the_form_details() {
	   System.out.println("Form details");
	}

	@Then("validate the fields entered")
	public void validate_the_fields_entered() {
	   
	}




}
