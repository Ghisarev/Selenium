package Assertions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSoft extends Baseclass
	{
	@Test
	public void hardAseert()
	{
		String expected_result="https://demowebshop.tricentis.com/";
		String a="desul";
		String b=null;
		//launch the browser
		 WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//enter into dws
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert ass=new SoftAssert();
		String actual_result=driver.getCurrentUrl();
		assertEquals(expected_result,actual_result);
		ass.assertAll();
		driver.findElement(By.id("small-searchterms")).sendKeys("vaishnavi");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		ass.assertAll();
	}
	

	}
