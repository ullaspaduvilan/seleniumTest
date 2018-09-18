package com.Test;
// Project Auther - Ullas

//New
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driverUtility 
{
	public static WebDriver getDriver(String browser)
	{
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\DATA-Ullas\\Selenium\\Setup\\WebDriver\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\DATA-Ullas\\Selenium\\Setup\\WebDriver\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else if (browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\DATA-Ullas\\Selenium\\Setup\\WebDriver\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else
		{
			return null;
		}
	}
}
