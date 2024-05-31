package screenshot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassdws;
import com.crm.pom.DWsLoginPage;
@Listeners(com.crm.listenercode.capturefailedscreenshot.class)

public class ssforfailtest extends BaseClassdws
	{
		@Test
		public void dwsLoginCorrect()
		{
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			DWsLoginPage dws=new DWsLoginPage(driver);
			dws.username("admin01@gmail.com");
			dws.password("admin01");
			dws.login_button();
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
		}
		@Test
		public void dwsLoginWrong()
		{
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			DWsLoginPage dws=new DWsLoginPage(driver);
			dws.username("admin01@gmail.com");
			dws.password("admin02");
			dws.login_button();
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
		}
		@Test
		public void redbus()
		{
			driver.get("https://www.redbus.com/");
			assertEquals("vaish","vaishu");
			
		}
		

}
