package com.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class NewTesting_Browser 
{
	@Test
	public void testChrome()
	{	System.setProperty("webdriver.chrome.driver", "C:\\DATA-Ullas\\Selenium\\Setup\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
	}
	@Test
	public void testFirefox()
	{	System.setProperty("webdriver.gecko.driver", "C:\\DATA-Ullas\\Selenium\\Setup\\WebDriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
	}
	@Test
	public void testIE()
	{	System.setProperty("webdriver.ie.driver", "C:\\DATA-Ullas\\Selenium\\Setup\\WebDriver\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
	}
}
