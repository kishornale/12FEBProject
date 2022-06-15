package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage 
{
	private WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement FirstName;
	public void EnterFirstName()
	{
		FirstName.sendKeys("Kishor");
	}
	
	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement LastName;
	public void EnterLastName() 
	{
		LastName.sendKeys("Nale");
	}
	
	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement PostalCode;
	public void EnterPostalCode()
	{
		PostalCode.sendKeys("415523");
	}

	@FindBy(xpath = "//button[@id='cancel']")
	private WebElement CancelButton;
	public void ClickCancelButton()
	{
		CancelButton.click();
	}
	
	@FindBy(xpath = "//button[@id='Continue']")
	private WebElement ContinueButton;
	public void ClickContinueButton()
	{
		ContinueButton.click();
	}
	
	public InformationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
}
