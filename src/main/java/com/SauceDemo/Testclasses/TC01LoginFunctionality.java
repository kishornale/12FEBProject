package com.SauceDemo.Testclasses;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.SauceDemo.POMclasses.HomePage;



@Listeners(com.SauceDemo.UtilityClasses.Listeners.class)
public class TC01LoginFunctionality extends TestBaseClass
{
	@Test
	public void LoginFunctionalityTest() throws InterruptedException, IOException 
	{
			log.info("Verify the test case");
			String expectedURL = "https://www.saucedemo.com/inventory.html";
			String actualURL = driver.getCurrentUrl();
				
			Assert.assertEquals(actualURL, expectedURL);
//			ScreenShotClass.TakeSS(driver);
			HomePage hp = new HomePage(driver);
			hp.ClickOpenMenuButton();
			log.info("menu button clicked");
			hp.ClickLogout();
			log.info("logout button clicked");
	}	
						
}


