package testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.placeOrder;
import utilities.BaseDriverSetup;
import utilities.TestDataForPlaceOrder;

public class placeOrderTest extends BaseDriverSetup {

	@DataProvider(name = "dynamicTestData")

    @Test(dataProvider = "dynamicTestData", dataProviderClass = TestDataForPlaceOrder.class)
    public void placeOrderWithValidCredentials(String firstName, String lastName, String email, String country, String city, String address1, String ZIP, String phoneNumber, String cardHolderName, String cardNumber, String cardCode, String successMessage) throws InterruptedException {
        placeOrder PlaceOrder = new placeOrder();
        
        getDriver().get(PlaceOrder.HOMEPAGE_URL);
		Thread.sleep(4000);

        PlaceOrder.moveToElement(getDriver(), PlaceOrder.ELECTRONICS_MENU);
		Thread.sleep(3000);

        PlaceOrder.clickOnElement(PlaceOrder.CELL_PHONE);
        PlaceOrder.clickOnElement(PlaceOrder.Nokia_Lumia_1020);
        PlaceOrder.clickOnElement(PlaceOrder.Nokia_Lumia_1020_Quantity).clear();
        PlaceOrder.wirteTex(PlaceOrder.Nokia_Lumia_1020_Quantity, "2");
		Thread.sleep(2000);
        PlaceOrder.clickOnElement(PlaceOrder.Add_to_Cart_Button);
		Thread.sleep(2000);
        PlaceOrder.clickOnElement(PlaceOrder.Cross_Button);
		Thread.sleep(5000);
        PlaceOrder.clickOnElement(PlaceOrder.Shopping_Cart);
        PlaceOrder.clickOnElement(PlaceOrder.Terms_Condition_CheckBox);
        PlaceOrder.clickOnElement(PlaceOrder.CHECKOUT_BUTTON);
        PlaceOrder.clickOnElement(PlaceOrder.CHECKOUT_AS_GUEST_BUTTON);
        
        PlaceOrder.wirteTex(PlaceOrder.FIRST_NAME, firstName);
        PlaceOrder.wirteTex(PlaceOrder.LAST_NAME, lastName);
        PlaceOrder.wirteTex(PlaceOrder.EMAIL, email);
        
//       PlaceOrder.clickOnElement(PlaceOrder.COUNTRY);
       WebElement countryElement = PlaceOrder.clickOnElement(PlaceOrder.COUNTRY);
       Select dropdownOfCountry = new Select(countryElement);
       dropdownOfCountry.selectByValue("161"); 
		
//        PlaceOrder.pressDownArrowKey(getDriver(), countryElement);
//        PlaceOrder.pressEnterKey(getDriver(), countryElement);

//        WebElement dropdownElementOfCountry = PlaceOrder.clickOnElement(PlaceOrder.COUNTRY);
//		// Create a Select object to work with the dropdown
//		Select dropdownOfCountry = new Select(dropdownElementOfCountry);
//		dropdownOfCountry.selectByValue("161"); 
        
//        PlaceOrder.clickOnElement(PlaceOrder.COUNTRY);
//        PlaceOrder.wirteTex(PlaceOrder.COUNTRY, country);
        PlaceOrder.wirteTex(PlaceOrder.CITY, city);
        PlaceOrder.wirteTex(PlaceOrder.Address1, address1);
        PlaceOrder.wirteTex(PlaceOrder.ZIP_CODE, ZIP);
        PlaceOrder.wirteTex(PlaceOrder.PHONE_NUMBER, phoneNumber);
        PlaceOrder.clickOnElement(PlaceOrder.New_Address_Continue);
		Thread.sleep(3000);

        PlaceOrder.clickOnElement(PlaceOrder.SHIPPING_METHOD);
        PlaceOrder.clickOnElement(PlaceOrder.Continue_Button);
		Thread.sleep(1000);
		
        PlaceOrder.clickOnElement(PlaceOrder.Payment_Method);
		Thread.sleep(1000);
        PlaceOrder.clickOnElement(PlaceOrder.Payment_Method_Continue);
        PlaceOrder.wirteTex(PlaceOrder.Card_Holder_Name, cardHolderName);
        PlaceOrder.wirteTex(PlaceOrder.Card_Number, cardNumber);
        PlaceOrder.wirteTex(PlaceOrder.Expire_Year, "2030");
        PlaceOrder.wirteTex(PlaceOrder.Card_Code, cardCode);
        PlaceOrder.clickOnElement(PlaceOrder.Confirm_Button);
        PlaceOrder.clickOnElement(PlaceOrder.Confirm_Order_Button);
        
		Thread.sleep(5000);
		AssertJUnit.assertEquals(PlaceOrder.getElement(PlaceOrder.Success_Message).getText(), successMessage);
//		Assert.assertEquals("Your order has been successfully processed!", PlaceOrder.Success_Message);

    }
}
