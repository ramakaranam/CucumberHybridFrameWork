package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class forgotpassword {
 @Given("^User opens the application$")
	public void user_opens_the_application() {
	    System.out.println("User opens the application");
	}

	@When("user clicks on my account")
	public void user_clicks_on_my_account() {
		System.out.println("User has clicks on my account");
	}

	@And("selects login option")
	public void selects_login_option() {
		System.out.println("User has clicks on login option");
	}

	@And("Enter valid email id")
	public void enter_valid_email_id() {
		System.out.println("User enter email address");  
	}

	@And("Clcik on continue button")
	public void clcik_on_continue_button() {
		System.out.println("User clicks on continue button");
	}

	@Then("Proper confirmation message should be displayed")
	public void proper_confirmation_message_should_be_displayed() {
		System.out.println("valid message should be displayed");
	}



}
