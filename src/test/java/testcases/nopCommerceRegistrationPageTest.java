package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.nopCommerceRegistrationPage;
import utilities.BaseDriverSetup;
import utilities.GenerateTestData;

public class nopCommerceRegistrationPageTest extends BaseDriverSetup {

	@DataProvider(name = "dynamicTestData")

    @Test(dataProvider = "dynamicTestData", dataProviderClass = GenerateTestData.class)
    public void testRegisterwithValidCredentials(String firstName, String lastName, String email, String companyName, String password, String confirmPassword, String successMessage) throws InterruptedException {
        nopCommerceRegistrationPage nopCommerceRegistrationpage = new nopCommerceRegistrationPage();
        
        getDriver().get(nopCommerceRegistrationpage.HOMEPAGE_URL);
		nopCommerceRegistrationpage.clickOnElement(nopCommerceRegistrationpage.REGISTER_TAB);
		
		
		nopCommerceRegistrationpage.clickOnElement(nopCommerceRegistrationpage.GENDER_SELECT_RADIO_BUTTON);
		nopCommerceRegistrationpage.wirteTex(nopCommerceRegistrationpage.FIRST_NAME_INPUT_FIELD, firstName);
		nopCommerceRegistrationpage.wirteTex(nopCommerceRegistrationpage.LAST_NAME_INPUT_FIELD, lastName);

		WebElement dropdownElementOfDay = nopCommerceRegistrationpage.clickOnElement(nopCommerceRegistrationpage.DOB_DAY);
		// Create a Select object to work with the dropdown
		Select dropdownOfDay = new Select(dropdownElementOfDay);
		dropdownOfDay.selectByValue("1"); 
		
		WebElement dropdownElementOfMonth = nopCommerceRegistrationpage.clickOnElement(nopCommerceRegistrationpage.DOB_MONTH);
		// Create a Select object to work with the dropdown
		Select dropdownOfMonth = new Select(dropdownElementOfMonth);
		dropdownOfMonth.selectByValue("4"); 
		
		WebElement dropdownElementOfYear = nopCommerceRegistrationpage.clickOnElement(nopCommerceRegistrationpage.DOB_YEAR);
		// Create a Select object to work with the dropdown
		Select dropdownOfYear = new Select(dropdownElementOfYear);
		dropdownOfYear.selectByValue("1999"); 
		Thread.sleep(2000);
		nopCommerceRegistrationpage.wirteTex(nopCommerceRegistrationpage.EMAIL_INPUT_FIELD, email);
		nopCommerceRegistrationpage.wirteTex(nopCommerceRegistrationpage.COMPANY_NAME_INPUT_FIELD, companyName);
		Thread.sleep(2000);
		nopCommerceRegistrationpage.clickOnElement(nopCommerceRegistrationpage.NEWSLETTER_STATUS_CHECKBOX);
		nopCommerceRegistrationpage.wirteTex(nopCommerceRegistrationpage.PASSWORD_INPUT_FIELD, password);
		nopCommerceRegistrationpage.wirteTex(nopCommerceRegistrationpage.CONFIRM_PASSWORD_INPUT_FIELD, confirmPassword);
		nopCommerceRegistrationpage.takeScreenShot("Login Info");
		nopCommerceRegistrationpage.clickOnElement(nopCommerceRegistrationpage.REGISTER_BUTTON);
		nopCommerceRegistrationpage.takeScreenShot("Login with Success Message");
		
//		nopCommerceRegistrationpage.wirteTex(nopCommerceRegistrationpage.PHONE_EMAIL_INPUT_FIELD, username);
//		nopCommerceRegistrationpage.wirteTex(nopCommerceRegistrationpage.PASSWORD_INPUT_FIELD, password);
		
		Thread.sleep(3000);
		AssertJUnit.assertEquals(nopCommerceRegistrationpage.getElement(nopCommerceRegistrationpage.SUCCESS_MESSAGE).getText(), successMessage);  
		 
    }
}
