package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Allure;

import static utilities.BaseDriverSetup.getDriver;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static utilities.BaseDriverSetup.getDriver;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;


public class nopCommerceBasePage {

	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	public void wirteTex(By locator, String phoneNumber) {
		getElement(locator).sendKeys(phoneNumber);
	}
	
//	public void moveToElement(By locator) {
//		getElement(locator).perform();
//	}
	
	public void moveToElement(WebDriver driver, By locator) {
        // Create an instance of Actions class
        Actions actions = new Actions(driver);
        
        // Locate the WebElement using the provided locator
        WebElement element = driver.findElement(locator);
        
        // Perform mouse hover action on the element
        actions.moveToElement(element).perform();
    }
	
	public WebElement clickOnElement(By locator) {
	    WebElement element = getElement(locator);
	    element.click();
	    return element;
	}
	
//	public void sendKeysToElement(By locator, Integer keysToSend) {
//        getElement(locator).sendKeys(keysToSend);
//    }

	public void sendKeysToElement(By locator, Integer keysToSend) {
	    getElement(locator).sendKeys(keysToSend.toString());
	}
	
	public void pressDownArrowKey(WebDriver driver, WebElement element) {
        element.sendKeys(Keys.ARROW_DOWN);
    }
	
//	 public static WebElement waitForElement(By locator, Duration timeoutInSeconds) {
//	        WebDriverWait wait = new WebDriverWait((WebDriver) locator, timeoutInSeconds);
//	        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//	    }
	
	public void pressEnterKey(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.sendKeys(element, Keys.ENTER).perform();
    }
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}
	
	public void scrollToElemnt(By loactor) {
		WebElement el = getElement(loactor);
		JavascriptExecutor js =(JavascriptExecutor)getDriver();
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("arguments[0].scrollIntoView();", el);
	}
	
}
