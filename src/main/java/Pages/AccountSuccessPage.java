package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class AccountSuccessPage {
	WebDriver driver;
	private ElementsUtils elementUtils;
	public AccountSuccessPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementsUtils(driver);
	}
	
	 @FindBy(xpath ="//div[@id='content']/h1")
	 private WebElement successmessage;
	 
	 public String verifySuccessMessage() {
		return  elementUtils.getTextFromElement(successmessage, commonUtils.EXPLICT_WAIT_BASIC_TIME);
	
	 }

}
