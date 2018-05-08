package util;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonActions {
	private WebDriver driver;
	
	public void hoverWebElement(WebElement webElement) {
		Actions builder = new Actions(driver);
		builder.moveToElement(webElement).perform();
	}
	
	public void clickWebElement(WebElement webElement) {
		webElement.click();
	}
	
	public CommonActions(WebDriver driver) throws Exception {
		this.driver=driver;
	
	}
	/*
	* Function Name : verifyPageTitle
	* Description: This function verifies the Page title
	* Parameters: strTitle
	* Author:
	* */
		public void verifyPageTitle(String strTitle) {
			
			Assert.assertTrue(driver.getTitle().contains(strTitle));
			
			
			
		}
	
}


