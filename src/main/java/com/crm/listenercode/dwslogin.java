package com.crm.listenercode;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class dwslogin implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("OnTestStart");
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("OnTestSuccess");
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("OnTestFailure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("OnTestSkipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("onTestFailedButWithinSuccessPercentage");
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("onTestFailedWithTimeout");	
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("onStart");	

	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("onFinish");	
		
	}

}
