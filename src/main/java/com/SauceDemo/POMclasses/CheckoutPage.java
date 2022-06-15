package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage 
{
	private WebDriver driver;
	

	@FindBy (xpath = "//button[@id='continue-shopping']")
	private WebElement ContinueShoppingButton;
	public void ClickContinueShoppingButton()
	{
		ContinueShoppingButton.click();
	}

	@FindBy (xpath = "checkout']")
	private WebElement CheckoutButton;
	public void ClickCheckoutButton()
	{
		CheckoutButton.click();
	}
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
}
