package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class AccountPage {
	WebDriver driver;
	private ElementsUtils elementUtils;
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementsUtils(driver);
	}
	
	@FindBy(linkText="Edit your account information")
	private WebElement editYourAccountOption;
    
	
	public boolean displayStatusOfEditYourAccountInformationOption() {
		return elementUtils.displayStatusOfElement(editYourAccountOption, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
}
