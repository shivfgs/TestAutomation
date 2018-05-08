package tests;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import util.TestUtil;

public class HomePageTest  {

		

	
	public static void main(String[] args) throws Throwable {
		TestBase tb=new TestBase(TestUtil.CONFIG_FILE_PATH+TestUtil.CONFIG_FILE_NAME);
		HomePage homepage=new HomePage(TestBase.driver);
		LoginPage loginpage=new LoginPage(TestBase.driver);
		// Click on Sign In link
		homepage.clickSignIn();
		// Enter email address
		loginpage.enterEmail("qw1e@qwe.com");
		// Click on CreateanAccount button
		loginpage.clickCreateanAccount();
		// Verify Create account page opened
		loginpage.verifyCreateAccountPage();
		// Enter the user details for registration
		loginpage.createAccountDetails("ss","kumar","pass@123","street1","Delhi","","","","","");
		loginpage.clickRegister();
		System.out.println(tb.getPageTitle());
	}
	
}

