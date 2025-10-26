package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	
	//h2[normalize-space()='Welcome to our store']
	
	public MyAccountPage(WebDriver driver) 
	{
	super(driver);
		}
	
	
	@FindBy(xpath="//h2[normalize-space()='Welcome to our store']")     //Myccount Page Heading
	WebElement msgHeading;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	WebElement lnkLogout;
	
	public boolean isMyAccountPageExists()
	{
		try
		{
			return (msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void  clickLogout()
	{
		lnkLogout.click();
	}
	
}
