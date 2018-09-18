package com.Test;

import org.testng.annotations.Test;

public class NewTest2 
{	@Test(priority=1)
	public void testRegistration()
	{
		System.out.println("This is to Register");
	}
	@Test(priority=2)
	public void testLogin()
	{
		System.out.println("This is to Login");
	}

}
