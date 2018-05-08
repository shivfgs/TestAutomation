package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage {
	private WebDriver driver;
 // POM : Web elements on this page
	@FindBy(xpath=".//a[@class='login']")
	WebElement lnkSignIn;
	
	@FindBy(xpath=".//a[@title='Dresses']")
	WebElement mnuDresses;
	@FindBy(xpath=".//a[@title='SUMMER DRESSES']")
	WebElement mnuSummerDresses;
	// To click on Sign In link
	public void clickSignIn() {
		lnkSignIn.click();
	}
	// To navigate on megamenu - Dresses
		public void megaMenu() {
			
			mnuDresses.click();
		}
		// To navigate on submenu Summer dresses
		public void subMenu() {
					
			mnuSummerDresses.click();
		}
		// To navigate on submenu Summer dresses
		public void hoverMenu() {
							
			Actions builder = new Actions(driver);
			builder.moveToElement(mnuDresses).perform();
		}		
			
		/*
		 * Function Name : CreateAccountPage
		 * Description: This is the constructor method for the class.
		 * Parameters: Web driver
		 * Author: Shiv
		 * */
		public HomePage(WebDriver driver) throws Exception {
			this.driver=driver;
			initializeWebElements();
		}
		/*
		 * Function Name : initializeWebElements
		 * Description: This function initializes Web elements in this pag class.
		 * Parameters: Driver and This
		 * Author: Shiv
		 * */
		public void initializeWebElements() {
			PageFactory.initElements(driver, this);
		}
		
}

