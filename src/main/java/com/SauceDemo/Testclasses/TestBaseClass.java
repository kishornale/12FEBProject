package com.SauceDemo.Testclasses;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMclasses.LoginPage;

public class TestBaseClass 
{
	public WebDriver driver;
	Logger log = Logger.getLogger("SauceDemoProjectv1");
		
	@Parameters("browserName")
	@BeforeMethod
	public void SetUp(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"./drivers/chromedriver.exe");
			driver =  new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver",
					"./drivers/geckodriver.exe");
				driver =  new FirefoxDriver();
		}
			
			PropertyConfigurator.configure("log4j.properties");
			log.info("Browser is opened");		
			driver.get("https://www.saucedemo.com/");
			log.info("URL is entered");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			//object of loginpage as methods are in that page only
			LoginPage lp = new LoginPage(driver);
			lp.sendUsername();
			log.info("username is entered");
			lp.sendPassword(); 
			log.info("password is entered");
			lp.clickloginbutton();
			log.info("login button clicked");
	}

	@AfterMethod
	public void tearDown()
		{
			driver.quit();
			log.info("End of Program");
		
		}	
	
}
