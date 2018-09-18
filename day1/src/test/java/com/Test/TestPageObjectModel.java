package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageObjects.LoginPage;

public class TestPageObjectModel 
{
	WebDriver driver;
	LoginPage loginPage;
	
	@BeforeTest
	public void beforeTest() {
		driver=driverUtility.getDriver("chrome");
		loginPage=PageFactory.initElements(driver,LoginPage.class);//pagefactory is class used to load all the page classes to produce the object-page object
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	public void testLogin() {
		String title=loginPage.clickSignin();
		Assert.assertTrue(title.contains("Flight"));
	}

	@AfterTest
	public void afterTest() 
	{
		driver.close();
	}
	}
