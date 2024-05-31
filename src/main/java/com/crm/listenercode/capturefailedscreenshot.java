package com.crm.listenercode;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crm.BaseClass.BaseClassdws;

public class capturefailedscreenshot extends BaseClassdws implements ITestListener
	{
	@Override
	public void onTestFailure(ITestResult result)
	{
		//to fetch current datetime
		LocalDateTime date=LocalDateTime.now();
		String time=date.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File from=ts.getScreenshotAs(OutputType.FILE);
		File to=new File("./screenshot/dws"+time+".png");
		try 
		{
			FileHandler.copy(from, to);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
