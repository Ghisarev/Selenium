package TestNgFashion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio 
	{
	@Test
		public void ajio() 
		{
			WebDriver driver= new ChromeDriver();
			//maximize window 
			driver.manage().window().maximize();
			//implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().to("https://Ajio.com/");
		}

}
