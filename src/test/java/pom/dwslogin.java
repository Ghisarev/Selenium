package pom;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DWsLoginPage;

public class dwslogin
	{
		@Test
		public void loginPom()
		{
			//launch the browser
			ChromeDriver driver = new ChromeDriver();
			//maximize the window
			driver.manage().window().maximize();
			//implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/login");
			//create object 
			DWsLoginPage dws=new DWsLoginPage(driver);
//			dws.username.sendKeys("admin01@gmail.com");
//			dws.password.sendKeys("admin01");
//			dws.login_button.click();
			dws.username("admin01@gmail.com");
			
			dws.password("admin01");
			dws.login_button();
			
		}

}
