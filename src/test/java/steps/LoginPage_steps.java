package steps;
import static org.junit.Assert.fail;

import java.time.Duration;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.DriverFactory;
import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.commonUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class LoginPage_steps {
	WebDriver driver;
	private LoginPage loginpage;
	private HomePage homepage;
	
	private AccountPage accountpage;
	
	@Given("User Navigate to the Login Page")
	public void user_navigate_to_the_login_page() {
		 driver = DriverFactory.getDriver();
		HomePage homepage = new HomePage(driver);
	    homepage.clickOnMyAccountMenu();
	  loginpage=  homepage.selectLoginOption();
		
	}
	

	@When("^User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String email) {
	    
	    loginpage.emailAddress(email);
		
	}

	@And("^Enters valid password (.+)$")
	public void enters_valid_password(String password) {
		loginpage.password(password);
	}

	@And("^Click on Login button$")
	public void click_on_login_button() {
	    accountpage = loginpage.clickonLoginbutton();
	}

	@Then("^User should be able to successfully login$")
	public void user_should_be_able_to_successfully_login() {
		Assert.assertTrue(accountpage.displayStatusOfEditYourAccountInformationOption());
	}
	
	@When("^User enters invalid email address(.+)$")
	public void User_enters_invalid_email_address(String email) {
	    
	    loginpage.emailAddress(commonUtils.getEmailWithTimeStramp());
		
	}

	
	@And("^Enters invalid password(.+)$")
	public void Enters_invalid_password(String password) {
		loginpage.password(password);
	}

	@And("Enters invalid password {string}")
	public void enters_invalid_password(String invalidpassword) {
		loginpage.password(invalidpassword);
		
	}

	@Then("Get a proper warning message")
	public void get_a_proper_warning() {
		
			
		Assert.assertTrue(loginpage.verifyingWariningMessage().contains("Warning: No match for E-Mail Address and/or Password."));
	}

	
	
	@When("^User dont enter any credentials$")
	public void user_dont_enter_any_credentials() {
		loginpage.emailAddress("");
		loginpage.password("");
		
	}
	

	
}
