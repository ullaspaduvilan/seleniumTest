package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testDataClass
{	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void BeforeTest(String v1)
	{
		driver=driverUtility.getDriver(v1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		driver.close();
	}
	@Test(dataProvider="getData")
	public void newTour(String userID, String PWd)
	{	driver.findElement(By.name("userName")).sendKeys(userID);
		driver.findElement(By.name("password")).sendKeys(PWd);
		driver.findElement(By.name("login")).click();
		String pagetitle=driver.getTitle();
		Assert.assertEquals(pagetitle, "Find a Flight: Mercury Tours:");
		driver.findElement(By.cssSelector("Input[Value='oneway']")).click();
		if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
		{
			driver.findElement(By.linkText("SIGN-OFF")).click();
		}
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj= 
		{
			{"mercury", "mercury"},
			{"Test123", "Test123"}
							
		};
		return obj;
	}
}
