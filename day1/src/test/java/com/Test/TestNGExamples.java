package com.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExamples {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethode()
	{
		 driver=driverUtility.getDriver("chrome");
		  
	}
	@AfterMethod
	public void afterMethode()
	{
		driver.close();
	}
	
	@Test
	  public void testGoogle() 
	  {
		
	  driver.get("https://www.google.com/");
		  
	  }
	@Test
	  public void testTour() 
	  {
		  driver.get("http://newtours.demoaut.com/");		  
	  }
}
