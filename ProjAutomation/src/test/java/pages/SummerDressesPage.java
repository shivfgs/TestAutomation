package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ExcelUtil;

public class SummerDressesPage {
	
	@FindBy(id="myaccount")
	WebElement lblMyAccount;
	
	private WebDriver driver;
	
	
/*
* Function Name : verifyMyAccount
* Description: This function will verify the Fname and Lname avaialble on myAccount Page
* Parameters: User Information like firstname,lastname 
* Author:
* */
	public void verifyMyAccount() throws Exception {
		String strFirstName=ExcelUtil.getCellData(1, 1);
		String strLastName=ExcelUtil.getCellData(1, 2);
		Assert.assertTrue(lblMyAccount.getText().contains(strFirstName));
		Assert.assertTrue(lblMyAccount.getText().contains(strLastName));
		
		
	}
	
	/*
	 * Function Name : CreateAccountPage
	 * Description: This is the constructor method for the class.
	 * Parameters: Web driver
	 * Author: Shiv
	 * */
	public SummerDressesPage(WebDriver driver) throws Exception {
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

