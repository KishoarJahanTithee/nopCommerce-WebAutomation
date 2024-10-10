package utilities;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

public class GenerateTestData {
		
		public String firstName;
		public String lastName;
		public String email;
		public String companyName;
		public String password;
		public String confirmPassword;
		public String successMessage;
	
	    
	    public GenerateTestData(String firstName, String lastName, String email, String companyName, String password, String confirmPassword, String successMessage) {
			// TODO Auto-generated constructor stub
	    	this.firstName = firstName;
	        this.lastName = lastName;
	        this.email = email;
	        this.companyName = companyName;
            this.password = password;
            this.confirmPassword = confirmPassword;
            this.successMessage = successMessage;
		}
	 // Create an instance of UserData with the provided data
		GenerateTestData generateTestData = new GenerateTestData(firstName, lastName, email, companyName, password, confirmPassword, successMessage);
    
	    @DataProvider(name = "dynamicTestData")
	    public static Object[][] dynamicTestData() {
	        Faker faker = new Faker();
	        
	        Object[][] testData = new Object[1][7]; // Assuming 1 test case with 7 parameters
	        
	        for (int i = 0; i < 1; i++) {
	            testData[i][0] = faker.name().firstName();
	            testData[i][1] = faker.name().lastName();
	            testData[i][2] = testData[i][0] +"@gmail.com";
	            testData[i][3] = faker.company().name();
	            testData[i][4] = testData[i][0] +"1234";
	            testData[i][5] = testData[i][4]; // Confirm password
	            testData[i][6] = "Your registration completed"; // Success message
	        }
	        
	        return testData;
	    
	    }

}
