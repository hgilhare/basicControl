package stepdefination;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.basicControlcoding;

public class basicControlstepdefination {
	
	
	basicControlcoding a= new basicControlcoding();
	
	@Then("enter the first and last name")
	public void enter_the_first_and_last_name() {
	   a.enter_the_first_and_last_name();
	}

	@Then("select the gender")
	public void select_the_gender() {
		a.select_the_gender();
	    
	}

	@Given("select language")
	public void select_language() {
	    a.select_language();
	}

	@Given("enter email and password")
	public void enter_email_and_password() {
		a.enter_email_and_password();
	   
	}

	@Then("click register button")
	public void click_register_button() {
		a.click_register_button();

	}

	@Then("validate succesful register")
	public void validate_succesful_register() throws IOException {
		a.validate_succesful_register();
	    
	}


}
