package Listener;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.listenercode.BaseClass;
@Listeners(com.crm.listenercode.ListenerClass.class)

public class test extends BaseClass

{
	@Test
	public void addtocart() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		List<WebElement> add=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement add1:add)
		{
			add1.click();
		}
		Thread.sleep(2000);
	}
	
			

}
