package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 
{
	//Data---->WebElement
	WebDriver driver;
	@FindBy(how=How.NAME,using="userName")
	WebElement userName;
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	@FindBy(how=How.NAME,using="login")
	WebElement siginIn;
	
	public String clickSignin()
	{
		userName.sendKeys("mercury");
		password.sendKeys("mercury");
		siginIn.click();
		return driver.getTitle();
	}

	public LoginPage(WebDriver driver) 
	{
		super();
		this.driver=driver;
	}
	
	
}
