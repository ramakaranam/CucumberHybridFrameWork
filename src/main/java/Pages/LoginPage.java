package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class LoginPage {

	WebDriver driver;
	private ElementsUtils elementUtils;
	  public LoginPage(WebDriver driver) {
		  this.driver = driver;
		  PageFactory.initElements(driver,this);
		  elementUtils = new ElementsUtils(driver);
	  }
	 
	  @FindBy(id="input-email")
	  private WebElement emailField;
	  
	  @FindBy(id= "input-password")
	  private WebElement passwordfield;
	  
	  @FindBy(xpath ="//input[@value='Login']")
	  private WebElement continuebutton;
	  
	  @FindBy(xpath ="//div[contains(@class,'alert-dismissible')]")
	  private WebElement wariningmessage;
	  
	  public void emailAddress(String emailText) {
		  elementUtils.typeTextIntoElement(emailField, emailText, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		  
	  }
	  
	  public void password(String password){
		  elementUtils.typeTextIntoElement(passwordfield, password, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		  
	  }
	
		 
	
	  
	  public AccountPage clickonLoginbutton() {
		  elementUtils.clickOnElemenet(continuebutton, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		  return  new AccountPage(driver);
	  }
		  
   public String verifyingWariningMessage(){
	  return elementUtils.getTextFromElement(wariningmessage, commonUtils.EXPLICT_WAIT_BASIC_TIME);
			
		 }
	  }
	  
	  

