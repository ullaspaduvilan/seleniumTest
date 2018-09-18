package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testWebPageAutomation 
{
	@Test
	public void main()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\DATA-Ullas\\Selenium\\Setup\\WebDriver\\chromedriver.exe");
		WebDriver driver=driverUtility.getDriver("chrome");
		//WebDriver driver=driverUtility.getDriver();
		driver.get("http://newtours.demoaut.com/mercuryreservation.php ");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		String pagetitle=driver.getTitle();
		Assert.assertEquals(pagetitle, "Find a Flight: Mercury Tours:");
		driver.findElement(By.cssSelector("Input[Value='oneway']")).click();
		//driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.xpath("//div[@id='SIvCob']/a[4]")).click();
		WebElement from = driver.findElement(By.name("fromPort"));
		Select sel=new Select(from);
		//sel.selectByIndex(1);
		sel.selectByVisibleText("Frankfurt");
		driver.findElement(By.name("fromPort")).sendKeys("Paris");
		List<WebElement> list=sel.getOptions();
		System.out.println(list.size());
		for(WebElement e:list)
		{
			String city=e.getText();
			if(city.equals("Sydney"))
			{
				sel.selectByVisibleText(city);
				break;
			}
					
		}
				
	}
}
