package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import Pages.HomePage;
import Pages.SearchResultsPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;

public class Search_Page {
	
//	@Before("@register")
//	public void setup() {
//		System.out.println("Browser got opened");
//	}
//	
//	@After("@register")
//	public void teardown() {
//		System.out.println("Browser got closed");
//	}

//	@BeforeStep
//	public void beforeEveryStep() {
//		System.out.println("Before every step hook");
//		
//	}
//	@AfterStep
//	public void afterEveryStep() {
//		System.out.println("After every step hook");
//		
//	}
	WebDriver driver;
	private HomePage homepage;
	private SearchResultsPage searchresultspage;
	
	@Given("^User open the application$")
	public void user_open_the_application() {
		driver = DriverFactory.getDriver();
		
		
	}
	
	@When("User enetr a valid product {string} into search field")
	public void User_enetr_a_valid_product_into_search_field(String validproduct)
	{
		homepage= new HomePage(driver);
		homepage.searchBoxField(validproduct);
		
	}
	

	@When("User clicks on search button")
	public void  User_clicks_on_search_button() {
		searchresultspage= homepage.clickOnSearchButton();
	}

	@Then("Valid Product should be displayed in search result")
	public void valid_product_should_be_displayed_in_search_result() {

	     Assert.assertTrue(searchresultspage.displayStatusOfvalidProduct());
	}

	
	@When("User enters non-existing product {string} into search field")
	public void User_enters_non_existing_product_into_search_field(String invalidproduct) {
		homepage= new HomePage(driver);
		homepage.searchBoxField(invalidproduct);
	}


	@Then("Proper text informing the user about no product matching should be displayed")
	public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {

		Assert.assertEquals("There is no product that matches the search criteria.",searchresultspage.getMessageText());
	}

	@When("User dont enter any product into search field")
	public void user_dont_enter_any_product_into_search_field() {
		//intentionally 
		homepage= new HomePage(driver);
	}

}
