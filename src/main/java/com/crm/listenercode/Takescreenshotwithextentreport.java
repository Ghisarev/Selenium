package com.crm.listenercode;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.BaseClass.BaseClassdws;

public class Takescreenshotwithextentreport extends BaseClassdws implements ITestListener
	{
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	

	@Override
	public void onTestStart(ITestResult result) 
	{
		String name=result.getMethod().getMethodName();
		test=report.createTest(name);
		test.log(Status.INFO, "welcome .....");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{	
		
		test.log(Status.PASS,"your test case is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		test.log(Status.FAIL,"is Failed");
		//logic to take screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		String from=ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{	
		
		String name=result.getMethod().getMethodName();
		System.out.println("onTestSkipped");
		test.log(Status.SKIP,name+"is skip");
	}

	@Override
	public void onStart(ITestContext context) 
	{

		File path=new File("./ExtentReport/sample2.html");
		spark=new 	ExtentSparkReporter(path);
		spark.config().setDocumentTitle("DemoWorkshop");
		spark.config().setReportName("Vaishnavi");
		spark.config().setTheme(Theme.DARK);
		//attach the spark report to extent report
		report=new ExtentReports();
		report.setSystemInfo("os", "windows 10");
		report.setSystemInfo("browser", "chrome");
		report.attachReporter(spark);
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("onFinish");
		report.flush();
	}


}
