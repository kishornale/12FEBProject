package com.SauceDemo.Testclasses;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.SauceDemo.POMclasses.HomePage;

@Listeners(com.SauceDemo.UtilityClasses.Listeners.class)
public class TC02LogoutFunctionality extends TestBaseClass
{	
	@Test
	public void LogoutFunctionalityTest() throws InterruptedException 
	{

		HomePage hp = new HomePage(driver);
		hp.ClickOpenMenuButton();
		log.info("menu button clicked");
		hp.ClickLogout();
		log.info("logout button clicked");		
		log.info("Verify the test case");
		String ExpectedURL = "https://www.saucedemo.com/";
		String ActualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(ActualURL, ExpectedURL);
	}
		
}
