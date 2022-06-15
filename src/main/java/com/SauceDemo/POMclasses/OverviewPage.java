package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage 
{
	private WebDriver driver;
	
	@FindBy(xpath = "//button[@id='cancel']")
	private WebElement CancelButton;
	public void ClickCancelButton()
	{
		CancelButton.click();
	}
	
	@FindBy(xpath = "//button[@id='finish']")
	private WebElement FinishButton;
	public void ClickFinishButton()
	{
		FinishButton.click();
	}
	
	public OverviewPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	

}
