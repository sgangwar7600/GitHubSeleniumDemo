package com.qa.util;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReporterNG implements IReporter {

	private ExtentReports extent;
	ExtentTest logger;
	Utility utilobj = new Utility();

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
			String outputDirectory) {
		extent = new ExtentReports(outputDirectory + File.separator
				+ "Extent.html", true, DisplayOrder.OLDEST_FIRST);

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				buildTestNodes(context.getPassedTests(), LogStatus.PASS);
				buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
				
			}
		}

		extent.flush();
		extent.close();
	}

	/*private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				test = extent.startTest(result.getMethod().getMethodName());

				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) {
					test.log(status, result.getThrowable());
				} else {
					test.log(status, "Test " + status.toString().toLowerCase()
							+ "ed");
				}

				extent.endTest(test);
			}
		}
	}

	public void logScreenshot(WebDriver driver) throws IOException{
	try{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("sample.jpg"));
		ExtentTest logger=this.

		logger.fail("Attatched Screenshot").addScreenCaptureFromPath("sample.jpg");

	}
	catch(Exception ex){

	}
}*/

	private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;
		System.out.println("------------buildTestNodes");                
		if (tests.size() > 0) {
			System.out.println(tests.size());

			for (ITestResult result : tests.getAllResults()) {

				test = extent.startTest(result.getMethod().getMethodName());
				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) {
					Map<String,String> functionality=Constant.getFuncnctionlity(result.getName());
					System.out.println(result.getName()+" "+functionality.size());
					for(String key:functionality.keySet()){
						System.out.println(result.getName()+"-"+key);
						test.log(status,key+"-"+functionality.get(key),status.name());
					}
					test.log(status, result.getThrowable());
					
				} else {
					//                  //                test.log(status, "Test " + status.toString().toLowerCase()
					//                                                  + "ed");
					//                                  
					//                                  test.log(status, "Test1 " + status.toString().toLowerCase()
					//                                                + "ed");
					Map<String,String> functionality=Constant.getFuncnctionlity(result.getName());
					System.out.println(result.getName()+" "+functionality.size());
					for(String key:functionality.keySet()){
						System.out.println(result.getName()+"-"+key);
						test.log(status,key+"-"+functionality.get(key),status.name());
					}

				}

				extent.endTest(test);
			}
		}
	}

	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}



}

