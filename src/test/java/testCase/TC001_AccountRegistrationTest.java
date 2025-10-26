package testCase;

import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {


	@Test(groups= {"Regression","Master"})
	public void verify_account_refistration()
	{

		HomePage hp=new HomePage(driver);
		hp.ClickRegister();

		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);

		regpage.clickGender();
		regpage.setFirstName("seshagiri");
		regpage.setLasttName("thommandru");
		regpage.setEmail(randomString() +"@gmail.com");

		String password = randomAlphaNumaric();

		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		regpage.clickregister();

		regpage.clickContinue();

		MyAccountPage ap=new MyAccountPage(driver);
		ap.clickLogout();

		//  String confmsg = regpage.getConformationMsg();
		//	System.out.println(confmsg);
		//	Assert.assertEquals(confmsg, "Your registration completed");




	}



}
