package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastPage 
{
	private WebDriver driver;
	
	@FindBy(xpath = "//button[@id='back-to-products']")
	private WebElement BackToHomeButton;
	public void ClickBackToHomeButton()
	{
		BackToHomeButton.click();
	}
	
	public LastPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
