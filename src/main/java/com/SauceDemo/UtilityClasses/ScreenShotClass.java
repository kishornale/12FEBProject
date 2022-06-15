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

public class ScreenShotClass 
{
//	static WebDriver driver;
	public static void TakeSS(WebDriver driver) throws IOException 
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
		String date = d1.format(d);

		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File ("./screenshots/ "+date+".jpg");
		FileHandler.copy(source, destfile);	
		
		System.out.println("SS is taken");
	}	

}
