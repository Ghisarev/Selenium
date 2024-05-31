package TestNgFashion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kalki
	{
	@Test
	public void kalki() 
	{
		WebDriver driver= new ChromeDriver();
		//maximize window 
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.kalkifashion.com/in/");
	}

}
