package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	//WebDriver driver;

	//****************** constructer *******************

	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}

	//*****************Locaters ************************

	@FindBy(xpath="//input[@id='gender-male']")
	WebElement radiobuttonGender;

	@FindBy(xpath="//input[@id='FirstName']")
	WebElement txtFirstName;

	@FindBy(xpath="//input[@id='LastName']")
	WebElement txtLastName;

	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;

	@FindBy(xpath="//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement txtConfirmPassword;

	@FindBy(xpath="//input[@id='register-button']")
	WebElement btnRegister;

	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;

	//li[normalize-space()='The specified email already exists']
	//	@FindBy(xpath="//div[@class='result' and text()='Your registration completed']")
	@FindBy(xpath="//div[text()='Your registration completed']")
	WebElement msgConformation;

	



	//******************  Action Methods  ************

	public void  setFirstName(String firstname)
	{
		txtFirstName.sendKeys(firstname);
	}

	public void  setLasttName(String lastname)
	{
		txtLastName.sendKeys(lastname);
	}

	public void  setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}

	public void  setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}

	public void  setConfirmPassword(String conpwd)
	{
		txtConfirmPassword.sendKeys(conpwd);
	}

	public void clickGender()
	{
		radiobuttonGender.click();
	}

	public void  clickregister()
	{
		btnRegister.click();
	}

	public void  clickContinue()
	{
		btnContinue.click();
	}

	

	public String getConformationMsg()    // this method is just return the value.
	{
		try {
			System.out.println(msgConformation.getText());
			return (msgConformation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
