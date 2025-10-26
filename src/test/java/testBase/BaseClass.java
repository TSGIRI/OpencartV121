package testBase;

//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	//	Base Class is nothing but, what are all the methods are reusable in multible test cases, we need to create one base Class.

	public WebDriver driver;
	public Properties p;        // import the Properties class for load the config.properties file.(p is the variable.)
	

	@BeforeClass(groups= {"Sanity","Regression","Master"})
	@Parameters({"OS","browser"})
	//	public void setup() throws InterruptedException
	public void setup(String OS, String br) throws InterruptedException  //execure the script from xml file for spacific browser.
//, IOException

	{

		// Loading the config.properties file
//		FileReader file = new FileReader("./src//test//rsoures/config.properties");
//		p=new Properties();
//		p.load(file);

		switch(br.toLowerCase())
		{
		case "chrome" : driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		case "firefox" : driver=new FirefoxDriver(); break;
		default : System.out.println("Invalied browser name..."); return;
		}

		//driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");
//		driver.get(p.getProperty("appURL"));      // read the URL from confog.properties file.
		driver.manage().window().maximize();	
		Thread.sleep(5000);
	}

	@AfterClass(groups= {"Sanity","Regression","Master"})
	public void tearDown()
	{
		driver.quit();
	}


	public String randomString()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		//		System.out.println(generatedString);
		return generatedString;
	}

	public String randomAlphaNumaric()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		String generatedNumber = RandomStringUtils.randomNumeric(4);
		//		System.out.println(generatedString+"@"+generatedNumber);
		return (generatedString+"@"+generatedNumber);
	}

}
