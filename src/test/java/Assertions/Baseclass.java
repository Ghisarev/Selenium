package Assertions;

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
import org.testng.annotations.Parameters;

public class Baseclass
	{
	WebDriver driver;//to make it global
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("connecting the database");	
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Precondition for test runner");	
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Precondition for test runner");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		
	}
	@AfterMethod
	public void afterMethod()
	{
		driver.findElement(By.className("ico-logout")).click();
		
	}
	@AfterClass
	public void afterClass() 
	{
		driver.close();
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Post condition for test runner");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Disconnect database");
	}

}
