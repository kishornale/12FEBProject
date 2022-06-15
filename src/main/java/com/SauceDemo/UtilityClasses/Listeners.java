package com.SauceDemo.UtilityClasses;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.SauceDemo.Testclasses.TestBaseClass;

public class Listeners implements ITestListener
{
	WebDriver driver;
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test is started");
	}
	
	public void onFinish(ITestResult result)
	{
		System.out.println("Test is finished");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Testcase is successfully passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Testcase is failed and taking ss");
		this.driver = ((TestBaseClass)result.getInstance()).driver;
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
		String date = d1.format(d);

		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File ("./screenshots/ "+date+".jpg");
		try 
		{
			FileHandler.copy(source, destfile);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		System.out.println("SS is taken");
	}

}
