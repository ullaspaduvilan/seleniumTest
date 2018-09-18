
package com.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class webdriver_Test
{	
	@Test
	public void testChrome()
	{	System.setProperty("webdriver.chrome.driver", "C:\\DATA-Ullas\\Selenium\\Setup\\WebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
}
