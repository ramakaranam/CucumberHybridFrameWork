package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.commonUtils;

import java.util.Date;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import Pages.AccountSuccessPage;
import Pages.HomePage;
import Pages.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;

public class RegisterPage_Steps {
	WebDriver driver;
    
	private HomePage homepage;
	private RegisterPage registerpage;
	private AccountSuccessPage accountsuccesspage;
	
	
//	@Before(order =0)
//	public void setupOne() {
//		System.out.println("setup one before hook method got executed");
//	}
//	@Before
//	public void setupTwo() {
//		System.out.println("setup two before hook method got executed");
//	}
//	
//	@Before(order=1)
//	public void setupThree() {
//		System.out.println("setup three before hook method got executed");
//	}
//	
//	@After(order=0)
//	public void tearDownOne() {
//		System.out.println("----teardown one after hook method got executed");
//	}
//	
//	@After(order=1)
//	public void tearDownTwo() {
//		System.out.println("----teardown two after hook method got executed");
//	}
//	
//	@After(order=2)
//	public void tearDownThree() {
//		System.out.println("----teardown three after hook method got executed");
//	}

@When("User enters below details into fields")	
 public void User_enters_below_details_into_fields(DataTable datatable)
 {
	Map <String,String> map = datatable.asMap(String.class,String.class);
	registerpage.enterFirstname(map.get("firstname"));
	registerpage.enterLastname(map.get("lastname"));
	registerpage.enteremail(commonUtils.getEmailWithTimeStramp());
	registerpage.entertelephone(map.get("telephone"));
	registerpage.enterpassword(map.get("password"));
	registerpage.enterconfrimpassword(map.get("password"));
	
 }

@When("User enters below details into fields with duplicate emailid")	
public void User_enters_below_details_into_fields_with_duplicate_emailid(DataTable datatable)
{
	Map <String,String> map = datatable.asMap(String.class,String.class);
	registerpage.enterFirstname(map.get("firstname"));
	registerpage.enterLastname(map.get("lastname"));
	registerpage.enteremail(map.get("email"));
	registerpage.entertelephone(map.get("telephone"));
	registerpage.enterpassword(map.get("password"));
	registerpage.enterconfrimpassword(map.get("password"));
}

	

@Given("User naviagate to Register Account page")
public void User_naviagate_to_register_account_page() {
	driver = DriverFactory.getDriver();
	HomePage homepage = new HomePage(driver);
	homepage.clickOnMyAccountMenu();
	registerpage = homepage.selectRegisterOption();
	
}


@And("Select Privacy policy field")
public void select_privacy_policy_field() {
	
	registerpage.selectPrivacypolicy();
	
}

@And("Clicks on Continue button")
public void clicks_on_continue_button() {
	accountsuccesspage = registerpage.clickOnContinueButton();
	
	
	
}

@Then("Account should get successfully created.")
public void account_should_get_successfully_created() {
	Assert.assertTrue(accountsuccesspage.verifySuccessMessage().contains("Your Account Has Been Created!"));
	
}

@When("Select Yes for newsletter")
public void select_yes_for_newsletter() {
	registerpage.selectNewsletter();

}

@When("User dont enter details into any fields")
public void user_dont_enter_details_into_any_fields() {
	//Intentionally blank
	
 }


@Then("Warining message should be displayed for all the mandatory")
public void warining_message_should_be_displayed_for_all_the_mandatory_fields() {
	Assert.assertEquals("First Name must be between 1 and 32 characters!", registerpage.firstnameWarningMessage());
	Assert.assertEquals("Last Name must be between 1 and 32 characters!", registerpage.lastNameWarningMessage());
	Assert.assertEquals("E-Mail Address does not appear to be valid!", registerpage.emailwarningmessage());
	Assert.assertEquals("Telephone must be between 3 and 32 characters!", registerpage.telephoneWarningMessage());
	Assert.assertEquals("Password must be between 4 and 20 characters!", registerpage.passwordWarningMessage());
	Assert.assertTrue(registerpage. privacypolicyWarningMessage().contains("Warning: You must agree to the Privacy Policy!"));
	
 }

@Then("Warinig message that display the email is already exist")
public void Warinig_message_that_display_the_email_is_already_exist() {
	Assert.assertTrue(registerpage.duplicateEmailWarningMessage().contains("Warning: E-Mail Address is already registered!)"));
}




}
