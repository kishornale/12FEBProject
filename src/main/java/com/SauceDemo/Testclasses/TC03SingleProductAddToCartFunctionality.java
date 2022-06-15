package com.SauceDemo.Testclasses;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.SauceDemo.POMclasses.HomePage;


@Listeners(com.SauceDemo.UtilityClasses.Listeners.class)
public class TC03SingleProductAddToCartFunctionality extends TestBaseClass
{	
	@Test
	public void SingleProductAddToCartFunctionalityTest() throws InterruptedException
	{	
		HomePage hp = new HomePage(driver);
		hp.ClickBackpackAddtoCartButton();
		log.info("Clicked on Add to cart for bagpack");
		
		log.info("Apply validation");
		
		String ExpectedText = "1";
		String ActualText = hp.Cartbadge();
		
		Assert.assertEquals(ActualText, ExpectedText);
		
		
		hp.ClickOpenMenuButton();
		log.info("menu button clicked");
		hp.ClickLogout();
		log.info("logout button clicked");
	}	
			
}
