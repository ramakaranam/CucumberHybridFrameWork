package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class HomePage {

	WebDriver driver;
	private ElementsUtils elementsUtils;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementsUtils =new ElementsUtils(driver);
	}
	
	@FindBy(xpath ="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(xpath ="//a[text()='Login']")
	private WebElement LoginOption;
	
	@FindBy(xpath ="//a[text()='Register']")
	private WebElement RegisterOption;
	
	@FindBy(xpath ="//input[@name='search']")
	private WebElement searchboxfield;
	
	@FindBy(xpath ="//button[contains(@class,'btn-default')]")
	private WebElement searchbutton;
	
	public void clickOnMyAccountMenu() {
		elementsUtils.clickOnElemenet(myAccountDropMenu, commonUtils.EXPLICT_WAIT_BASIC_TIME);
	}
	
	public LoginPage selectLoginOption() {
		elementsUtils.clickOnElemenet(LoginOption, commonUtils.EXPLICT_WAIT_BASIC_TIME);
	
		return new LoginPage(driver);
	}
	
	public RegisterPage selectRegisterOption() {
		elementsUtils.clickOnElemenet(RegisterOption, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		return new RegisterPage(driver);
	}
	
	public void searchBoxField(String validproduct) {
		elementsUtils.typeTextIntoElement(searchboxfield, validproduct, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	public SearchResultsPage clickOnSearchButton() {
		elementsUtils.clickOnElemenet(searchbutton, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
		return new SearchResultsPage(driver);
	}
	
}
