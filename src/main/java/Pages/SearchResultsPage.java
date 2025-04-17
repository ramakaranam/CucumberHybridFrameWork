package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class SearchResultsPage {

	WebDriver driver;
	private ElementsUtils elementUtils;
	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementsUtils(driver);
		
	}
	
	@FindBy(linkText ="HP LP3065")
	private WebElement validproduct;
	@FindBy(xpath ="//input[@id='button-search']/following-sibling::p")
	private WebElement messageText;
	
	public boolean displayStatusOfvalidProduct() {
		return elementUtils.displayStatusOfElement(validproduct, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	public String getMessageText() {
	  return elementUtils.getTextFromElement(messageText, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	
	
	
	
	
}
