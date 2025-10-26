package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	//	WebDriver driver;
	
	//****************** constructer *******************

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	// *****************Locaters *****************************    

	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmailID;

	@FindBy(xpath="//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath="//input[@value='Log in']")
	WebElement btnLogin;


	//******************  Action Methods  ************

	public void setEmailId(String emailID)
	{
		txtEmailID.sendKeys(emailID);
	}

	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin()
	{
		btnLogin.click();
	}
}
