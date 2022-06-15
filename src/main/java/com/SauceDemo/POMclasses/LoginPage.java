package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver;
//	private Actions act; //declare globally with private to perform mouse actions
	
	@FindBy (xpath = "//input[@id='user-name']")
	private WebElement username;
	public void sendUsername()
		{
			username.sendKeys("standard_user");
		}
	

	@FindBy (xpath = "//input[@id='password']")
	private WebElement password;
	public void sendPassword()
		{
			password.sendKeys("secret_sauce");
		}
	
	@FindBy (xpath = "//input[@id='login-button']")
	private WebElement loginbutton;
	public void clickloginbutton()
		{
			loginbutton.click();
//			act.click();		//to perform click by mouse action
		}
	
	public LoginPage(WebDriver driver)	// declare constructor
		{
			this.driver = driver;		//assign value of local to global
			PageFactory.initElements(driver,this);
//			act = new Actions(driver);  //Initialize in constructor
		}
	
	
	
	
}
