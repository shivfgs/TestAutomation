package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSummaryPage {
	private WebDriver driver;
	// POM: Web Elements on this page
	@FindBy(name="")
	WebElement lblCartSummary;
	@FindBy(name="")
	WebElement txtQuantity;
	@FindBy(name="")
	WebElement lblProductName;
	@FindBy(name="")
	WebElement lblColorName;
	
	
	
	/*
	 * Function Name : CartSummaryPage
	 * Description: This is the constructor method for the class.
	 * Parameters: Web driver
	 * Author: Shiv
	 * */
	public CartSummaryPage(WebDriver driver) throws Exception {
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

