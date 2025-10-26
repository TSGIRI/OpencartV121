package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC001_LoginTest extends BaseClass{

	@Test(groups= {"Sanity","Regression","Master"})
	public void verify_Login()
	{

		try
		{
			//HomePage
			HomePage hp = new HomePage(driver);
			hp.ClickLogin();

			//			LoginPage
			LoginPage lp = new LoginPage(driver);
			lp.setEmailId("thommandru.101@gmail.com");
			lp.setPassword("Welcome@20251");
			lp.clickLogin();

			//My Account
			MyAccountPage myAc = new MyAccountPage(driver);

			boolean targetPage = myAc.isMyAccountPageExists();
			Assert.assertTrue(targetPage);
			myAc.clickLogout();
			
//			Thread.sleep(5000);
			
		}
		catch(Exception e)
		{
			Assert.fail();
		}


	}

}
