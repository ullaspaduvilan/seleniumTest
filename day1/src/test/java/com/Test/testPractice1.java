package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testPractice1 
{
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver= driverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
	}
	/*@AfterTest
	public void aftertest()
	{
		driver.close();
	}*/

	@Test
	public void testIRCTC()
	{
		driver.findElement(By.linkText("PNR STATUS")).click();
	}
}
