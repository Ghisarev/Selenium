package Extent_report;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport
	{
		@Test
		public void launchtheReport()
		{
			
			ExtentReports report =new ExtentReports();
			//create folder and add file name to save tht file in the folder
			File path=new File("./ExtentReport/sample.html");
			ExtentSparkReporter spark=new 	ExtentSparkReporter(path);
			spark.config().setDocumentTitle("Qspider");
			spark.config().setReportName("Vaishnavi");
			spark.config().setTheme(Theme.DARK);
			//attach the spark report to extent report
			report.attachReporter(spark);
			report.setSystemInfo("os", "windows 10");
			report.setSystemInfo("browser", "chrome");
			//create the test case
			ExtentTest test1=report.createTest("test1");
			test1.log(Status.FAIL, "login function error");
			//to save the report
			report.flush();
			
		}

}
