package com.SauceDemo.Testclasses;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.SauceDemo.POMclasses.HomePage;


@Listeners(com.SauceDemo.UtilityClasses.Listeners.class)
public class TC04MultipleProductAddToCartfunctionality extends TestBaseClass
{
	@Test
	public void MultipleProductAddToCartfunctionalityTest() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.ClickAllAddtoCartButton();
		log.info("clicked on add to cart");
		
		log.info("Apply validation");
		String ExpectedText = "6";
		String ActualText = hp.Cartbadge();
		
		Assert.assertEquals(ActualText, ExpectedText);
		
		hp.ClickOpenMenuButton();
		log.info("menu button clicked");
		hp.ClickLogout();
		log.info("logout button clicked");
	}
		
}
