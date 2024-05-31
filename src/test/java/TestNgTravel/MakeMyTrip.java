package TestNgTravel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTrip 
	{
	@Test
	public void makemytrip() 
	{
		WebDriver driver= new ChromeDriver();
		//maximize window 
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://Ajio.com/");
	}

}
