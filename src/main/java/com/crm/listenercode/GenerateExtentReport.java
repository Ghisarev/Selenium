package com.crm.listenercode;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReport implements ITestListener
{
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	

	@Override
	public void onTestStart(ITestResult result) 
	{
		String name=result.getMethod().getMethodName();
		test=report.createTest(name);
		System.out.println("OnTEstStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{	
		System.out.println("onTestSuccess");
		String name=result.getMethod().getMethodName();
		System.out.println("onTestSuccess");
		test.log(Status.PASS,name+"is skip");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String name=result.getMethod().getMethodName();
		
		System.out.println("onTestFailure");
		
		test.log(Status.FAIL,name+"is Failed");
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

		File path=new File("./ExtentReport/sample1.html");
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
