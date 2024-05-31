package com.crm.listenercode;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenerRetry implements IRetryAnalyzer
	{

	@Override
	public boolean retry(ITestResult result) 
	{
		int start=0;int end=2;
		if(start<end)
		{
			start++;
			return true;
		}
		return false;
	
	
	}
		

}
