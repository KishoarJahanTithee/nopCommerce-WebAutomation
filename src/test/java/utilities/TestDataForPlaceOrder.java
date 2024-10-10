package utilities;

import org.testng.annotations.DataProvider;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

public class TestDataForPlaceOrder {
	public String firstName;
	public String lastName;
	public String email;
	public String country;
	public String city;
	public String address1;
	public String ZIP;
	public String phoneNumber;
	public String cardHolderName;
	public String cardNumber;
	public String cardCode;
	public String successMessage;

    
    public TestDataForPlaceOrder(String firstName, String lastName, String email, String country, String city, String address1, String ZIP, String phoneNumber, String cardHolderName, String cardNumber,String cardCode, String successMessage) {
		// TODO Auto-generated constructor stub
    	this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.city = city;
        this.address1 = address1;
        this.ZIP = ZIP;
        this.phoneNumber = phoneNumber;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cardCode = cardCode;
        this.successMessage = successMessage;
	}
 // Create an instance of UserData with the provided data
    TestDataForPlaceOrder testDataForPlaceOrder = new TestDataForPlaceOrder( firstName, lastName, email, country, city, address1, ZIP, phoneNumber, cardHolderName, cardNumber, cardCode, successMessage);
    
    
    @DataProvider(name = "dynamicTestData")
    public static Object[][] dynamicTestData() {
        Faker faker = new Faker();
        
        Object[][] testData = new Object[1][12]; // Assuming 1 test case with 12 parameters
        
        for (int i = 0; i < 1; i++) {
            testData[i][0] = faker.name().firstName();
            testData[i][1] = faker.name().lastName();
            testData[i][2] = testData[i][0] +"@gmail.com";
            testData[i][3] = faker.address().country();
            testData[i][4] = faker.address().city();
            testData[i][5] = faker.address().streetAddress();
            testData[i][6] = faker.address().zipCode();
            testData[i][7] = faker.phoneNumber().phoneNumber();
            testData[i][8] = testData[i][0] + " "+ testData[i][1];
            testData[i][9] = faker.finance().creditCard();
            testData[i][10] = faker.number().digits(4);
            testData[i][11] = "Your order has been successfully processed!";
        }
        
        return testData;
    

    
    }
}
