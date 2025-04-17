package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class RegisterPage {

	WebDriver driver;
	private ElementsUtils elementUtils;
	
	public RegisterPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementsUtils(driver);
		
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstnameField;
	
	@FindBy(id="input-lastname")
	private WebElement lastnameField;
	
	@FindBy(id="input-email")
	private WebElement emailfield;
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(id="input-confirm")
	private WebElement confrimpasswordField;
	
	@FindBy(name= "agree")
	private WebElement privacypolicy;
	
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath= "//input[@name='newsletter'][@value='1']")
	private WebElement newsletter;
	
	@FindBy(xpath ="//input[@id='input-firstname']/following-sibling::div")
	private WebElement firstnamewarning;
	
	@FindBy(xpath ="//input[@id='input-lastname']/following-sibling::div")
	private  WebElement lastnamewarningmessage;
	
	@FindBy(xpath ="//input[@id='input-email']/following-sibling::div")
	private  WebElement emailwarningmessage;
	
	@FindBy(xpath ="//input[@id='input-telephone']/following-sibling::div")
	private  WebElement telephonewarningmessage;
	
	@FindBy(xpath ="//input[@id='input-password']/following-sibling::div")
	private  WebElement passwordwarningmessage;
	
	
	@FindBy(xpath ="//div[contains(@class,'alert-dismissible')]")
	private WebElement duplicateemailwarningmessage;
	
	@FindBy(xpath ="//div[contains(@class,'alert-danger')]")
	private WebElement privacypolicywarningmessage;
	
	public void enterFirstname(String firstname) {
		elementUtils.typeTextIntoElement(firstnameField, firstname, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	public void enterLastname(String lastname) {
		elementUtils.typeTextIntoElement(lastnameField, lastname, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	public void enteremail(String email) {
		elementUtils.typeTextIntoElement(emailfield, email, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	public void entertelephone(String phonenumber) {
		elementUtils.typeTextIntoElement(telephoneField, phonenumber, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	public void enterpassword(String password) {
		elementUtils.typeTextIntoElement(passwordField, password, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	public void enterconfrimpassword(String confrimpasswprd) {
		elementUtils.typeTextIntoElement(confrimpasswordField, confrimpasswprd, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	public void selectPrivacypolicy() {
		elementUtils.clickOnElemenet(privacypolicy, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	public AccountSuccessPage clickOnContinueButton() {
		elementUtils.clickOnElemenet(continuebutton, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		return new AccountSuccessPage(driver);
	}
	
	public void selectNewsletter() {
		elementUtils.clickOnElemenet(newsletter, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	public String firstnameWarningMessage() {
		return elementUtils.getTextFromElement(firstnamewarning, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	public String duplicateEmailWarningMessage() {
		return elementUtils.getTextFromElement(duplicateemailwarningmessage, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	public String lastNameWarningMessage() {
		return elementUtils.getTextFromElement(lastnamewarningmessage, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	public String emailwarningmessage() {
		return elementUtils.getTextFromElement(emailwarningmessage, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	public String telephoneWarningMessage() {
		return elementUtils.getTextFromElement(telephonewarningmessage, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	public String passwordWarningMessage() {
		return elementUtils.getTextFromElement(passwordwarningmessage, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	public String privacypolicyWarningMessage() {
		return elementUtils.getTextFromElement(privacypolicywarningmessage, commonUtils.EXPLICT_WAIT_BASIC_TIME);
		
	}
	
	
}
