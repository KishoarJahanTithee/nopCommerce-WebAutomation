package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class placeOrder extends nopCommerceBasePage {

	public String HOMEPAGE_URL = "https://demo.nopcommerce.com/";
	public By ELECTRONICS_MENU = By.xpath("//a[@href='/electronics']");
	public By CELL_PHONE = By.xpath("//a[@href='/cell-phones']");
	public By Nokia_Lumia_1020 = By.xpath("//div[@data-productid='20']");
	public By Nokia_Lumia_1020_Quantity = By.xpath("//input[@id='product_enteredQuantity_20']");
	public By Add_to_Cart_Button = By.xpath("//button[@id='add-to-cart-button-20']");
	public By Cross_Button = By.xpath("//span[@class='close']");
	public By Shopping_Cart = By.xpath("//li[@id='topcartlink']");
	public By Terms_Condition_CheckBox = By.xpath("//input[@id='termsofservice']");
	public By CHECKOUT_BUTTON = By.xpath("//button[@id='checkout']");
	public By CHECKOUT_AS_GUEST_BUTTON = By.xpath("//button[contains(text(),'Checkout as Guest')]");
	public By FIRST_NAME = By.xpath("//input[@id='BillingNewAddress_FirstName']");
	public By LAST_NAME = By.xpath("//input[@id='BillingNewAddress_LastName']");
	public By EMAIL = By.xpath("//input[@id='BillingNewAddress_Email']");
	public By COUNTRY = By.xpath("//select[@id='BillingNewAddress_CountryId']");
	public By CITY = By.xpath("//input[@id='BillingNewAddress_City']");
	public By Address1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
	public By ZIP_CODE = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
	public By PHONE_NUMBER = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
	public By New_Address_Continue = By.xpath("//button[contains(text(),'Continue')]");
	public By SHIPPING_METHOD = By.xpath("//input[@id='shippingoption_1']");
	public By Continue_Button = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
	public By Payment_Method = By.xpath("//input[@id='paymentmethod_1']");
	public By Payment_Method_Continue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
	public By Card_Holder_Name = By.xpath("//input[@id='CardholderName']");
	public By Card_Number = By.xpath("//input[@id='CardNumber']");
	public By Expire_Year = By.xpath("//select[@id='ExpireYear']");
	public By Card_Code = By.xpath("//input[@id='CardCode']");
	public By Card_Info_Next_Button = By.xpath("//button[@class='payment-info-next-step-button']");
	public By Confirm_Button = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
	public By Confirm_Order_Button = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
	public By Success_Message = By.xpath("//div[@class='title']");
	
		
	
	
	public void doLogin(String firstName, String lastName, String email, String country, String city, String address1, String ZIP, String phoneNumber, String cardHolderName, String cardNumber,String cardCode, String successMessage) {
		clickOnElement(CELL_PHONE);
		clickOnElement(Nokia_Lumia_1020);
		wirteTex(Nokia_Lumia_1020_Quantity, "2");
		clickOnElement(Add_to_Cart_Button);
		clickOnElement(Cross_Button);
		clickOnElement(Shopping_Cart);
		clickOnElement(Terms_Condition_CheckBox);
		clickOnElement(CHECKOUT_BUTTON);
		clickOnElement(CHECKOUT_AS_GUEST_BUTTON);
		wirteTex(FIRST_NAME, firstName);
		wirteTex(LAST_NAME, lastName);
		wirteTex(EMAIL, email);
		pressDownArrowKey(COUNTRY);
//		pressEnterKey(COUNTRY);
//		wirteTex(COUNTRY, country);
		wirteTex(CITY, city);
		wirteTex(Address1, address1);
		wirteTex(ZIP_CODE, ZIP);
		wirteTex(PHONE_NUMBER, phoneNumber);
		clickOnElement(New_Address_Continue);
		clickOnElement(SHIPPING_METHOD);
		clickOnElement(Continue_Button);
		clickOnElement(Payment_Method);
		clickOnElement(Payment_Method_Continue);
		wirteTex(Card_Holder_Name, cardHolderName);
		wirteTex(Card_Number, cardNumber);
		wirteTex(Expire_Year, "2030");
		wirteTex(Card_Code, cardCode);
		clickOnElement(Card_Info_Next_Button);
		clickOnElement(Confirm_Button);
		clickOnElement(Confirm_Order_Button);

	}




	private void pressDownArrowKey(By cOUNTRY2) {
		// TODO Auto-generated method stub
		
	}
}
