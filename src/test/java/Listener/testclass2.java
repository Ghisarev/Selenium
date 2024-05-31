package Listener;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.ReadDataFromExternal.ReadFileUtility;
import com.crm.listenercode.BaseClass;

public class testclass2 extends BaseClass
	{
	@Test
	public void giftcard() throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
	    driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
//		File path=new File("C:\\Users\\91902\\Desktop.dws1.xlsx");
//		FileInputStream fis=new FileInputStream(path);
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sheet=wb.getSheet("Sheet1");
//		String rname=sheet.getRow(0).getCell(0).toString();
//		String remail=sheet.getRow(1).getCell(0).toString();
//		String sname=sheet.getRow(2).getCell(0).toString();
//		String smail=sheet.getRow(3).getCell(0).toString();
//		String input=sheet.getRow(4).getCell(0).toString();
		String rname=ReadFileUtility.excel("Sheet1", 0, 0);
		String remail=ReadFileUtility.excel("Sheet1", 1, 0);
		String sname=ReadFileUtility.excel("Sheet1", 2, 0);
		String smail=ReadFileUtility.excel("Sheet1", 3, 0);
		Thread.sleep(2000);
		String input=ReadFileUtility.excel("Sheet1", 4, 0);
		
	    driver.findElement(By.xpath("//input[@id='giftcard_1_RecipientName']")).sendKeys(rname);
	    driver.findElement(By.cssSelector("input[class='recipient-email']")).sendKeys(remail);
	    driver.findElement(By.cssSelector("input[class='sender-name']")).sendKeys(sname);
	    driver.findElement(By.cssSelector("input[class='sender-email']")).sendKeys(smail);
	    driver.findElement(By.cssSelector("input[class='qty-input']")).clear();
	    driver.findElement(By.cssSelector("input[class='qty-input']")).sendKeys(input);
	    driver.findElement(By.id("add-to-cart-button-1")).click();
	  
		
	}

}

