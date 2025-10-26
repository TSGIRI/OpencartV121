package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

	WebDriver driver;

	//****************** constructer *******************

	public HomePage(WebDriver driver)
	{
		super(driver);

//		this.driver = driver;
//		PageFactory.initElements(driver, this);
	}

	// *****************Locaters *****************************    
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement LnkRegister;

	@FindBy(xpath="//a[normalize-space()='Log in']")
	WebElement LnkLogin;


	//******************  Action Methods  ************
	
	public void ClickRegister()
	{
		LnkRegister.click();
	}
	
	public void ClickLogin()
	{
		LnkLogin.click();
	}
	

	//	public void ClickMyAccount()
	//	{
	//		LnkMyaccount.click();
	//	}
	//
	//	public void ClickRegister()
	//	{
	//		LnkRegister.click();
	//	}

	//	public void setUsername(String user)
	//	{
	//		txt_username_Loc.sendKeys(user);
	//	}
	//
	//	public void setPassword(String pwd)
	//	{
	//		txt_password_Loc.sendKeys(pwd);
	//	}
	//
	//	public void clickLogin()
	//	{
	//		btn_login_Loc.click();
	//	}

}
