package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.FakerData;


public class nopCommerceRegistrationPage extends nopCommerceBasePage {
	

	
	public String HOMEPAGE_URL = "https://demo.nopcommerce.com/";
	public By REGISTER_TAB = By.xpath("//a[contains(text(),'Register')]");
	
	
	public String REGISTRATIONPAGE_URL = "https://demo.nopcommerce.com/register?returnUrl=%2F";
	public By GENDER_SELECT_RADIO_BUTTON = By.xpath("//input[@id='gender-female']");
	public By FIRST_NAME_INPUT_FIELD = By.xpath("//input[@id='FirstName']");
	public By LAST_NAME_INPUT_FIELD = By.xpath("//input[@id='LastName']");
//	WebElement DOB_DAY = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
	public By DOB_DAY = By.xpath("//select[@name='DateOfBirthDay']");
	public By DOB_MONTH = By.xpath("//select[@name='DateOfBirthMonth']");
	public By DOB_YEAR = By.xpath("//select[@name='DateOfBirthYear']");
//	public By PASSWORD_INPUT_FIELD = By.xpath("//input[@placeholder='Please enter your password']");
	public By EMAIL_INPUT_FIELD = By.xpath("//input[@id='Email']");
	public By COMPANY_NAME_INPUT_FIELD = By.xpath("//input[@id='Company']");
	public By NEWSLETTER_STATUS_CHECKBOX = By.xpath("//input[@id='Newsletter']");
	public By PASSWORD_INPUT_FIELD = By.xpath("//input[@id='Password']");
	public By CONFIRM_PASSWORD_INPUT_FIELD = By.xpath("//input[@id='ConfirmPassword']");
	public By REGISTER_BUTTON = By.xpath("//button[@id='register-button']");
	public By SUCCESS_MESSAGE = By.xpath("//div[contains(text(),'Your registration completed')]");


	public void doLogin(String email, String companyName, String password, String confirmPassword, String successMessage) {
		clickOnElement(GENDER_SELECT_RADIO_BUTTON);
		wirteTex(FIRST_NAME_INPUT_FIELD, "Kishoar");
		wirteTex(LAST_NAME_INPUT_FIELD, "Tithee");

		WebElement dropdownElementOfDay = clickOnElement(DOB_DAY);
		// Create a Select object to work with the dropdown
		Select dropdownOfDay = new Select(dropdownElementOfDay);
		dropdownOfDay.selectByValue("1"); 
		
		WebElement dropdownElementOfMonth = clickOnElement(DOB_MONTH);
		// Create a Select object to work with the dropdown
		Select dropdownOfMonth = new Select(dropdownElementOfMonth);
		dropdownOfMonth.selectByValue("April"); 
		
		WebElement dropdownElementOfYear = clickOnElement(DOB_YEAR);
		// Create a Select object to work with the dropdown
		Select dropdownOfYear = new Select(dropdownElementOfYear);
		dropdownOfYear.selectByValue("1999"); 

		wirteTex(EMAIL_INPUT_FIELD, email);
		wirteTex(COMPANY_NAME_INPUT_FIELD, companyName);
		clickOnElement(NEWSLETTER_STATUS_CHECKBOX);
		wirteTex(PASSWORD_INPUT_FIELD, password);
		wirteTex(CONFIRM_PASSWORD_INPUT_FIELD, confirmPassword);
		clickOnElement(REGISTER_BUTTON);
	}
}
