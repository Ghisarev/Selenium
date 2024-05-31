package TestNgBasicHelperMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InnvocationCount 
	{
	
		@Test(priority=3)
		public void demo()
		{

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/login");
			driver.close();
			
		}

		@Test(priority=1)
		public void rcb()
		{

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.royalchallengers.com/");
			driver.close();
			
		}
		@Test(priority=2,invocationCount=2)
		public void csk()
		{

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.chennaisuperkings.com/");
			driver.close();
			
		}

}
