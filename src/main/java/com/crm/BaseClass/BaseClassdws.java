package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClassdws 

	{
	public static WebDriver driver;//to make it global
	

	@BeforeClass
	public void beforeClass()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("welcome to the page");
	}
	@AfterMethod
	public void afterMethod()
	{
		
		System.out.println("thanks for coming");
	}
	@AfterClass
	public void afterClass() 
	{
		driver.quit();
	}
	

		

}
