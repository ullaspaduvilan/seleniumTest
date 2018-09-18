package com.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class testMouseActions 
{	WebDriver driver;
	@BeforeGroups
	public void beforetest()
	{
		driver=driverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://localhost:8083/TestMeApp/");
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	
	@Test
	public void testMeApp()
	{
		Actions act=new Actions(driver);
		//act.moveToElement(target);
		//Actions act=new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"));
		act.moveToElement(e1).perform();
		WebElement e2=driver.findElement(By.xpath("//span[contains(text(),'Our Offices')]"));
		act.moveToElement(e2).perform();
		WebElement e3=driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"));
		act.moveToElement(e3).perform();
		String addr=driver.findElement(By.id("demo3")).getText();
		System.out.println(addr);
		//String w1=driver.getWindowHandle(); This will give current window address
		Set<String> set=driver.getWindowHandles();
		driver.switchTo();
		for (String w:set)
		{
			driver.switchTo().window(w);
		}		
		driver.switchTo().frame("farame");
	}
	

}
