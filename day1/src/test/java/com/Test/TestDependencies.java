package com.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDependencies
{	WebDriver driver;
	@AfterSuite
	public void afterSuite()
	{
		driver.quit();
	}
	@BeforeTest
	public void beforetest()
	{
		driver= driverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		System.out.println("before");
	}	
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after");
		driver.close();
	}
	@Test(priority=1)
	public void launchApplication()
	{
		//driver.get("http://newtours.demoaut.com");
		List<WebElement> list = driver.findElements(By.partialLinkText("LOGIN"));
		System.out.println(list.size());
	}
	@Test(priority=2)
	public void login()
	{
		System.out.println("Login");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("Signout");
	}

}
