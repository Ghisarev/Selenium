package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Shopperstack
	{
		WebDriver driver;
		@BeforeSuite
		public void beforeSuit()
		{
			System.out.println("Connecting to the datbase");
		}
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("Precondition for test runner");
		}
		@BeforeClass 
		public void beforeClass()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.navigate().to("https://www.shoppersstack.com/");
		}
		@BeforeMethod
		public void beforeMethod() 
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
			driver.findElement(By.id("loginBtn")).click();
			driver.findElement(By.id("Email")).sendKeys("ghisarev123@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("vaishnavi");
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			
		}
		@AfterMethod
		public void afterMethod()
		{
			driver.findElement(By.className("icc-logout"));
			
		}
		@AfterClass
		public void afterClass()
		{
			driver.close();
		}
		@AfterTest
		public void afterTest() {
			System.out.println("Post Conditions for Test Runner");
		}
		@AfterSuite
		public void afterSuite() {
			System.out.println("Disconnect for database");
		}
		
		

}
