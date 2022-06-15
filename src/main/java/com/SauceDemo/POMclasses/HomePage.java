package com.SauceDemo.POMclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
private WebDriver driver;
	
	@FindBy (xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement OpenMenuButton;
	public void ClickOpenMenuButton() throws InterruptedException
	{
		OpenMenuButton.click();
//		Thread.sleep(2000);
	}
	
	@FindBy (xpath = "//a[@id='inventory_sidebar_link']")
	private WebElement Inventory;
	public void ClickInventory()
	{
		Inventory.click();
	}
	
	@FindBy (xpath = "//a[@id='about_sidebar_link']")
	private WebElement About;
	public void ClickAbout()
	{
		About.click();
	}
	
	@FindBy (xpath = "//a[@id='logout_sidebar_link']")
	private WebElement Logout;
	public void ClickLogout()
	{
		Logout.click();
	}
	
	@FindBy (xpath = "//a[@id='reset_sidebar_link']")
	private WebElement Reset;
	public void ClickReset()
	{
		Reset.click();
	}

	@FindBy (xpath = "//button[@id='react-burger-cross-btn']")
	private WebElement CloseMenuButton;
	public void ClickCloseMenuButton()
	{
		CloseMenuButton.click();
	}
	
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement BackpackAddtoCartButton;
	public void ClickBackpackAddtoCartButton()
	{
		BackpackAddtoCartButton.click();
	}
	
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement BikeLightAddtoCartButton;
	public void ClickBikeLightAddtoCartButton()
	{
		BikeLightAddtoCartButton.click();
	}
	
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement TshirtAddtoCartButton;
	public void ClickTshirtAddtoCartButton()
	{
		TshirtAddtoCartButton.click();
	}
	
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement JacketAddtoCartButton;
	public void ClickJacketAddtoCartButton()
	{
		JacketAddtoCartButton.click();
	}
	
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement OnesieAddtoCartButton;
	public void ClickOnesieAddtoCartButton()
	{
		OnesieAddtoCartButton.click();
	}
	
	@FindBy (xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement RedTshirtAddtoCartButton;
	public void RedTshirtAddtoCartButton()
	{
		RedTshirtAddtoCartButton.click();
	}
	
	@FindBy (xpath = "//select[@class='product_sort_container']")
	private WebElement SortDropDown;
	public void ClickSortDropDown()
	{
		SortDropDown.click();
	}
	
	@FindBy (xpath = "//a[@class='shopping_cart_link']")
	private WebElement CartButton;
	public void ClickCartButton()
	{
		CartButton.click();
	}
	//method to get total no of products in cart
	 public String Cartbadge()
	 {
		String TotalProducts = CartButton.getText();
		return TotalProducts;
	 }
	
	 @FindBy (xpath = "//button[text()='Add to cart']")
		private List<WebElement> AddAlltoCartButton;
		public void ClickAllAddtoCartButton()
		{
//			for(WebElement String : AddAlltoCartButton)
//			{
			for(int i=0;i<AddAlltoCartButton.size();i++)
			{
				AddAlltoCartButton.get(i).click();
			
			}
//			}	
		}
	 
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
 
	
	
	
}
